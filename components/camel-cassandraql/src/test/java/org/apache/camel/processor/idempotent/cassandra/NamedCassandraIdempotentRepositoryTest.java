/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor.idempotent.cassandra;

import org.apache.camel.component.cassandra.BaseCassandraTest;
import org.apache.camel.component.cassandra.CassandraCQLUnit;
import org.apache.camel.component.cassandra.CassandraUnitUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for {@link CassandraIdempotentRepository}
 */
public class NamedCassandraIdempotentRepositoryTest extends BaseCassandraTest {

    @RegisterExtension
    static CassandraCQLUnit cassandra = CassandraUnitUtils.cassandraCQLUnit("NamedIdempotentDataSet.cql");

    private CassandraIdempotentRepository idempotentRepository;

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        idempotentRepository = new NamedCassandraIdempotentRepository(cassandra.cluster, CassandraUnitUtils.KEYSPACE, "ID");
        idempotentRepository.setTable("NAMED_CAMEL_IDEMPOTENT");
        idempotentRepository.start();
        super.setUp();
    }

    @Override
    @AfterEach
    public void tearDown() throws Exception {
        idempotentRepository.stop();
        super.tearDown();
    }

    private boolean exists(String key) {
        return cassandra.session.execute("select KEY from NAMED_CAMEL_IDEMPOTENT where NAME=? and KEY=?", "ID", key).one() != null;
    }

    @Test
    public void testAddNotExists() {
        // Given
        String key = "Add_NotExists";
        assertFalse(exists(key));
        // When
        boolean result = idempotentRepository.add(key);
        // Then
        assertTrue(result);
        assertTrue(exists(key));
    }

    @Test
    public void testAddExists() {
        // Given
        String key = "Add_Exists";
        assertTrue(exists(key));
        // When
        boolean result = idempotentRepository.add(key);
        // Then
        assertFalse(result);
        assertTrue(exists(key));
    }

    @Test
    public void testContainsNotExists() {
        // Given
        String key = "Contains_NotExists";
        assertFalse(exists(key));
        // When
        boolean result = idempotentRepository.contains(key);
        // Then
        assertFalse(result);
    }

    @Test
    public void testContainsExists() {
        // Given
        String key = "Contains_Exists";
        assertTrue(exists(key));
        // When
        boolean result = idempotentRepository.contains(key);
        // Then
        assertTrue(result);
    }

    @Test
    public void testRemoveNotExists() {
        // Given
        String key = "Remove_NotExists";
        assertFalse(exists(key));
        // When
        boolean result = idempotentRepository.contains(key);
        // Then
        assertFalse(result);
    }

    @Test
    public void testRemoveExists() {
        // Given
        String key = "Remove_Exists";
        assertTrue(exists(key));
        // When
        boolean result = idempotentRepository.remove(key);
        // Then
        assertTrue(result);
    }

    @Test
    public void testClear() {
        // Given
        String key = "Remove_Exists";
        assertTrue(exists(key));
        // When
        idempotentRepository.clear();
        // Then
        assertFalse(idempotentRepository.contains(key));
    }
}

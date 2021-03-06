/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.s3;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AWS2S3ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.aws2.s3.AWS2S3Configuration getOrCreateConfiguration(AWS2S3Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.s3.AWS2S3Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AWS2S3Component target = (AWS2S3Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazons3client":
        case "amazonS3Client": getOrCreateConfiguration(target).setAmazonS3Client(property(camelContext, software.amazon.awssdk.services.s3.S3Client.class, value)); return true;
        case "autocreatebucket":
        case "autoCreateBucket": getOrCreateConfiguration(target).setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "autoclosebody":
        case "autocloseBody": getOrCreateConfiguration(target).setAutocloseBody(property(camelContext, boolean.class, value)); return true;
        case "awskmskeyid":
        case "awsKMSKeyId": getOrCreateConfiguration(target).setAwsKMSKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.s3.AWS2S3Configuration.class, value)); return true;
        case "customeralgorithm":
        case "customerAlgorithm": getOrCreateConfiguration(target).setCustomerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "customerkeyid":
        case "customerKeyId": getOrCreateConfiguration(target).setCustomerKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "customerkeymd5":
        case "customerKeyMD5": getOrCreateConfiguration(target).setCustomerKeyMD5(property(camelContext, java.lang.String.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": getOrCreateConfiguration(target).setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteafterwrite":
        case "deleteAfterWrite": getOrCreateConfiguration(target).setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "delimiter": getOrCreateConfiguration(target).setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationbucket":
        case "destinationBucket": getOrCreateConfiguration(target).setDestinationBucket(property(camelContext, java.lang.String.class, value)); return true;
        case "filename":
        case "fileName": getOrCreateConfiguration(target).setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "includebody":
        case "includeBody": getOrCreateConfiguration(target).setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "includefolders":
        case "includeFolders": getOrCreateConfiguration(target).setIncludeFolders(property(camelContext, boolean.class, value)); return true;
        case "keyname":
        case "keyName": getOrCreateConfiguration(target).setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "moveafterread":
        case "moveAfterRead": getOrCreateConfiguration(target).setMoveAfterRead(property(camelContext, boolean.class, value)); return true;
        case "multipartupload":
        case "multiPartUpload": getOrCreateConfiguration(target).setMultiPartUpload(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.aws2.s3.AWS2S3Operations.class, value)); return true;
        case "overrideendpoint":
        case "overrideEndpoint": getOrCreateConfiguration(target).setOverrideEndpoint(property(camelContext, boolean.class, value)); return true;
        case "partsize":
        case "partSize": getOrCreateConfiguration(target).setPartSize(property(camelContext, long.class, value)); return true;
        case "pojorequest":
        case "pojoRequest": getOrCreateConfiguration(target).setPojoRequest(property(camelContext, boolean.class, value)); return true;
        case "policy": getOrCreateConfiguration(target).setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "prefix": getOrCreateConfiguration(target).setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "storageclass":
        case "storageClass": getOrCreateConfiguration(target).setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "uriendpointoverride":
        case "uriEndpointOverride": getOrCreateConfiguration(target).setUriEndpointOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "useawskms":
        case "useAwsKMS": getOrCreateConfiguration(target).setUseAwsKMS(property(camelContext, boolean.class, value)); return true;
        case "usecustomerkey":
        case "useCustomerKey": getOrCreateConfiguration(target).setUseCustomerKey(property(camelContext, boolean.class, value)); return true;
        case "useiamcredentials":
        case "useIAMCredentials": getOrCreateConfiguration(target).setUseIAMCredentials(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessKey", java.lang.String.class);
        answer.put("amazonS3Client", software.amazon.awssdk.services.s3.S3Client.class);
        answer.put("autoCreateBucket", boolean.class);
        answer.put("autocloseBody", boolean.class);
        answer.put("awsKMSKeyId", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("configuration", org.apache.camel.component.aws2.s3.AWS2S3Configuration.class);
        answer.put("customerAlgorithm", java.lang.String.class);
        answer.put("customerKeyId", java.lang.String.class);
        answer.put("customerKeyMD5", java.lang.String.class);
        answer.put("deleteAfterRead", boolean.class);
        answer.put("deleteAfterWrite", boolean.class);
        answer.put("delimiter", java.lang.String.class);
        answer.put("destinationBucket", java.lang.String.class);
        answer.put("fileName", java.lang.String.class);
        answer.put("includeBody", boolean.class);
        answer.put("includeFolders", boolean.class);
        answer.put("keyName", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("moveAfterRead", boolean.class);
        answer.put("multiPartUpload", boolean.class);
        answer.put("operation", org.apache.camel.component.aws2.s3.AWS2S3Operations.class);
        answer.put("overrideEndpoint", boolean.class);
        answer.put("partSize", long.class);
        answer.put("pojoRequest", boolean.class);
        answer.put("policy", java.lang.String.class);
        answer.put("prefix", java.lang.String.class);
        answer.put("proxyHost", java.lang.String.class);
        answer.put("proxyPort", java.lang.Integer.class);
        answer.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        answer.put("region", java.lang.String.class);
        answer.put("secretKey", java.lang.String.class);
        answer.put("storageClass", java.lang.String.class);
        answer.put("uriEndpointOverride", java.lang.String.class);
        answer.put("useAwsKMS", boolean.class);
        answer.put("useCustomerKey", boolean.class);
        answer.put("useIAMCredentials", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AWS2S3Component target = (AWS2S3Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazons3client":
        case "amazonS3Client": return getOrCreateConfiguration(target).getAmazonS3Client();
        case "autocreatebucket":
        case "autoCreateBucket": return getOrCreateConfiguration(target).isAutoCreateBucket();
        case "autoclosebody":
        case "autocloseBody": return getOrCreateConfiguration(target).isAutocloseBody();
        case "awskmskeyid":
        case "awsKMSKeyId": return getOrCreateConfiguration(target).getAwsKMSKeyId();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "customeralgorithm":
        case "customerAlgorithm": return getOrCreateConfiguration(target).getCustomerAlgorithm();
        case "customerkeyid":
        case "customerKeyId": return getOrCreateConfiguration(target).getCustomerKeyId();
        case "customerkeymd5":
        case "customerKeyMD5": return getOrCreateConfiguration(target).getCustomerKeyMD5();
        case "deleteafterread":
        case "deleteAfterRead": return getOrCreateConfiguration(target).isDeleteAfterRead();
        case "deleteafterwrite":
        case "deleteAfterWrite": return getOrCreateConfiguration(target).isDeleteAfterWrite();
        case "delimiter": return getOrCreateConfiguration(target).getDelimiter();
        case "destinationbucket":
        case "destinationBucket": return getOrCreateConfiguration(target).getDestinationBucket();
        case "filename":
        case "fileName": return getOrCreateConfiguration(target).getFileName();
        case "includebody":
        case "includeBody": return getOrCreateConfiguration(target).isIncludeBody();
        case "includefolders":
        case "includeFolders": return getOrCreateConfiguration(target).isIncludeFolders();
        case "keyname":
        case "keyName": return getOrCreateConfiguration(target).getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "moveafterread":
        case "moveAfterRead": return getOrCreateConfiguration(target).isMoveAfterRead();
        case "multipartupload":
        case "multiPartUpload": return getOrCreateConfiguration(target).isMultiPartUpload();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "overrideendpoint":
        case "overrideEndpoint": return getOrCreateConfiguration(target).isOverrideEndpoint();
        case "partsize":
        case "partSize": return getOrCreateConfiguration(target).getPartSize();
        case "pojorequest":
        case "pojoRequest": return getOrCreateConfiguration(target).isPojoRequest();
        case "policy": return getOrCreateConfiguration(target).getPolicy();
        case "prefix": return getOrCreateConfiguration(target).getPrefix();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "storageclass":
        case "storageClass": return getOrCreateConfiguration(target).getStorageClass();
        case "uriendpointoverride":
        case "uriEndpointOverride": return getOrCreateConfiguration(target).getUriEndpointOverride();
        case "useawskms":
        case "useAwsKMS": return getOrCreateConfiguration(target).isUseAwsKMS();
        case "usecustomerkey":
        case "useCustomerKey": return getOrCreateConfiguration(target).isUseCustomerKey();
        case "useiamcredentials":
        case "useIAMCredentials": return getOrCreateConfiguration(target).isUseIAMCredentials();
        default: return null;
        }
    }
}


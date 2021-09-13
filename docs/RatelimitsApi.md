# RatelimitsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editDomainRatelimits**](RatelimitsApi.md#editDomainRatelimits) | **POST** /api/v1/edit/rl-domain/ | Edit domain ratelimits
[**editMailboxRatelimits**](RatelimitsApi.md#editMailboxRatelimits) | **POST** /api/v1/edit/rl-mbox/ | Edit mailbox ratelimits
[**getDomainRatelimits**](RatelimitsApi.md#getDomainRatelimits) | **GET** /api/v1/get/rl-domain/{domain} | Get domain ratelimits
[**getMailboxRatelimits**](RatelimitsApi.md#getMailboxRatelimits) | **GET** /api/v1/get/rl-mbox/{mailbox} | Get mailbox ratelimits

<a name="editDomainRatelimits"></a>
# **editDomainRatelimits**
> InlineResponse200 editDomainRatelimits(body)

Edit domain ratelimits

Using this endpoint you can edit the ratelimits for a certain domains.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RatelimitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RatelimitsApi apiInstance = new RatelimitsApi();
EditRldomainBody body = new EditRldomainBody(); // EditRldomainBody | 
try {
    InlineResponse200 result = apiInstance.editDomainRatelimits(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatelimitsApi#editDomainRatelimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditRldomainBody**](EditRldomainBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editMailboxRatelimits"></a>
# **editMailboxRatelimits**
> InlineResponse200 editMailboxRatelimits(body)

Edit mailbox ratelimits

Using this endpoint you can edit the ratelimits for a certain mailbox.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RatelimitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RatelimitsApi apiInstance = new RatelimitsApi();
EditRlmboxBody body = new EditRlmboxBody(); // EditRlmboxBody | 
try {
    InlineResponse200 result = apiInstance.editMailboxRatelimits(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatelimitsApi#editMailboxRatelimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditRlmboxBody**](EditRlmboxBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDomainRatelimits"></a>
# **getDomainRatelimits**
> getDomainRatelimits(domain, xAPIKey)

Get domain ratelimits

Using this endpoint you can get the ratelimits for a certain domains. You can use all for all domain.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RatelimitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RatelimitsApi apiInstance = new RatelimitsApi();
String domain = "domain_example"; // String | name of domain or all
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getDomainRatelimits(domain, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling RatelimitsApi#getDomainRatelimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| name of domain or all |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMailboxRatelimits"></a>
# **getMailboxRatelimits**
> getMailboxRatelimits(mailbox, xAPIKey)

Get mailbox ratelimits

Using this endpoint you can get the ratelimits for a certain mailbox. You can use all for all mailboxes.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RatelimitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RatelimitsApi apiInstance = new RatelimitsApi();
String mailbox = "mailbox_example"; // String | name of mailbox or all
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getMailboxRatelimits(mailbox, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling RatelimitsApi#getMailboxRatelimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | **String**| name of mailbox or all |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


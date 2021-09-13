# DomainAntispamPoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomainPolicy**](DomainAntispamPoliciesApi.md#createDomainPolicy) | **POST** /api/v1/add/domain-policy | Create domain policy
[**deleteDomainPolicy**](DomainAntispamPoliciesApi.md#deleteDomainPolicy) | **POST** /api/v1/delete/domain-policy | Delete domain policy
[**listBlacklistDomainPolicy**](DomainAntispamPoliciesApi.md#listBlacklistDomainPolicy) | **GET** /api/v1/get/policy_bl_domain/{domain} | List blacklist domain policy
[**listWhitelistDomainPolicy**](DomainAntispamPoliciesApi.md#listWhitelistDomainPolicy) | **GET** /api/v1/get/policy_wl_domain/{domain} | List whitelist domain policy

<a name="createDomainPolicy"></a>
# **createDomainPolicy**
> InlineResponse200 createDomainPolicy(body)

Create domain policy

You may create your own domain policy using this action. It takes a JSON object containing a domain informations.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainAntispamPoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainAntispamPoliciesApi apiInstance = new DomainAntispamPoliciesApi();
AddDomainpolicyBody body = new AddDomainpolicyBody(); // AddDomainpolicyBody | 
try {
    InlineResponse200 result = apiInstance.createDomainPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainAntispamPoliciesApi#createDomainPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddDomainpolicyBody**](AddDomainpolicyBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDomainPolicy"></a>
# **deleteDomainPolicy**
> InlineResponse200 deleteDomainPolicy(body)

Delete domain policy

You can delete one o more domain policies.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainAntispamPoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainAntispamPoliciesApi apiInstance = new DomainAntispamPoliciesApi();
DeleteDomainpolicyBody body = new DeleteDomainpolicyBody(); // DeleteDomainpolicyBody | 
try {
    InlineResponse200 result = apiInstance.deleteDomainPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainAntispamPoliciesApi#deleteDomainPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteDomainpolicyBody**](DeleteDomainpolicyBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBlacklistDomainPolicy"></a>
# **listBlacklistDomainPolicy**
> listBlacklistDomainPolicy(domain, xAPIKey)

List blacklist domain policy

You can list all blacklist policies per domain.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainAntispamPoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainAntispamPoliciesApi apiInstance = new DomainAntispamPoliciesApi();
String domain = "domain_example"; // String | name of domain
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.listBlacklistDomainPolicy(domain, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainAntispamPoliciesApi#listBlacklistDomainPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| name of domain |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWhitelistDomainPolicy"></a>
# **listWhitelistDomainPolicy**
> listWhitelistDomainPolicy(domain, xAPIKey)

List whitelist domain policy

You can list all whitelist policies per domain.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainAntispamPoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainAntispamPoliciesApi apiInstance = new DomainAntispamPoliciesApi();
String domain = "domain_example"; // String | name of domain
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.listWhitelistDomainPolicy(domain, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainAntispamPoliciesApi#listWhitelistDomainPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| name of domain |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


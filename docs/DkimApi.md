# DkimApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDKIMKey**](DkimApi.md#deleteDKIMKey) | **POST** /api/v1/delete/dkim | Delete DKIM Key
[**duplicateDKIMKey**](DkimApi.md#duplicateDKIMKey) | **POST** /api/v1/add/dkim_duplicate | Duplicate DKIM Key
[**generateDKIMKey**](DkimApi.md#generateDKIMKey) | **POST** /api/v1/add/dkim | Generate DKIM Key
[**getDKIMKey**](DkimApi.md#getDKIMKey) | **GET** /api/v1/get/dkim/{domain} | Get DKIM Key

<a name="deleteDKIMKey"></a>
# **deleteDKIMKey**
> InlineResponse200 deleteDKIMKey(body)

Delete DKIM Key

Using this endpoint a existing DKIM Key can be deleted

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DkimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DkimApi apiInstance = new DkimApi();
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    InlineResponse200 result = apiInstance.deleteDKIMKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DkimApi#deleteDKIMKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="duplicateDKIMKey"></a>
# **duplicateDKIMKey**
> InlineResponse200 duplicateDKIMKey(body)

Duplicate DKIM Key

Using this endpoint you can duplicate the DKIM Key of one domain.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DkimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DkimApi apiInstance = new DkimApi();
AddDkimDuplicateBody body = new AddDkimDuplicateBody(); // AddDkimDuplicateBody | 
try {
    InlineResponse200 result = apiInstance.duplicateDKIMKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DkimApi#duplicateDKIMKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddDkimDuplicateBody**](AddDkimDuplicateBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generateDKIMKey"></a>
# **generateDKIMKey**
> InlineResponse200 generateDKIMKey(body)

Generate DKIM Key

Using this endpoint you can generate new DKIM keys.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DkimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DkimApi apiInstance = new DkimApi();
AddDkimBody body = new AddDkimBody(); // AddDkimBody | 
try {
    InlineResponse200 result = apiInstance.generateDKIMKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DkimApi#generateDKIMKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddDkimBody**](AddDkimBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDKIMKey"></a>
# **getDKIMKey**
> getDKIMKey(domain, xAPIKey)

Get DKIM Key

Using this endpoint you can get the DKIM public key for a specific domain.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DkimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DkimApi apiInstance = new DkimApi();
String domain = "domain_example"; // String | name of domain
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getDKIMKey(domain, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling DkimApi#getDKIMKey");
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


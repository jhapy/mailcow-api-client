# AliasesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlias**](AliasesApi.md#createAlias) | **POST** /api/v1/add/alias | Create alias
[**deleteAlias**](AliasesApi.md#deleteAlias) | **POST** /api/v1/delete/alias | Delete alias
[**getAliases**](AliasesApi.md#getAliases) | **GET** /api/v1/get/alias/{id} | Get aliases
[**updateAlias**](AliasesApi.md#updateAlias) | **POST** /api/v1/edit/alias | Update alias

<a name="createAlias"></a>
# **createAlias**
> InlineResponse200 createAlias(body)

Create alias

You may create your own mailbox alias using this action. It takes a JSON object containing a domain informations. Only one &#x60;goto*&#x60; option can be used, for ex. if you want learn as spam, then send just &#x60;goto_spam &#x3D; 1&#x60; in request body.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AliasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AliasesApi apiInstance = new AliasesApi();
AddAliasBody body = new AddAliasBody(); // AddAliasBody | 
try {
    InlineResponse200 result = apiInstance.createAlias(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasesApi#createAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddAliasBody**](AddAliasBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlias"></a>
# **deleteAlias**
> InlineResponse200 deleteAlias(body)

Delete alias

You can delete one or more aliases.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AliasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AliasesApi apiInstance = new AliasesApi();
List<String> body = Arrays.asList("body_example"); // List<String> | 
try {
    InlineResponse200 result = apiInstance.deleteAlias(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasesApi#deleteAlias");
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

<a name="getAliases"></a>
# **getAliases**
> getAliases(id, xAPIKey)

Get aliases

You can list mailbox aliases existing in system.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AliasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AliasesApi apiInstance = new AliasesApi();
String id = "id_example"; // String | id of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getAliases(id, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasesApi#getAliases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of entry you want to get | [enum: all, 1, 2, 5, 10]
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAlias"></a>
# **updateAlias**
> InlineResponse200 updateAlias(body)

Update alias

You can update one or more aliases per request. You can also send just attributes you want to change

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AliasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AliasesApi apiInstance = new AliasesApi();
EditAliasBody body = new EditAliasBody(); // EditAliasBody | 
try {
    InlineResponse200 result = apiInstance.updateAlias(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasesApi#updateAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditAliasBody**](EditAliasBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


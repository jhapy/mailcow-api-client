# AddressRewritingApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBCCMap**](AddressRewritingApi.md#createBCCMap) | **POST** /api/v1/add/bcc | Create BCC Map
[**createRecipientMap**](AddressRewritingApi.md#createRecipientMap) | **POST** /api/v1/add/recipient_map | Create Recipient Map
[**deleteBCCMap**](AddressRewritingApi.md#deleteBCCMap) | **POST** /api/v1/delete/bcc | Delete BCC Map
[**deleteRecipientMap**](AddressRewritingApi.md#deleteRecipientMap) | **POST** /api/v1/delete/recipient_map | Delete Recipient Map
[**getBCCMap**](AddressRewritingApi.md#getBCCMap) | **GET** /api/v1/get/bcc/{id} | Get BCC Map
[**getRecipientMap**](AddressRewritingApi.md#getRecipientMap) | **GET** /api/v1/get/recipient_map/{id} | Get Recipient Map

<a name="createBCCMap"></a>
# **createBCCMap**
> InlineResponse200 createBCCMap(body)

Create BCC Map

Using this endpoint you can create a BCC map to forward all mails via a bcc for a given domain.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AddressRewritingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddressRewritingApi apiInstance = new AddressRewritingApi();
AddBccBody body = new AddBccBody(); // AddBccBody | 
try {
    InlineResponse200 result = apiInstance.createBCCMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressRewritingApi#createBCCMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddBccBody**](AddBccBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRecipientMap"></a>
# **createRecipientMap**
> InlineResponse200 createRecipientMap(body)

Create Recipient Map

Using this endpoint you can create a recipient map to forward all mails from one email address to another.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AddressRewritingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddressRewritingApi apiInstance = new AddressRewritingApi();
AddRecipientMapBody body = new AddRecipientMapBody(); // AddRecipientMapBody | 
try {
    InlineResponse200 result = apiInstance.createRecipientMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressRewritingApi#createRecipientMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddRecipientMapBody**](AddRecipientMapBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBCCMap"></a>
# **deleteBCCMap**
> InlineResponse200 deleteBCCMap(body)

Delete BCC Map

Using this endpoint you can delete a BCC map, for this you have to know its ID. You can get the ID using the GET method.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AddressRewritingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddressRewritingApi apiInstance = new AddressRewritingApi();
DeleteBccBody body = new DeleteBccBody(); // DeleteBccBody | 
try {
    InlineResponse200 result = apiInstance.deleteBCCMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressRewritingApi#deleteBCCMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteBccBody**](DeleteBccBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRecipientMap"></a>
# **deleteRecipientMap**
> InlineResponse200 deleteRecipientMap(body)

Delete Recipient Map

Using this endpoint you can delete a recipient map, for this you have to know its ID. You can get the ID using the GET method.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AddressRewritingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddressRewritingApi apiInstance = new AddressRewritingApi();
DeleteRecipientMapBody body = new DeleteRecipientMapBody(); // DeleteRecipientMapBody | 
try {
    InlineResponse200 result = apiInstance.deleteRecipientMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressRewritingApi#deleteRecipientMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteRecipientMapBody**](DeleteRecipientMapBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBCCMap"></a>
# **getBCCMap**
> getBCCMap(id, xAPIKey)

Get BCC Map

Using this endpoint you can get all BCC maps.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AddressRewritingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddressRewritingApi apiInstance = new AddressRewritingApi();
String id = "id_example"; // String | id of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getBCCMap(id, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressRewritingApi#getBCCMap");
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

<a name="getRecipientMap"></a>
# **getRecipientMap**
> getRecipientMap(id, xAPIKey)

Get Recipient Map

Using this endpoint you can get all recipient maps.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AddressRewritingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AddressRewritingApi apiInstance = new AddressRewritingApi();
String id = "id_example"; // String | id of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getRecipientMap(id, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressRewritingApi#getRecipientMap");
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


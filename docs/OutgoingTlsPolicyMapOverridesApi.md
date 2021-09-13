# OutgoingTlsPolicyMapOverridesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTLSPolicyMap**](OutgoingTlsPolicyMapOverridesApi.md#createTLSPolicyMap) | **POST** /api/v1/add/tls-policy-map | Create TLS Policy Map
[**deleteTLSPolicyMap**](OutgoingTlsPolicyMapOverridesApi.md#deleteTLSPolicyMap) | **POST** /api/v1/delete/tls-policy-map | Delete TLS Policy Map
[**getTLSPolicyMap**](OutgoingTlsPolicyMapOverridesApi.md#getTLSPolicyMap) | **GET** /api/v1/get/tls-policy-map/{id} | Get TLS Policy Map

<a name="createTLSPolicyMap"></a>
# **createTLSPolicyMap**
> InlineResponse200 createTLSPolicyMap(body)

Create TLS Policy Map

Using this endpoint you can create a TLS policy map override.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.OutgoingTlsPolicyMapOverridesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

OutgoingTlsPolicyMapOverridesApi apiInstance = new OutgoingTlsPolicyMapOverridesApi();
AddTlspolicymapBody body = new AddTlspolicymapBody(); // AddTlspolicymapBody | 
try {
    InlineResponse200 result = apiInstance.createTLSPolicyMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutgoingTlsPolicyMapOverridesApi#createTLSPolicyMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddTlspolicymapBody**](AddTlspolicymapBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTLSPolicyMap"></a>
# **deleteTLSPolicyMap**
> InlineResponse200 deleteTLSPolicyMap(body)

Delete TLS Policy Map

Using this endpoint you can delete a TLS Policy Map, for this you have to know its ID. You can get the ID using the GET method.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.OutgoingTlsPolicyMapOverridesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

OutgoingTlsPolicyMapOverridesApi apiInstance = new OutgoingTlsPolicyMapOverridesApi();
DeleteTlspolicymapBody body = new DeleteTlspolicymapBody(); // DeleteTlspolicymapBody | 
try {
    InlineResponse200 result = apiInstance.deleteTLSPolicyMap(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutgoingTlsPolicyMapOverridesApi#deleteTLSPolicyMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteTlspolicymapBody**](DeleteTlspolicymapBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTLSPolicyMap"></a>
# **getTLSPolicyMap**
> getTLSPolicyMap(id, xAPIKey)

Get TLS Policy Map

Using this endpoint you can get all TLS policy map override maps.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.OutgoingTlsPolicyMapOverridesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

OutgoingTlsPolicyMapOverridesApi apiInstance = new OutgoingTlsPolicyMapOverridesApi();
String id = "id_example"; // String | id of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getTLSPolicyMap(id, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling OutgoingTlsPolicyMapOverridesApi#getTLSPolicyMap");
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


# RoutingApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSenderDependentTransports**](RoutingApi.md#createSenderDependentTransports) | **POST** /api/v1/add/relayhost | Create Sender-Dependent Transports
[**createTransportMaps**](RoutingApi.md#createTransportMaps) | **POST** /api/v1/add/transport/all | Create Transport Maps
[**deleteSenderDependentTransports**](RoutingApi.md#deleteSenderDependentTransports) | **POST** /api/v1/delete/relayhost | Delete Sender-Dependent Transports
[**deleteTransportMaps**](RoutingApi.md#deleteTransportMaps) | **POST** /api/v1/delete/transport | Delete Transport Maps
[**getSenderDependentTransports**](RoutingApi.md#getSenderDependentTransports) | **GET** /api/v1/get/relayhost/{id} | Get Sender-Dependent Transports
[**getTransportMaps**](RoutingApi.md#getTransportMaps) | **GET** /api/v1/get/transport/{id} | Get Transport Maps

<a name="createSenderDependentTransports"></a>
# **createSenderDependentTransports**
> InlineResponse200 createSenderDependentTransports(body)

Create Sender-Dependent Transports

Using this endpoint you can create Sender-Dependent Transports.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
AddRelayhostBody body = new AddRelayhostBody(); // AddRelayhostBody | 
try {
    InlineResponse200 result = apiInstance.createSenderDependentTransports(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#createSenderDependentTransports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddRelayhostBody**](AddRelayhostBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTransportMaps"></a>
# **createTransportMaps**
> InlineResponse200 createTransportMaps(body)

Create Transport Maps

Using this endpoint you can create Sender-Dependent Transports.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
TransportAllBody body = new TransportAllBody(); // TransportAllBody | 
try {
    InlineResponse200 result = apiInstance.createTransportMaps(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#createTransportMaps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransportAllBody**](TransportAllBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSenderDependentTransports"></a>
# **deleteSenderDependentTransports**
> InlineResponse200 deleteSenderDependentTransports(body)

Delete Sender-Dependent Transports

Using this endpoint you can delete a Sender-Dependent Transport, for this you have to know its ID. You can get the ID using the GET method.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
DeleteRelayhostBody body = new DeleteRelayhostBody(); // DeleteRelayhostBody | 
try {
    InlineResponse200 result = apiInstance.deleteSenderDependentTransports(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteSenderDependentTransports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteRelayhostBody**](DeleteRelayhostBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTransportMaps"></a>
# **deleteTransportMaps**
> InlineResponse200 deleteTransportMaps(body)

Delete Transport Maps

Using this endpoint you can delete a Transport Maps, for this you have to know its ID. You can get the ID using the GET method.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
DeleteTransportBody body = new DeleteTransportBody(); // DeleteTransportBody | 
try {
    InlineResponse200 result = apiInstance.deleteTransportMaps(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteTransportMaps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteTransportBody**](DeleteTransportBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSenderDependentTransports"></a>
# **getSenderDependentTransports**
> getSenderDependentTransports(id, xAPIKey)

Get Sender-Dependent Transports

Using this endpoint you can get all Sender-Dependent Transports.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
String id = "id_example"; // String | id of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getSenderDependentTransports(id, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getSenderDependentTransports");
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

<a name="getTransportMaps"></a>
# **getTransportMaps**
> getTransportMaps(id, xAPIKey)

Get Transport Maps

Using this endpoint you can get all Transport Maps.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
String id = "id_example"; // String | id of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getTransportMaps(id, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getTransportMaps");
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


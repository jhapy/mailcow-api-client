# QueueManagerApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteQueue**](QueueManagerApi.md#deleteQueue) | **POST** /api/v1/delete/mailq | Delete Queue
[**flushQueue**](QueueManagerApi.md#flushQueue) | **POST** /api/v1/edit/mailq | Flush Queue
[**getQueue**](QueueManagerApi.md#getQueue) | **GET** /api/v1/get/mailq/all | Get Queue

<a name="deleteQueue"></a>
# **deleteQueue**
> deleteQueue(body)

Delete Queue

Using this API you can delete the current mail queue. This will delete all mails in it. This API uses the command: &#x60;postsuper -d&#x60;

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.QueueManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

QueueManagerApi apiInstance = new QueueManagerApi();
DeleteMailqBody body = new DeleteMailqBody(); // DeleteMailqBody | 
try {
    apiInstance.deleteQueue(body);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueManagerApi#deleteQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteMailqBody**](DeleteMailqBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="flushQueue"></a>
# **flushQueue**
> flushQueue(body)

Flush Queue

Using this API you can flush the current mail queue. This will try to deliver all mails currently in it. This API uses the command: &#x60;postqueue -f&#x60;

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.QueueManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

QueueManagerApi apiInstance = new QueueManagerApi();
EditMailqBody body = new EditMailqBody(); // EditMailqBody | 
try {
    apiInstance.flushQueue(body);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueManagerApi#flushQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditMailqBody**](EditMailqBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueue"></a>
# **getQueue**
> getQueue()

Get Queue

Get the current mail queue and everything it contains.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.QueueManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

QueueManagerApi apiInstance = new QueueManagerApi();
try {
    apiInstance.getQueue();
} catch (ApiException e) {
    System.err.println("Exception when calling QueueManagerApi#getQueue");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


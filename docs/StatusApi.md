# StatusApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContainerStatus**](StatusApi.md#getContainerStatus) | **GET** /api/v1/get/status/containers | Get container status
[**getSolrStatus**](StatusApi.md#getSolrStatus) | **GET** /api/v1/get/status/solr | Get solr status
[**getVmailStatus**](StatusApi.md#getVmailStatus) | **GET** /api/v1/get/status/vmail | Get vmail status

<a name="getContainerStatus"></a>
# **getContainerStatus**
> getContainerStatus()

Get container status

Using this endpoint you can get the status of all containers and when hey where started and a few other details.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.StatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StatusApi apiInstance = new StatusApi();
try {
    apiInstance.getContainerStatus();
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#getContainerStatus");
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

<a name="getSolrStatus"></a>
# **getSolrStatus**
> getSolrStatus()

Get solr status

Using this endpoint you can get the status of all containers and when hey where started and a few other details.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.StatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StatusApi apiInstance = new StatusApi();
try {
    apiInstance.getSolrStatus();
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#getSolrStatus");
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

<a name="getVmailStatus"></a>
# **getVmailStatus**
> getVmailStatus()

Get vmail status

Using this endpoint you can get the status of the vmail and the amount of used storage.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.StatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StatusApi apiInstance = new StatusApi();
try {
    apiInstance.getVmailStatus();
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#getVmailStatus");
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


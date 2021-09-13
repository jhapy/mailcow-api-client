# FordwardingHostsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addForwardHost**](FordwardingHostsApi.md#addForwardHost) | **POST** /api/v1/add/fwdhost | Add Forward Host
[**deleteForwardHost**](FordwardingHostsApi.md#deleteForwardHost) | **POST** /api/v1/delete/fwdhost | Delete Forward Host
[**getForwardingHosts**](FordwardingHostsApi.md#getForwardingHosts) | **GET** /api/v1/get/fwdhost/all | Get Forwarding Hosts

<a name="addForwardHost"></a>
# **addForwardHost**
> InlineResponse200 addForwardHost(body)

Add Forward Host

Add a new Forwarding host to mailcow. You can chose to enable or disable spam filtering of incoming emails by specifing &#x60;filter_spam&#x60; 0 &#x3D; inactive, 1 &#x3D; active.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.FordwardingHostsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FordwardingHostsApi apiInstance = new FordwardingHostsApi();
AddFwdhostBody body = new AddFwdhostBody(); // AddFwdhostBody | 
try {
    InlineResponse200 result = apiInstance.addForwardHost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FordwardingHostsApi#addForwardHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddFwdhostBody**](AddFwdhostBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteForwardHost"></a>
# **deleteForwardHost**
> InlineResponse200 deleteForwardHost(body)

Delete Forward Host

Using this endpoint you can delete a forwarding host, in order to do so you need to know the IP of the host.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.FordwardingHostsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FordwardingHostsApi apiInstance = new FordwardingHostsApi();
DeleteFwdhostBody body = new DeleteFwdhostBody(); // DeleteFwdhostBody | 
try {
    InlineResponse200 result = apiInstance.deleteForwardHost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FordwardingHostsApi#deleteForwardHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteFwdhostBody**](DeleteFwdhostBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getForwardingHosts"></a>
# **getForwardingHosts**
> getForwardingHosts()

Get Forwarding Hosts

You can list all Forwarding Hosts in your mailcow.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.FordwardingHostsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FordwardingHostsApi apiInstance = new FordwardingHostsApi();
try {
    apiInstance.getForwardingHosts();
} catch (ApiException e) {
    System.err.println("Exception when calling FordwardingHostsApi#getForwardingHosts");
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


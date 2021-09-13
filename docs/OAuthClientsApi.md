# OAuthClientsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOAuthClient**](OAuthClientsApi.md#createOAuthClient) | **POST** /api/v1/add/oauth2-client | Create oAuth Client
[**deleteOAuthClient**](OAuthClientsApi.md#deleteOAuthClient) | **POST** /api/v1/delete/oauth2-client | Delete oAuth Client
[**getOAuthClients**](OAuthClientsApi.md#getOAuthClients) | **GET** /api/v1/get/oauth2-client/{id} | Get oAuth Clients

<a name="createOAuthClient"></a>
# **createOAuthClient**
> InlineResponse200 createOAuthClient(body)

Create oAuth Client

Using this endpoint you can create a oAuth clients.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

OAuthClientsApi apiInstance = new OAuthClientsApi();
AddOauth2clientBody body = new AddOauth2clientBody(); // AddOauth2clientBody | 
try {
    InlineResponse200 result = apiInstance.createOAuthClient(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#createOAuthClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddOauth2clientBody**](AddOauth2clientBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOAuthClient"></a>
# **deleteOAuthClient**
> InlineResponse200 deleteOAuthClient(body)

Delete oAuth Client

Using this endpoint you can delete a oAuth client, for this you have to know its ID. You can get the ID using the GET method.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

OAuthClientsApi apiInstance = new OAuthClientsApi();
DeleteOauth2clientBody body = new DeleteOauth2clientBody(); // DeleteOauth2clientBody | 
try {
    InlineResponse200 result = apiInstance.deleteOAuthClient(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#deleteOAuthClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteOauth2clientBody**](DeleteOauth2clientBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOAuthClients"></a>
# **getOAuthClients**
> getOAuthClients(id, xAPIKey)

Get oAuth Clients

Using this endpoint you can get all oAuth clients.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String id = "id_example"; // String | id of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getOAuthClients(id, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getOAuthClients");
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


# AppPasswordsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAppPassword**](AppPasswordsApi.md#createAppPassword) | **POST** /api/v1/add/app-passwd | Create App Password
[**deleteAppPassword**](AppPasswordsApi.md#deleteAppPassword) | **POST** /api/v1/delete/app-passwd | Delete App Password
[**getAppPassword**](AppPasswordsApi.md#getAppPassword) | **GET** /api/v1/get/app-passwd/all/{mailbox} | Get App Password

<a name="createAppPassword"></a>
# **createAppPassword**
> InlineResponse200 createAppPassword(body)

Create App Password

Using this endpoint you can create a new app password for a specific mailbox.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AppPasswordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AppPasswordsApi apiInstance = new AppPasswordsApi();
AddApppasswdBody body = new AddApppasswdBody(); // AddApppasswdBody | 
try {
    InlineResponse200 result = apiInstance.createAppPassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPasswordsApi#createAppPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddApppasswdBody**](AddApppasswdBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAppPassword"></a>
# **deleteAppPassword**
> InlineResponse200 deleteAppPassword(body)

Delete App Password

Using this endpoint you can delete a single app password.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AppPasswordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AppPasswordsApi apiInstance = new AppPasswordsApi();
DeleteApppasswdBody body = new DeleteApppasswdBody(); // DeleteApppasswdBody | 
try {
    InlineResponse200 result = apiInstance.deleteAppPassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPasswordsApi#deleteAppPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteApppasswdBody**](DeleteApppasswdBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppPassword"></a>
# **getAppPassword**
> getAppPassword(mailbox, xAPIKey)

Get App Password

Using this endpoint you can get all app passwords from a specific mailbox.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.AppPasswordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AppPasswordsApi apiInstance = new AppPasswordsApi();
String mailbox = "mailbox_example"; // String | mailbox of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getAppPassword(mailbox, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AppPasswordsApi#getAppPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailbox** | **String**| mailbox of entry you want to get | [enum: hello@mailcow.email]
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


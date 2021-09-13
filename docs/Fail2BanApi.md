# Fail2BanApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editFail2Ban**](Fail2BanApi.md#editFail2Ban) | **POST** /api/v1/edit/fail2ban | Edit Fail2Ban
[**getFail2BanConfig**](Fail2BanApi.md#getFail2BanConfig) | **GET** /api/v1/get/fail2ban | Get Fail2Ban Config

<a name="editFail2Ban"></a>
# **editFail2Ban**
> InlineResponse200 editFail2Ban(body)

Edit Fail2Ban

Using this endpoint you can edit the Fail2Ban config and black or whitelist new ips.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.Fail2BanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

Fail2BanApi apiInstance = new Fail2BanApi();
EditFail2banBody body = new EditFail2banBody(); // EditFail2banBody | 
try {
    InlineResponse200 result = apiInstance.editFail2Ban(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Fail2BanApi#editFail2Ban");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditFail2banBody**](EditFail2banBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

<a name="getFail2BanConfig"></a>
# **getFail2BanConfig**
> getFail2BanConfig()

Get Fail2Ban Config

Gets the current Fail2Ban configuration.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.Fail2BanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

Fail2BanApi apiInstance = new Fail2BanApi();
try {
    apiInstance.getFail2BanConfig();
} catch (ApiException e) {
    System.err.println("Exception when calling Fail2BanApi#getFail2BanConfig");
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


# QuarantineApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMailsInQuarantine**](QuarantineApi.md#deleteMailsInQuarantine) | **POST** /api/v1/delete/qitem | Delete mails in Quarantine
[**getMailsInQuarantine**](QuarantineApi.md#getMailsInQuarantine) | **GET** /api/v1/get/quarantine/all | Get mails in Quarantine

<a name="deleteMailsInQuarantine"></a>
# **deleteMailsInQuarantine**
> InlineResponse200 deleteMailsInQuarantine(body)

Delete mails in Quarantine

Using this endpoint you can delete a email from quarantine, for this you have to know its ID. You can get the ID using the GET method.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.QuarantineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

QuarantineApi apiInstance = new QuarantineApi();
DeleteQitemBody body = new DeleteQitemBody(); // DeleteQitemBody | 
try {
    InlineResponse200 result = apiInstance.deleteMailsInQuarantine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuarantineApi#deleteMailsInQuarantine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteQitemBody**](DeleteQitemBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMailsInQuarantine"></a>
# **getMailsInQuarantine**
> getMailsInQuarantine()

Get mails in Quarantine

Get all mails that are currently in Quarantine.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.QuarantineApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

QuarantineApi apiInstance = new QuarantineApi();
try {
    apiInstance.getMailsInQuarantine();
} catch (ApiException e) {
    System.err.println("Exception when calling QuarantineApi#getMailsInQuarantine");
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


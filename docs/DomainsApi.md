# DomainsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomain**](DomainsApi.md#createDomain) | **POST** /api/v1/add/domain | Create domain
[**deleteDomain**](DomainsApi.md#deleteDomain) | **POST** /api/v1/delete/domain | Delete domain
[**getDomains**](DomainsApi.md#getDomains) | **GET** /api/v1/get/domain/{id} | Get domains
[**updateDomain**](DomainsApi.md#updateDomain) | **POST** /api/v1/edit/domain | Update domain

<a name="createDomain"></a>
# **createDomain**
> List&lt;DefaultMethodResponse&gt; createDomain(body)

Create domain

You may create your own domain using this action. It takes a JSON object containing a domain informations.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
AddDomainBody body = new AddDomainBody(); // AddDomainBody | 
try {
    List<DefaultMethodResponse> result = apiInstance.createDomain(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#createDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddDomainBody**](AddDomainBody.md)|  | [optional]

### Return type

[**List&lt;DefaultMethodResponse&gt;**](DefaultMethodResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDomain"></a>
# **deleteDomain**
> InlineResponse200 deleteDomain(body)

Delete domain

You can delete one or more domains.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
DeleteDomainBody body = new DeleteDomainBody(); // DeleteDomainBody | 
try {
    InlineResponse200 result = apiInstance.deleteDomain(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#deleteDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteDomainBody**](DeleteDomainBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDomains"></a>
# **getDomains**
> getDomains(id, xAPIKey)

Get domains

You can list all domains existing in system.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
String id = "id_example"; // String | id of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getDomains(id, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#getDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of entry you want to get | [enum: all, mailcow.tld]
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDomain"></a>
# **updateDomain**
> InlineResponse200 updateDomain(body)

Update domain

You can update one or more domains per request. You can also send just attributes you want to change. Example: You can add domain names to items list and in attr object just include &#x60;\&quot;active\&quot;: \&quot;0\&quot;&#x60; to deactivate domains.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
EditDomainBody body = new EditDomainBody(); // EditDomainBody | 
try {
    InlineResponse200 result = apiInstance.updateDomain(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#updateDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditDomainBody**](EditDomainBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*


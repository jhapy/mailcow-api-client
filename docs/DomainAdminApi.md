# DomainAdminApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomainAdminUser**](DomainAdminApi.md#createDomainAdminUser) | **POST** /api/v1/add/domain-admin | Create Domain Admin user
[**deleteDomainAdmin**](DomainAdminApi.md#deleteDomainAdmin) | **POST** /api/v1/delete/domain-admin | Delete Domain Admin
[**editDomainAdminACL**](DomainAdminApi.md#editDomainAdminACL) | **POST** /api/v1/edit/da-acl | Edit Domain Admin ACL
[**editDomainAdminUser**](DomainAdminApi.md#editDomainAdminUser) | **POST** /api/v1/edit/domain-admin | Edit Domain Admin user
[**getDomainAdmins**](DomainAdminApi.md#getDomainAdmins) | **GET** /api/v1/get/domain-admin/all | Get Domain Admins

<a name="createDomainAdminUser"></a>
# **createDomainAdminUser**
> InlineResponse200 createDomainAdminUser(body)

Create Domain Admin user

Using this endpoint you can create a new Domain Admin user. This user has full control over a domain, and can create new mailboxes and aliases.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainAdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainAdminApi apiInstance = new DomainAdminApi();
AddDomainadminBody body = new AddDomainadminBody(); // AddDomainadminBody | 
try {
    InlineResponse200 result = apiInstance.createDomainAdminUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainAdminApi#createDomainAdminUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddDomainadminBody**](AddDomainadminBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDomainAdmin"></a>
# **deleteDomainAdmin**
> InlineResponse200 deleteDomainAdmin(body)

Delete Domain Admin

Using this endpoint a existing Domain Admin user can be deleted.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainAdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainAdminApi apiInstance = new DomainAdminApi();
DeleteDomainadminBody body = new DeleteDomainadminBody(); // DeleteDomainadminBody | 
try {
    InlineResponse200 result = apiInstance.deleteDomainAdmin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainAdminApi#deleteDomainAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteDomainadminBody**](DeleteDomainadminBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editDomainAdminACL"></a>
# **editDomainAdminACL**
> InlineResponse200 editDomainAdminACL(body)

Edit Domain Admin ACL

Using this endpoint you can edit the ACLs of a Domain Admin user. This user has full control over a domain, and can create new mailboxes and aliases.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainAdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainAdminApi apiInstance = new DomainAdminApi();
EditDaaclBody body = new EditDaaclBody(); // EditDaaclBody | 
try {
    InlineResponse200 result = apiInstance.editDomainAdminACL(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainAdminApi#editDomainAdminACL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditDaaclBody**](EditDaaclBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editDomainAdminUser"></a>
# **editDomainAdminUser**
> InlineResponse2001 editDomainAdminUser(body)

Edit Domain Admin user

Using this endpoint you can edit a existing Domain Admin user. This user has full control over a domain, and can create new mailboxes and aliases.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainAdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainAdminApi apiInstance = new DomainAdminApi();
EditDomainadminBody body = new EditDomainadminBody(); // EditDomainadminBody | 
try {
    InlineResponse2001 result = apiInstance.editDomainAdminUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainAdminApi#editDomainAdminUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditDomainadminBody**](EditDomainadminBody.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDomainAdmins"></a>
# **getDomainAdmins**
> getDomainAdmins()

Get Domain Admins

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.DomainAdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DomainAdminApi apiInstance = new DomainAdminApi();
try {
    apiInstance.getDomainAdmins();
} catch (ApiException e) {
    System.err.println("Exception when calling DomainAdminApi#getDomainAdmins");
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


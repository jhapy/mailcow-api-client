# MailboxesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMailbox**](MailboxesApi.md#createMailbox) | **POST** /api/v1/add/mailbox | Create mailbox
[**deleteMailbox**](MailboxesApi.md#deleteMailbox) | **POST** /api/v1/delete/mailbox | Delete mailbox
[**editMailboxSpamFilterScore**](MailboxesApi.md#editMailboxSpamFilterScore) | **POST** /api/v1/edit/spam-score/ | Edit mailbox spam filter score
[**getMailboxes**](MailboxesApi.md#getMailboxes) | **GET** /api/v1/get/mailbox/{id} | Get mailboxes
[**quarantineNotifications**](MailboxesApi.md#quarantineNotifications) | **POST** /api/v1/edit/quarantine_notification | Quarantine Notifications
[**updateMailbox**](MailboxesApi.md#updateMailbox) | **POST** /api/v1/edit/mailbox | Update mailbox
[**updateMailboxACL**](MailboxesApi.md#updateMailboxACL) | **POST** /api/v1/edit/user-acl | Update mailbox ACL
[**updatePushoverSettings**](MailboxesApi.md#updatePushoverSettings) | **POST** /api/v1/edit/pushover | Update Pushover settings

<a name="createMailbox"></a>
# **createMailbox**
> List&lt;DefaultMethodResponse&gt; createMailbox(body)

Create mailbox

You may create your own mailbox using this action. It takes a JSON object containing a domain informations.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.MailboxesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MailboxesApi apiInstance = new MailboxesApi();
AddMailboxBody body = new AddMailboxBody(); // AddMailboxBody | 
try {
    List<DefaultMethodResponse> result = apiInstance.createMailbox(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxesApi#createMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddMailboxBody**](AddMailboxBody.md)|  | [optional]

### Return type

[**List&lt;DefaultMethodResponse&gt;**](DefaultMethodResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMailbox"></a>
# **deleteMailbox**
> InlineResponse200 deleteMailbox(body)

Delete mailbox

You can delete one or more mailboxes.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.MailboxesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MailboxesApi apiInstance = new MailboxesApi();
DeleteMailboxBody body = new DeleteMailboxBody(); // DeleteMailboxBody | 
try {
    InlineResponse200 result = apiInstance.deleteMailbox(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxesApi#deleteMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteMailboxBody**](DeleteMailboxBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editMailboxSpamFilterScore"></a>
# **editMailboxSpamFilterScore**
> InlineResponse200 editMailboxSpamFilterScore(body)

Edit mailbox spam filter score

Using this endpoint you can edit the spam filter score for a certain mailbox.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.MailboxesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MailboxesApi apiInstance = new MailboxesApi();
Object body = null; // Object | 
try {
    InlineResponse200 result = apiInstance.editMailboxSpamFilterScore(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxesApi#editMailboxSpamFilterScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMailboxes"></a>
# **getMailboxes**
> Object getMailboxes(id, xAPIKey)

Get mailboxes

You can list all mailboxes existing in system.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.MailboxesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MailboxesApi apiInstance = new MailboxesApi();
String id = "id_example"; // String | id of entry you want to get
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    Object result = apiInstance.getMailboxes(id, xAPIKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxesApi#getMailboxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of entry you want to get | [enum: all, user@domain.tld]
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="quarantineNotifications"></a>
# **quarantineNotifications**
> quarantineNotifications(body)

Quarantine Notifications

You can update one or more mailboxes per request.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.MailboxesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MailboxesApi apiInstance = new MailboxesApi();
EditQuarantineNotificationBody body = new EditQuarantineNotificationBody(); // EditQuarantineNotificationBody | 
try {
    apiInstance.quarantineNotifications(body);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxesApi#quarantineNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditQuarantineNotificationBody**](EditQuarantineNotificationBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMailbox"></a>
# **updateMailbox**
> InlineResponse200 updateMailbox(body)

Update mailbox

You can update one or more mailboxes per request. You can also send just attributes you want to change

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.MailboxesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MailboxesApi apiInstance = new MailboxesApi();
EditMailboxBody body = new EditMailboxBody(); // EditMailboxBody | 
try {
    InlineResponse200 result = apiInstance.updateMailbox(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxesApi#updateMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditMailboxBody**](EditMailboxBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMailboxACL"></a>
# **updateMailboxACL**
> InlineResponse200 updateMailboxACL(body)

Update mailbox ACL

Using this endpoints its possible to update the ACL&#x27;s for mailboxes

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.MailboxesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MailboxesApi apiInstance = new MailboxesApi();
EditUseraclBody body = new EditUseraclBody(); // EditUseraclBody | 
try {
    InlineResponse200 result = apiInstance.updateMailboxACL(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxesApi#updateMailboxACL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditUseraclBody**](EditUseraclBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePushoverSettings"></a>
# **updatePushoverSettings**
> InlineResponse200 updatePushoverSettings(body)

Update Pushover settings

Using this endpoint it is possible to update the pushover settings for mailboxes

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.MailboxesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MailboxesApi apiInstance = new MailboxesApi();
EditPushoverBody body = new EditPushoverBody(); // EditPushoverBody | 
try {
    InlineResponse200 result = apiInstance.updatePushoverSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailboxesApi#updatePushoverSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditPushoverBody**](EditPushoverBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


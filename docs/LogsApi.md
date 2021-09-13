# LogsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getACMELogs**](LogsApi.md#getACMELogs) | **GET** /api/v1/get/logs/acme/{count} | Get ACME logs
[**getApiLogs**](LogsApi.md#getApiLogs) | **GET** /api/v1/get/logs/api/{count} | Get Api logs
[**getAutodiscoverLogs**](LogsApi.md#getAutodiscoverLogs) | **GET** /api/v1/get/logs/autodiscover/{count} | Get Autodiscover logs
[**getDovecotLogs**](LogsApi.md#getDovecotLogs) | **GET** /api/v1/get/logs/dovecot/{count} | Get Dovecot logs
[**getNetfilterLogs**](LogsApi.md#getNetfilterLogs) | **GET** /api/v1/get/logs/netfilter/{count} | Get Netfilter logs
[**getPostfixLogs**](LogsApi.md#getPostfixLogs) | **GET** /api/v1/get/logs/postfix/{count} | Get Postfix logs
[**getRatelimitLogs**](LogsApi.md#getRatelimitLogs) | **GET** /api/v1/get/logs/ratelimited/{count} | Get Ratelimit logs
[**getRspamdLogs**](LogsApi.md#getRspamdLogs) | **GET** /api/v1/get/logs/rspamd-history/{count} | Get Rspamd logs
[**getSOGoLogs**](LogsApi.md#getSOGoLogs) | **GET** /api/v1/get/logs/sogo/{count} | Get SOGo logs
[**getWatchdogLogs**](LogsApi.md#getWatchdogLogs) | **GET** /api/v1/get/logs/watchdog/{count} | Get Watchdog logs

<a name="getACMELogs"></a>
# **getACMELogs**
> getACMELogs(count, xAPIKey)

Get ACME logs

This Api endpoint lists all ACME logs from issued Lets Enctypts certificates. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getACMELogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getACMELogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getApiLogs"></a>
# **getApiLogs**
> getApiLogs(count, xAPIKey)

Get Api logs

This Api endpoint lists all Api logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getApiLogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getApiLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutodiscoverLogs"></a>
# **getAutodiscoverLogs**
> getAutodiscoverLogs(count, xAPIKey)

Get Autodiscover logs

This Api endpoint lists all Autodiscover logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getAutodiscoverLogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getAutodiscoverLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDovecotLogs"></a>
# **getDovecotLogs**
> getDovecotLogs(count, xAPIKey)

Get Dovecot logs

This Api endpoint lists all Dovecot logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getDovecotLogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getDovecotLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetfilterLogs"></a>
# **getNetfilterLogs**
> getNetfilterLogs(count, xAPIKey)

Get Netfilter logs

This Api endpoint lists all Netfilter logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getNetfilterLogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getNetfilterLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPostfixLogs"></a>
# **getPostfixLogs**
> getPostfixLogs(count, xAPIKey)

Get Postfix logs

This Api endpoint lists all Postfix logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getPostfixLogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getPostfixLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRatelimitLogs"></a>
# **getRatelimitLogs**
> getRatelimitLogs(count, xAPIKey)

Get Ratelimit logs

This Api endpoint lists all Ratelimit logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getRatelimitLogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getRatelimitLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRspamdLogs"></a>
# **getRspamdLogs**
> getRspamdLogs(count, xAPIKey)

Get Rspamd logs

This Api endpoint lists all Rspamd logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getRspamdLogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getRspamdLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSOGoLogs"></a>
# **getSOGoLogs**
> getSOGoLogs(count, xAPIKey)

Get SOGo logs

This Api endpoint lists all SOGo logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getSOGoLogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getSOGoLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWatchdogLogs"></a>
# **getWatchdogLogs**
> getWatchdogLogs(count, xAPIKey)

Get Watchdog logs

This Api endpoint lists all Watchdog logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.LogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

LogsApi apiInstance = new LogsApi();
BigDecimal count = new BigDecimal(); // BigDecimal | Number of logs to return
String xAPIKey = "xAPIKey_example"; // String | e.g. api-key-string
try {
    apiInstance.getWatchdogLogs(count, xAPIKey);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#getWatchdogLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **BigDecimal**| Number of logs to return |
 **xAPIKey** | **String**| e.g. api-key-string | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


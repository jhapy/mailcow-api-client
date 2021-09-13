# SyncJobsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSyncJob**](SyncJobsApi.md#createSyncJob) | **POST** /api/v1/add/syncjob | Create sync job
[**deleteSyncJob**](SyncJobsApi.md#deleteSyncJob) | **POST** /api/v1/delete/syncjob | Delete sync job
[**getSyncJobs**](SyncJobsApi.md#getSyncJobs) | **GET** /api/v1/get/syncjobs/all/no_log | Get sync jobs
[**updateSyncJob**](SyncJobsApi.md#updateSyncJob) | **POST** /api/v1/edit/syncjob | Update sync job

<a name="createSyncJob"></a>
# **createSyncJob**
> InlineResponse200 createSyncJob(body)

Create sync job

You can create new sync job using this action. It takes a JSON object containing a domain informations.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.SyncJobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SyncJobsApi apiInstance = new SyncJobsApi();
AddSyncjobBody body = new AddSyncjobBody(); // AddSyncjobBody | 
try {
    InlineResponse200 result = apiInstance.createSyncJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncJobsApi#createSyncJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddSyncjobBody**](AddSyncjobBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSyncJob"></a>
# **deleteSyncJob**
> InlineResponse200 deleteSyncJob(body)

Delete sync job

You can delete one or more sync jobs.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.SyncJobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SyncJobsApi apiInstance = new SyncJobsApi();
DeleteSyncjobBody body = new DeleteSyncjobBody(); // DeleteSyncjobBody | 
try {
    InlineResponse200 result = apiInstance.deleteSyncJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncJobsApi#deleteSyncJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteSyncjobBody**](DeleteSyncjobBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncJobs"></a>
# **getSyncJobs**
> getSyncJobs()

Get sync jobs

You can list all syn jobs existing in system.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.SyncJobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SyncJobsApi apiInstance = new SyncJobsApi();
try {
    apiInstance.getSyncJobs();
} catch (ApiException e) {
    System.err.println("Exception when calling SyncJobsApi#getSyncJobs");
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

<a name="updateSyncJob"></a>
# **updateSyncJob**
> InlineResponse200 updateSyncJob(body)

Update sync job

You can update one or more sync jobs per request. You can also send just attributes you want to change.

### Example
```java
// Import classes:
//import org.jhapy.mailcow.client.invoker.ApiClient;
//import org.jhapy.mailcow.client.invoker.ApiException;
//import org.jhapy.mailcow.client.invoker.Configuration;
//import org.jhapy.mailcow.client.invoker.auth.*;
//import org.jhapy.mailcow.client.api.SyncJobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SyncJobsApi apiInstance = new SyncJobsApi();
EditSyncjobBody body = new EditSyncjobBody(); // EditSyncjobBody | 
try {
    InlineResponse200 result = apiInstance.updateSyncJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncJobsApi#updateSyncJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EditSyncjobBody**](EditSyncjobBody.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


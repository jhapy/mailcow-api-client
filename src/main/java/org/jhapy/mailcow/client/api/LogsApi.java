package org.jhapy.mailcow.client.api;

import org.jhapy.mailcow.client.invoker.ApiClient;

import java.math.BigDecimal;
import org.jhapy.mailcow.client.model.InlineResponse401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")@Component("org.jhapy.mailcow.client.api.LogsApi")
public class LogsApi {
    private ApiClient apiClient;

    public LogsApi() {
        this(new ApiClient());
    }

    @Autowired
    public LogsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get ACME logs
     * This Api endpoint lists all ACME logs from issued Lets Enctypts certificates. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getACMELogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getACMELogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/acme/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Api logs
     * This Api endpoint lists all Api logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getApiLogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getApiLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/api/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Autodiscover logs
     * This Api endpoint lists all Autodiscover logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getAutodiscoverLogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getAutodiscoverLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/autodiscover/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Dovecot logs
     * This Api endpoint lists all Dovecot logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getDovecotLogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getDovecotLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/dovecot/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Netfilter logs
     * This Api endpoint lists all Netfilter logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getNetfilterLogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getNetfilterLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/netfilter/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Postfix logs
     * This Api endpoint lists all Postfix logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getPostfixLogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getPostfixLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/postfix/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Ratelimit logs
     * This Api endpoint lists all Ratelimit logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getRatelimitLogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getRatelimitLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/ratelimited/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Rspamd logs
     * This Api endpoint lists all Rspamd logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getRspamdLogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getRspamdLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/rspamd-history/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get SOGo logs
     * This Api endpoint lists all SOGo logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getSOGoLogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getSOGoLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/sogo/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Watchdog logs
     * This Api endpoint lists all Watchdog logs. Tip: You can limit how many logs you want to get by using &#x60;/&lt;count&gt;&#x60; at the end of the api url.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param count Number of logs to return
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getWatchdogLogs(BigDecimal count, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling getWatchdogLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("count", count);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/logs/watchdog/{count}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (xAPIKey != null)
            headerParams.add("X-API-Key", apiClient.parameterToString(xAPIKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

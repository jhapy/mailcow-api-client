package org.jhapy.mailcow.client.api;

import org.jhapy.mailcow.client.invoker.ApiClient;

import org.jhapy.mailcow.client.model.EditRldomainBody;
import org.jhapy.mailcow.client.model.EditRlmboxBody;
import org.jhapy.mailcow.client.model.InlineResponse200;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")@Component("org.jhapy.mailcow.client.api.RatelimitsApi")
public class RatelimitsApi {
    private ApiClient apiClient;

    public RatelimitsApi() {
        this(new ApiClient());
    }

    @Autowired
    public RatelimitsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Edit domain ratelimits
     * Using this endpoint you can edit the ratelimits for a certain domains.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param body The body parameter
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 editDomainRatelimits(EditRldomainBody body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/api/v1/edit/rl-domain/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Edit mailbox ratelimits
     * Using this endpoint you can edit the ratelimits for a certain mailbox.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param body The body parameter
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 editMailboxRatelimits(EditRlmboxBody body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/api/v1/edit/rl-mbox/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get domain ratelimits
     * Using this endpoint you can get the ratelimits for a certain domains. You can use all for all domain.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param domain name of domain or all
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getDomainRatelimits(String domain, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling getDomainRatelimits");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain", domain);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/rl-domain/{domain}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get mailbox ratelimits
     * Using this endpoint you can get the ratelimits for a certain mailbox. You can use all for all mailboxes.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param mailbox name of mailbox or all
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getMailboxRatelimits(String mailbox, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'mailbox' is set
        if (mailbox == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailbox' when calling getMailboxRatelimits");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailbox", mailbox);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/rl-mbox/{mailbox}").buildAndExpand(uriVariables).toUriString();
        
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

package org.jhapy.mailcow.client.api;

import org.jhapy.mailcow.client.invoker.ApiClient;

import org.jhapy.mailcow.client.model.AddDomainpolicyBody;
import org.jhapy.mailcow.client.model.DeleteDomainpolicyBody;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")@Component("org.jhapy.mailcow.client.api.DomainAntispamPoliciesApi")
public class DomainAntispamPoliciesApi {
    private ApiClient apiClient;

    public DomainAntispamPoliciesApi() {
        this(new ApiClient());
    }

    @Autowired
    public DomainAntispamPoliciesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create domain policy
     * You may create your own domain policy using this action. It takes a JSON object containing a domain informations.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param body The body parameter
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 createDomainPolicy(AddDomainpolicyBody body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/api/v1/add/domain-policy").build().toUriString();
        
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
     * Delete domain policy
     * You can delete one o more domain policies.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param body The body parameter
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 deleteDomainPolicy(DeleteDomainpolicyBody body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/api/v1/delete/domain-policy").build().toUriString();
        
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
     * List blacklist domain policy
     * You can list all blacklist policies per domain.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param domain name of domain
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void listBlacklistDomainPolicy(String domain, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling listBlacklistDomainPolicy");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain", domain);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/policy_bl_domain/{domain}").buildAndExpand(uriVariables).toUriString();
        
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
     * List whitelist domain policy
     * You can list all whitelist policies per domain.
     * <p><b>401</b> - Unauthorized
     * <p><b>200</b> - OK
     * @param domain name of domain
     * @param xAPIKey e.g. api-key-string
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void listWhitelistDomainPolicy(String domain, String xAPIKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling listWhitelistDomainPolicy");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain", domain);
        String path = UriComponentsBuilder.fromPath("/api/v1/get/policy_wl_domain/{domain}").buildAndExpand(uriVariables).toUriString();
        
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

/*
 * mailcow API
 * mailcow is complete e-mailing solution with advanced antispam, antivirus, nice UI and API.  In order to use this API you have to create a API key and add your IP address to the whitelist of allowed IPs this can be done by logging into the Mailcow UI using your admin account, then go to Configuration > Access > Edit administrator details > API. There you will find a collapsed API menu.  There are two types of API keys   - The read only key can only be used for all get endpoints   - The read write key can be used for all endpoints
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.jhapy.mailcow.client.api;

import org.jhapy.mailcow.client.model.AddAliasBody;
import org.jhapy.mailcow.client.model.EditAliasBody;
import org.jhapy.mailcow.client.model.InlineResponse200;
import org.jhapy.mailcow.client.model.InlineResponse401;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AliasesApi
 */
@Ignore
public class AliasesApiTest {

    private final AliasesApi api = new AliasesApi();

    /**
     * Create alias
     *
     * You may create your own mailbox alias using this action. It takes a JSON object containing a domain informations. Only one &#x60;goto*&#x60; option can be used, for ex. if you want learn as spam, then send just &#x60;goto_spam &#x3D; 1&#x60; in request body.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAliasTest() {
        AddAliasBody body = null;
        InlineResponse200 response = api.createAlias(body);

        // TODO: test validations
    }
    /**
     * Delete alias
     *
     * You can delete one or more aliases.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAliasTest() {
        List<String> body = null;
        InlineResponse200 response = api.deleteAlias(body);

        // TODO: test validations
    }
    /**
     * Get aliases
     *
     * You can list mailbox aliases existing in system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAliasesTest() {
        String id = null;
        String xAPIKey = null;
        api.getAliases(id, xAPIKey);

        // TODO: test validations
    }
    /**
     * Update alias
     *
     * You can update one or more aliases per request. You can also send just attributes you want to change
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAliasTest() {
        EditAliasBody body = null;
        InlineResponse200 response = api.updateAlias(body);

        // TODO: test validations
    }
}
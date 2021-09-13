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

import org.jhapy.mailcow.client.model.AddDkimBody;
import org.jhapy.mailcow.client.model.AddDkimDuplicateBody;
import org.jhapy.mailcow.client.model.InlineResponse200;
import org.jhapy.mailcow.client.model.InlineResponse401;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DkimApi
 */
@Ignore
public class DkimApiTest {

    private final DkimApi api = new DkimApi();

    /**
     * Delete DKIM Key
     *
     * Using this endpoint a existing DKIM Key can be deleted
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDKIMKeyTest() {
        List<String> body = null;
        InlineResponse200 response = api.deleteDKIMKey(body);

        // TODO: test validations
    }
    /**
     * Duplicate DKIM Key
     *
     * Using this endpoint you can duplicate the DKIM Key of one domain.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void duplicateDKIMKeyTest() {
        AddDkimDuplicateBody body = null;
        InlineResponse200 response = api.duplicateDKIMKey(body);

        // TODO: test validations
    }
    /**
     * Generate DKIM Key
     *
     * Using this endpoint you can generate new DKIM keys.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateDKIMKeyTest() {
        AddDkimBody body = null;
        InlineResponse200 response = api.generateDKIMKey(body);

        // TODO: test validations
    }
    /**
     * Get DKIM Key
     *
     * Using this endpoint you can get the DKIM public key for a specific domain.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDKIMKeyTest() {
        String domain = null;
        String xAPIKey = null;
        api.getDKIMKey(domain, xAPIKey);

        // TODO: test validations
    }
}
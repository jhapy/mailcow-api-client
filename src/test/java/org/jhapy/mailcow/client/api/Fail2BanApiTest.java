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

import org.jhapy.mailcow.client.model.EditFail2banBody;
import org.jhapy.mailcow.client.model.InlineResponse200;
import org.jhapy.mailcow.client.model.InlineResponse401;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Fail2BanApi
 */
@Ignore
public class Fail2BanApiTest {

    private final Fail2BanApi api = new Fail2BanApi();

    /**
     * Edit Fail2Ban
     *
     * Using this endpoint you can edit the Fail2Ban config and black or whitelist new ips.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editFail2BanTest() {
        EditFail2banBody body = null;
        InlineResponse200 response = api.editFail2Ban(body);

        // TODO: test validations
    }
    /**
     * Get Fail2Ban Config
     *
     * Gets the current Fail2Ban configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFail2BanConfigTest() {
        api.getFail2BanConfig();

        // TODO: test validations
    }
}
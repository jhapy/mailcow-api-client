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

import org.jhapy.mailcow.client.model.DeleteMailqBody;
import org.jhapy.mailcow.client.model.EditMailqBody;
import org.jhapy.mailcow.client.model.InlineResponse401;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QueueManagerApi
 */
@Ignore
public class QueueManagerApiTest {

    private final QueueManagerApi api = new QueueManagerApi();

    /**
     * Delete Queue
     *
     * Using this API you can delete the current mail queue. This will delete all mails in it. This API uses the command: &#x60;postsuper -d&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteQueueTest() {
        DeleteMailqBody body = null;
        api.deleteQueue(body);

        // TODO: test validations
    }
    /**
     * Flush Queue
     *
     * Using this API you can flush the current mail queue. This will try to deliver all mails currently in it. This API uses the command: &#x60;postqueue -f&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void flushQueueTest() {
        EditMailqBody body = null;
        api.flushQueue(body);

        // TODO: test validations
    }
    /**
     * Get Queue
     *
     * Get the current mail queue and everything it contains.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQueueTest() {
        api.getQueue();

        // TODO: test validations
    }
}
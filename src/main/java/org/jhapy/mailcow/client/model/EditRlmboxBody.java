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

package org.jhapy.mailcow.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.jhapy.mailcow.client.model.Apiv1editrlmboxAttr;
/**
 * EditRlmboxBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class EditRlmboxBody {
  @JsonProperty("attr")
  private Apiv1editrlmboxAttr attr = null;

  @JsonProperty("items")
  private Object items = null;

  public EditRlmboxBody attr(Apiv1editrlmboxAttr attr) {
    this.attr = attr;
    return this;
  }

   /**
   * Get attr
   * @return attr
  **/
  @Schema(description = "")
  public Apiv1editrlmboxAttr getAttr() {
    return attr;
  }

  public void setAttr(Apiv1editrlmboxAttr attr) {
    this.attr = attr;
  }

  public EditRlmboxBody items(Object items) {
    this.items = items;
    return this;
  }

   /**
   * contains list of mailboxes you want to edit the ratelimit of
   * @return items
  **/
  @Schema(description = "contains list of mailboxes you want to edit the ratelimit of")
  public Object getItems() {
    return items;
  }

  public void setItems(Object items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditRlmboxBody editRlmboxBody = (EditRlmboxBody) o;
    return Objects.equals(this.attr, editRlmboxBody.attr) &&
        Objects.equals(this.items, editRlmboxBody.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attr, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditRlmboxBody {\n");
    
    sb.append("    attr: ").append(toIndentedString(attr)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
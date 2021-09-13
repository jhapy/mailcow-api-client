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
/**
 * AddDkimDuplicateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class AddDkimDuplicateBody {
  @JsonProperty("fron_domain")
  private String fronDomain = null;

  @JsonProperty("to_domain")
  private String toDomain = null;

  public AddDkimDuplicateBody fronDomain(String fronDomain) {
    this.fronDomain = fronDomain;
    return this;
  }

   /**
   * the domain where the dkim key should be copied from
   * @return fronDomain
  **/
  @Schema(description = "the domain where the dkim key should be copied from")
  public String getFronDomain() {
    return fronDomain;
  }

  public void setFronDomain(String fronDomain) {
    this.fronDomain = fronDomain;
  }

  public AddDkimDuplicateBody toDomain(String toDomain) {
    this.toDomain = toDomain;
    return this;
  }

   /**
   * the domain where the dkim key should be copied to
   * @return toDomain
  **/
  @Schema(description = "the domain where the dkim key should be copied to")
  public String getToDomain() {
    return toDomain;
  }

  public void setToDomain(String toDomain) {
    this.toDomain = toDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDkimDuplicateBody addDkimDuplicateBody = (AddDkimDuplicateBody) o;
    return Objects.equals(this.fronDomain, addDkimDuplicateBody.fronDomain) &&
        Objects.equals(this.toDomain, addDkimDuplicateBody.toDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fronDomain, toDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDkimDuplicateBody {\n");
    
    sb.append("    fronDomain: ").append(toIndentedString(fronDomain)).append("\n");
    sb.append("    toDomain: ").append(toIndentedString(toDomain)).append("\n");
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
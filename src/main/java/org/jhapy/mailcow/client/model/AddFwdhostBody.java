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
import java.math.BigDecimal;
/**
 * AddFwdhostBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class AddFwdhostBody {
  @JsonProperty("filter_spam")
  private BigDecimal filterSpam = null;

  @JsonProperty("hostname")
  private String hostname = null;

  public AddFwdhostBody filterSpam(BigDecimal filterSpam) {
    this.filterSpam = filterSpam;
    return this;
  }

   /**
   * 1 to enable spam filter, 0 to disable spam filter
   * @return filterSpam
  **/
  @Schema(description = "1 to enable spam filter, 0 to disable spam filter")
  public BigDecimal getFilterSpam() {
    return filterSpam;
  }

  public void setFilterSpam(BigDecimal filterSpam) {
    this.filterSpam = filterSpam;
  }

  public AddFwdhostBody hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * contains the hostname you want to add
   * @return hostname
  **/
  @Schema(description = "contains the hostname you want to add")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFwdhostBody addFwdhostBody = (AddFwdhostBody) o;
    return Objects.equals(this.filterSpam, addFwdhostBody.filterSpam) &&
        Objects.equals(this.hostname, addFwdhostBody.hostname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterSpam, hostname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFwdhostBody {\n");
    
    sb.append("    filterSpam: ").append(toIndentedString(filterSpam)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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
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
 * AddRelayhostBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class AddRelayhostBody {
  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("username")
  private String username = null;

  public AddRelayhostBody hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * the hostname of the smtp server with port
   * @return hostname
  **/
  @Schema(description = "the hostname of the smtp server with port")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public AddRelayhostBody password(String password) {
    this.password = password;
    return this;
  }

   /**
   * the password for the smtp user
   * @return password
  **/
  @Schema(description = "the password for the smtp user")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AddRelayhostBody username(String username) {
    this.username = username;
    return this;
  }

   /**
   * the username used to authenticate
   * @return username
  **/
  @Schema(description = "the username used to authenticate")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRelayhostBody addRelayhostBody = (AddRelayhostBody) o;
    return Objects.equals(this.hostname, addRelayhostBody.hostname) &&
        Objects.equals(this.password, addRelayhostBody.password) &&
        Objects.equals(this.username, addRelayhostBody.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, password, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRelayhostBody {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

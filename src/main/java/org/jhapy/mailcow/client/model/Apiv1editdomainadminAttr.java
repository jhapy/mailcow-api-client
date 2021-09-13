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
import java.util.ArrayList;
import java.util.List;
/**
 * Apiv1editdomainadminAttr
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class Apiv1editdomainadminAttr {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("username_new")
  private String usernameNew = null;

  @JsonProperty("domains")
  private List<String> domains = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("password2")
  private String password2 = null;

  public Apiv1editdomainadminAttr active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * is the domain admin active or not
   * @return active
  **/
  @Schema(description = "is the domain admin active or not")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Apiv1editdomainadminAttr usernameNew(String usernameNew) {
    this.usernameNew = usernameNew;
    return this;
  }

   /**
   * the username of the domain admin, change this to change the username
   * @return usernameNew
  **/
  @Schema(description = "the username of the domain admin, change this to change the username")
  public String getUsernameNew() {
    return usernameNew;
  }

  public void setUsernameNew(String usernameNew) {
    this.usernameNew = usernameNew;
  }

  public Apiv1editdomainadminAttr domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public Apiv1editdomainadminAttr addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<String>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * a list of all domains managed by this domain admin
   * @return domains
  **/
  @Schema(description = "a list of all domains managed by this domain admin")
  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public Apiv1editdomainadminAttr password(String password) {
    this.password = password;
    return this;
  }

   /**
   * the new domain admin user password
   * @return password
  **/
  @Schema(description = "the new domain admin user password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Apiv1editdomainadminAttr password2(String password2) {
    this.password2 = password2;
    return this;
  }

   /**
   * the new domain admin user password for confirmation
   * @return password2
  **/
  @Schema(description = "the new domain admin user password for confirmation")
  public String getPassword2() {
    return password2;
  }

  public void setPassword2(String password2) {
    this.password2 = password2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apiv1editdomainadminAttr apiv1editdomainadminAttr = (Apiv1editdomainadminAttr) o;
    return Objects.equals(this.active, apiv1editdomainadminAttr.active) &&
        Objects.equals(this.usernameNew, apiv1editdomainadminAttr.usernameNew) &&
        Objects.equals(this.domains, apiv1editdomainadminAttr.domains) &&
        Objects.equals(this.password, apiv1editdomainadminAttr.password) &&
        Objects.equals(this.password2, apiv1editdomainadminAttr.password2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, usernameNew, domains, password, password2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apiv1editdomainadminAttr {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    usernameNew: ").append(toIndentedString(usernameNew)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    password2: ").append(toIndentedString(password2)).append("\n");
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

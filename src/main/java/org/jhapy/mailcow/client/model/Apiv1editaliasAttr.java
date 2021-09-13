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
 * Apiv1editaliasAttr
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class Apiv1editaliasAttr {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("goto")
  private String _goto = null;

  @JsonProperty("goto_ham")
  private Boolean gotoHam = null;

  @JsonProperty("goto_null")
  private Boolean gotoNull = null;

  @JsonProperty("goto_spam")
  private Boolean gotoSpam = null;

  @JsonProperty("private_comment")
  private String privateComment = null;

  @JsonProperty("public_comment")
  private String publicComment = null;

  @JsonProperty("sogo_visible")
  private Boolean sogoVisible = null;

  public Apiv1editaliasAttr active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * is alias active or not
   * @return active
  **/
  @Schema(description = "is alias active or not")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Apiv1editaliasAttr address(String address) {
    this.address = address;
    return this;
  }

   /**
   * alias address, for catchall use \&quot;@domain.tld\&quot;
   * @return address
  **/
  @Schema(description = "alias address, for catchall use \"@domain.tld\"")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Apiv1editaliasAttr _goto(String _goto) {
    this._goto = _goto;
    return this;
  }

   /**
   * destination address, comma separated
   * @return _goto
  **/
  @Schema(description = "destination address, comma separated")
  public String getGoto() {
    return _goto;
  }

  public void setGoto(String _goto) {
    this._goto = _goto;
  }

  public Apiv1editaliasAttr gotoHam(Boolean gotoHam) {
    this.gotoHam = gotoHam;
    return this;
  }

   /**
   * learn as ham
   * @return gotoHam
  **/
  @Schema(description = "learn as ham")
  public Boolean isGotoHam() {
    return gotoHam;
  }

  public void setGotoHam(Boolean gotoHam) {
    this.gotoHam = gotoHam;
  }

  public Apiv1editaliasAttr gotoNull(Boolean gotoNull) {
    this.gotoNull = gotoNull;
    return this;
  }

   /**
   * silently ignore
   * @return gotoNull
  **/
  @Schema(description = "silently ignore")
  public Boolean isGotoNull() {
    return gotoNull;
  }

  public void setGotoNull(Boolean gotoNull) {
    this.gotoNull = gotoNull;
  }

  public Apiv1editaliasAttr gotoSpam(Boolean gotoSpam) {
    this.gotoSpam = gotoSpam;
    return this;
  }

   /**
   * learn as spam
   * @return gotoSpam
  **/
  @Schema(description = "learn as spam")
  public Boolean isGotoSpam() {
    return gotoSpam;
  }

  public void setGotoSpam(Boolean gotoSpam) {
    this.gotoSpam = gotoSpam;
  }

  public Apiv1editaliasAttr privateComment(String privateComment) {
    this.privateComment = privateComment;
    return this;
  }

   /**
   * Get privateComment
   * @return privateComment
  **/
  @Schema(description = "")
  public String getPrivateComment() {
    return privateComment;
  }

  public void setPrivateComment(String privateComment) {
    this.privateComment = privateComment;
  }

  public Apiv1editaliasAttr publicComment(String publicComment) {
    this.publicComment = publicComment;
    return this;
  }

   /**
   * Get publicComment
   * @return publicComment
  **/
  @Schema(description = "")
  public String getPublicComment() {
    return publicComment;
  }

  public void setPublicComment(String publicComment) {
    this.publicComment = publicComment;
  }

  public Apiv1editaliasAttr sogoVisible(Boolean sogoVisible) {
    this.sogoVisible = sogoVisible;
    return this;
  }

   /**
   * toggle visibility as selectable sender in SOGo
   * @return sogoVisible
  **/
  @Schema(description = "toggle visibility as selectable sender in SOGo")
  public Boolean isSogoVisible() {
    return sogoVisible;
  }

  public void setSogoVisible(Boolean sogoVisible) {
    this.sogoVisible = sogoVisible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apiv1editaliasAttr apiv1editaliasAttr = (Apiv1editaliasAttr) o;
    return Objects.equals(this.active, apiv1editaliasAttr.active) &&
        Objects.equals(this.address, apiv1editaliasAttr.address) &&
        Objects.equals(this._goto, apiv1editaliasAttr._goto) &&
        Objects.equals(this.gotoHam, apiv1editaliasAttr.gotoHam) &&
        Objects.equals(this.gotoNull, apiv1editaliasAttr.gotoNull) &&
        Objects.equals(this.gotoSpam, apiv1editaliasAttr.gotoSpam) &&
        Objects.equals(this.privateComment, apiv1editaliasAttr.privateComment) &&
        Objects.equals(this.publicComment, apiv1editaliasAttr.publicComment) &&
        Objects.equals(this.sogoVisible, apiv1editaliasAttr.sogoVisible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, address, _goto, gotoHam, gotoNull, gotoSpam, privateComment, publicComment, sogoVisible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apiv1editaliasAttr {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    _goto: ").append(toIndentedString(_goto)).append("\n");
    sb.append("    gotoHam: ").append(toIndentedString(gotoHam)).append("\n");
    sb.append("    gotoNull: ").append(toIndentedString(gotoNull)).append("\n");
    sb.append("    gotoSpam: ").append(toIndentedString(gotoSpam)).append("\n");
    sb.append("    privateComment: ").append(toIndentedString(privateComment)).append("\n");
    sb.append("    publicComment: ").append(toIndentedString(publicComment)).append("\n");
    sb.append("    sogoVisible: ").append(toIndentedString(sogoVisible)).append("\n");
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
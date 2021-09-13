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
 * AddDomainBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class AddDomainBody {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("aliases")
  private BigDecimal aliases = null;

  @JsonProperty("backupmx")
  private Boolean backupmx = null;

  @JsonProperty("defquota")
  private BigDecimal defquota = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("mailboxes")
  private BigDecimal mailboxes = null;

  @JsonProperty("maxquota")
  private BigDecimal maxquota = null;

  @JsonProperty("quota")
  private BigDecimal quota = null;

  @JsonProperty("restart_sogo")
  private BigDecimal restartSogo = null;

  @JsonProperty("relay_all_recipients")
  private Boolean relayAllRecipients = null;

  /**
   * Gets or Sets rlFrame
   */
  public enum RlFrameEnum {
    S("s"),
    M("m"),
    H("h"),
    D("d");

    private String value;

    RlFrameEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static RlFrameEnum fromValue(String text) {
      for (RlFrameEnum b : RlFrameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("rl_frame")
  private RlFrameEnum rlFrame = null;

  @JsonProperty("rl_value")
  private BigDecimal rlValue = null;

  @JsonProperty("gal")
  private Boolean gal = null;

  public AddDomainBody active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * is domain active or not
   * @return active
  **/
  @Schema(description = "is domain active or not")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AddDomainBody aliases(BigDecimal aliases) {
    this.aliases = aliases;
    return this;
  }

   /**
   * limit count of aliases associated with this domain
   * @return aliases
  **/
  @Schema(description = "limit count of aliases associated with this domain")
  public BigDecimal getAliases() {
    return aliases;
  }

  public void setAliases(BigDecimal aliases) {
    this.aliases = aliases;
  }

  public AddDomainBody backupmx(Boolean backupmx) {
    this.backupmx = backupmx;
    return this;
  }

   /**
   * relay domain or not
   * @return backupmx
  **/
  @Schema(description = "relay domain or not")
  public Boolean isBackupmx() {
    return backupmx;
  }

  public void setBackupmx(Boolean backupmx) {
    this.backupmx = backupmx;
  }

  public AddDomainBody defquota(BigDecimal defquota) {
    this.defquota = defquota;
    return this;
  }

   /**
   * predefined mailbox quota in &#x60;add mailbox&#x60; form
   * @return defquota
  **/
  @Schema(description = "predefined mailbox quota in `add mailbox` form")
  public BigDecimal getDefquota() {
    return defquota;
  }

  public void setDefquota(BigDecimal defquota) {
    this.defquota = defquota;
  }

  public AddDomainBody description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of domain
   * @return description
  **/
  @Schema(description = "Description of domain")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AddDomainBody domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Fully qualified domain name
   * @return domain
  **/
  @Schema(description = "Fully qualified domain name")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public AddDomainBody mailboxes(BigDecimal mailboxes) {
    this.mailboxes = mailboxes;
    return this;
  }

   /**
   * limit count of mailboxes associated with this domain
   * @return mailboxes
  **/
  @Schema(description = "limit count of mailboxes associated with this domain")
  public BigDecimal getMailboxes() {
    return mailboxes;
  }

  public void setMailboxes(BigDecimal mailboxes) {
    this.mailboxes = mailboxes;
  }

  public AddDomainBody maxquota(BigDecimal maxquota) {
    this.maxquota = maxquota;
    return this;
  }

   /**
   * maximum quota per mailbox
   * @return maxquota
  **/
  @Schema(description = "maximum quota per mailbox")
  public BigDecimal getMaxquota() {
    return maxquota;
  }

  public void setMaxquota(BigDecimal maxquota) {
    this.maxquota = maxquota;
  }

  public AddDomainBody quota(BigDecimal quota) {
    this.quota = quota;
    return this;
  }

   /**
   * maximum quota for this domain (for all mailboxes in sum)
   * @return quota
  **/
  @Schema(description = "maximum quota for this domain (for all mailboxes in sum)")
  public BigDecimal getQuota() {
    return quota;
  }

  public void setQuota(BigDecimal quota) {
    this.quota = quota;
  }

  public AddDomainBody restartSogo(BigDecimal restartSogo) {
    this.restartSogo = restartSogo;
    return this;
  }

   /**
   * restart SOGo to activate the domain in SOGo
   * @return restartSogo
  **/
  @Schema(description = "restart SOGo to activate the domain in SOGo")
  public BigDecimal getRestartSogo() {
    return restartSogo;
  }

  public void setRestartSogo(BigDecimal restartSogo) {
    this.restartSogo = restartSogo;
  }

  public AddDomainBody relayAllRecipients(Boolean relayAllRecipients) {
    this.relayAllRecipients = relayAllRecipients;
    return this;
  }

   /**
   * if not, them you have to create \&quot;dummy\&quot; mailbox for each address to relay
   * @return relayAllRecipients
  **/
  @Schema(description = "if not, them you have to create \"dummy\" mailbox for each address to relay")
  public Boolean isRelayAllRecipients() {
    return relayAllRecipients;
  }

  public void setRelayAllRecipients(Boolean relayAllRecipients) {
    this.relayAllRecipients = relayAllRecipients;
  }

  public AddDomainBody rlFrame(RlFrameEnum rlFrame) {
    this.rlFrame = rlFrame;
    return this;
  }

   /**
   * Get rlFrame
   * @return rlFrame
  **/
  @Schema(description = "")
  public RlFrameEnum getRlFrame() {
    return rlFrame;
  }

  public void setRlFrame(RlFrameEnum rlFrame) {
    this.rlFrame = rlFrame;
  }

  public AddDomainBody rlValue(BigDecimal rlValue) {
    this.rlValue = rlValue;
    return this;
  }

   /**
   * rate limit value
   * @return rlValue
  **/
  @Schema(description = "rate limit value")
  public BigDecimal getRlValue() {
    return rlValue;
  }

  public void setRlValue(BigDecimal rlValue) {
    this.rlValue = rlValue;
  }

  public AddDomainBody gal(Boolean gal) {
    this.gal = gal;
    return this;
  }

   /**
   * Include in Global Address List
   * @return gal
  **/
  @Schema(description = "Include in Global Address List")
  public Boolean isGal() {
    return gal;
  }

  public void setGal(Boolean gal) {
    this.gal = gal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDomainBody addDomainBody = (AddDomainBody) o;
    return Objects.equals(this.active, addDomainBody.active) &&
        Objects.equals(this.aliases, addDomainBody.aliases) &&
        Objects.equals(this.backupmx, addDomainBody.backupmx) &&
        Objects.equals(this.defquota, addDomainBody.defquota) &&
        Objects.equals(this.description, addDomainBody.description) &&
        Objects.equals(this.domain, addDomainBody.domain) &&
        Objects.equals(this.mailboxes, addDomainBody.mailboxes) &&
        Objects.equals(this.maxquota, addDomainBody.maxquota) &&
        Objects.equals(this.quota, addDomainBody.quota) &&
        Objects.equals(this.restartSogo, addDomainBody.restartSogo) &&
        Objects.equals(this.relayAllRecipients, addDomainBody.relayAllRecipients) &&
        Objects.equals(this.rlFrame, addDomainBody.rlFrame) &&
        Objects.equals(this.rlValue, addDomainBody.rlValue) &&
        Objects.equals(this.gal, addDomainBody.gal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, aliases, backupmx, defquota, description, domain, mailboxes, maxquota, quota, restartSogo, relayAllRecipients, rlFrame, rlValue, gal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDomainBody {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    backupmx: ").append(toIndentedString(backupmx)).append("\n");
    sb.append("    defquota: ").append(toIndentedString(defquota)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
    sb.append("    maxquota: ").append(toIndentedString(maxquota)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    restartSogo: ").append(toIndentedString(restartSogo)).append("\n");
    sb.append("    relayAllRecipients: ").append(toIndentedString(relayAllRecipients)).append("\n");
    sb.append("    rlFrame: ").append(toIndentedString(rlFrame)).append("\n");
    sb.append("    rlValue: ").append(toIndentedString(rlValue)).append("\n");
    sb.append("    gal: ").append(toIndentedString(gal)).append("\n");
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

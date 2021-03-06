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
 * AddSyncjobBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class AddSyncjobBody {
  @JsonProperty("parameters")
  private String parameters = null;

  @JsonProperty("host1")
  private String host1 = null;

  @JsonProperty("port1")
  private String port1 = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("enc1")
  private String enc1 = null;

  @JsonProperty("mins_internal")
  private BigDecimal minsInternal = null;

  @JsonProperty("subfolder2")
  private String subfolder2 = null;

  @JsonProperty("maxage")
  private BigDecimal maxage = null;

  @JsonProperty("maxbytespersecond")
  private BigDecimal maxbytespersecond = null;

  @JsonProperty("timeout1")
  private BigDecimal timeout1 = null;

  @JsonProperty("timeout2")
  private BigDecimal timeout2 = null;

  @JsonProperty("exclude")
  private String exclude = null;

  @JsonProperty("custom_params")
  private String customParams = null;

  @JsonProperty("delete2duplicates")
  private Boolean delete2duplicates = null;

  @JsonProperty("delete1")
  private Boolean delete1 = null;

  @JsonProperty("delete2")
  private Boolean delete2 = null;

  @JsonProperty("automap")
  private Boolean automap = null;

  @JsonProperty("skipcrossduplicates")
  private Boolean skipcrossduplicates = null;

  @JsonProperty("subscribeall")
  private Boolean subscribeall = null;

  @JsonProperty("active")
  private Boolean active = null;

  public AddSyncjobBody parameters(String parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * your local mailcow mailbox
   * @return parameters
  **/
  @Schema(description = "your local mailcow mailbox")
  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public AddSyncjobBody host1(String host1) {
    this.host1 = host1;
    return this;
  }

   /**
   * the smtp server where mails should be synced from
   * @return host1
  **/
  @Schema(description = "the smtp server where mails should be synced from")
  public String getHost1() {
    return host1;
  }

  public void setHost1(String host1) {
    this.host1 = host1;
  }

  public AddSyncjobBody port1(String port1) {
    this.port1 = port1;
    return this;
  }

   /**
   * the smtp port of the target mail server
   * @return port1
  **/
  @Schema(description = "the smtp port of the target mail server")
  public String getPort1() {
    return port1;
  }

  public void setPort1(String port1) {
    this.port1 = port1;
  }

  public AddSyncjobBody password(String password) {
    this.password = password;
    return this;
  }

   /**
   * the password of the mailbox
   * @return password
  **/
  @Schema(description = "the password of the mailbox")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AddSyncjobBody enc1(String enc1) {
    this.enc1 = enc1;
    return this;
  }

   /**
   * the encryption method used to connect to the mailserver
   * @return enc1
  **/
  @Schema(description = "the encryption method used to connect to the mailserver")
  public String getEnc1() {
    return enc1;
  }

  public void setEnc1(String enc1) {
    this.enc1 = enc1;
  }

  public AddSyncjobBody minsInternal(BigDecimal minsInternal) {
    this.minsInternal = minsInternal;
    return this;
  }

   /**
   * the interval in which messages should be syned
   * @return minsInternal
  **/
  @Schema(description = "the interval in which messages should be syned")
  public BigDecimal getMinsInternal() {
    return minsInternal;
  }

  public void setMinsInternal(BigDecimal minsInternal) {
    this.minsInternal = minsInternal;
  }

  public AddSyncjobBody subfolder2(String subfolder2) {
    this.subfolder2 = subfolder2;
    return this;
  }

   /**
   * sync into subfolder on destination (empty &#x3D; do not use subfolder)
   * @return subfolder2
  **/
  @Schema(description = "sync into subfolder on destination (empty = do not use subfolder)")
  public String getSubfolder2() {
    return subfolder2;
  }

  public void setSubfolder2(String subfolder2) {
    this.subfolder2 = subfolder2;
  }

  public AddSyncjobBody maxage(BigDecimal maxage) {
    this.maxage = maxage;
    return this;
  }

   /**
   * only sync messages up to this age in days
   * @return maxage
  **/
  @Schema(description = "only sync messages up to this age in days")
  public BigDecimal getMaxage() {
    return maxage;
  }

  public void setMaxage(BigDecimal maxage) {
    this.maxage = maxage;
  }

  public AddSyncjobBody maxbytespersecond(BigDecimal maxbytespersecond) {
    this.maxbytespersecond = maxbytespersecond;
    return this;
  }

   /**
   * max speed transfer limit for the sync
   * @return maxbytespersecond
  **/
  @Schema(description = "max speed transfer limit for the sync")
  public BigDecimal getMaxbytespersecond() {
    return maxbytespersecond;
  }

  public void setMaxbytespersecond(BigDecimal maxbytespersecond) {
    this.maxbytespersecond = maxbytespersecond;
  }

  public AddSyncjobBody timeout1(BigDecimal timeout1) {
    this.timeout1 = timeout1;
    return this;
  }

   /**
   * timeout for connection to remote host
   * @return timeout1
  **/
  @Schema(description = "timeout for connection to remote host")
  public BigDecimal getTimeout1() {
    return timeout1;
  }

  public void setTimeout1(BigDecimal timeout1) {
    this.timeout1 = timeout1;
  }

  public AddSyncjobBody timeout2(BigDecimal timeout2) {
    this.timeout2 = timeout2;
    return this;
  }

   /**
   * timeout for connection to local host
   * @return timeout2
  **/
  @Schema(description = "timeout for connection to local host")
  public BigDecimal getTimeout2() {
    return timeout2;
  }

  public void setTimeout2(BigDecimal timeout2) {
    this.timeout2 = timeout2;
  }

  public AddSyncjobBody exclude(String exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * exclude objects (regex)
   * @return exclude
  **/
  @Schema(description = "exclude objects (regex)")
  public String getExclude() {
    return exclude;
  }

  public void setExclude(String exclude) {
    this.exclude = exclude;
  }

  public AddSyncjobBody customParams(String customParams) {
    this.customParams = customParams;
    return this;
  }

   /**
   * custom parameters
   * @return customParams
  **/
  @Schema(description = "custom parameters")
  public String getCustomParams() {
    return customParams;
  }

  public void setCustomParams(String customParams) {
    this.customParams = customParams;
  }

  public AddSyncjobBody delete2duplicates(Boolean delete2duplicates) {
    this.delete2duplicates = delete2duplicates;
    return this;
  }

   /**
   * delete duplicates on destination (--delete2duplicates)
   * @return delete2duplicates
  **/
  @Schema(description = "delete duplicates on destination (--delete2duplicates)")
  public Boolean isDelete2duplicates() {
    return delete2duplicates;
  }

  public void setDelete2duplicates(Boolean delete2duplicates) {
    this.delete2duplicates = delete2duplicates;
  }

  public AddSyncjobBody delete1(Boolean delete1) {
    this.delete1 = delete1;
    return this;
  }

   /**
   * delete from source when completed (--delete1)
   * @return delete1
  **/
  @Schema(description = "delete from source when completed (--delete1)")
  public Boolean isDelete1() {
    return delete1;
  }

  public void setDelete1(Boolean delete1) {
    this.delete1 = delete1;
  }

  public AddSyncjobBody delete2(Boolean delete2) {
    this.delete2 = delete2;
    return this;
  }

   /**
   * delete messages on destination that are not on source (--delete2)
   * @return delete2
  **/
  @Schema(description = "delete messages on destination that are not on source (--delete2)")
  public Boolean isDelete2() {
    return delete2;
  }

  public void setDelete2(Boolean delete2) {
    this.delete2 = delete2;
  }

  public AddSyncjobBody automap(Boolean automap) {
    this.automap = automap;
    return this;
  }

   /**
   * try to automap folders (\&quot;Sent items\&quot;, \&quot;Sent\&quot; &#x3D;&gt; \&quot;Sent\&quot; etc.) (--automap)
   * @return automap
  **/
  @Schema(description = "try to automap folders (\"Sent items\", \"Sent\" => \"Sent\" etc.) (--automap)")
  public Boolean isAutomap() {
    return automap;
  }

  public void setAutomap(Boolean automap) {
    this.automap = automap;
  }

  public AddSyncjobBody skipcrossduplicates(Boolean skipcrossduplicates) {
    this.skipcrossduplicates = skipcrossduplicates;
    return this;
  }

   /**
   * skip duplicate messages across folders (first come, first serve) (--skipcrossduplicates)
   * @return skipcrossduplicates
  **/
  @Schema(description = "skip duplicate messages across folders (first come, first serve) (--skipcrossduplicates)")
  public Boolean isSkipcrossduplicates() {
    return skipcrossduplicates;
  }

  public void setSkipcrossduplicates(Boolean skipcrossduplicates) {
    this.skipcrossduplicates = skipcrossduplicates;
  }

  public AddSyncjobBody subscribeall(Boolean subscribeall) {
    this.subscribeall = subscribeall;
    return this;
  }

   /**
   * subscribe all folders (--subscribeall)
   * @return subscribeall
  **/
  @Schema(description = "subscribe all folders (--subscribeall)")
  public Boolean isSubscribeall() {
    return subscribeall;
  }

  public void setSubscribeall(Boolean subscribeall) {
    this.subscribeall = subscribeall;
  }

  public AddSyncjobBody active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * enables or disables the sync job
   * @return active
  **/
  @Schema(description = "enables or disables the sync job")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSyncjobBody addSyncjobBody = (AddSyncjobBody) o;
    return Objects.equals(this.parameters, addSyncjobBody.parameters) &&
        Objects.equals(this.host1, addSyncjobBody.host1) &&
        Objects.equals(this.port1, addSyncjobBody.port1) &&
        Objects.equals(this.password, addSyncjobBody.password) &&
        Objects.equals(this.enc1, addSyncjobBody.enc1) &&
        Objects.equals(this.minsInternal, addSyncjobBody.minsInternal) &&
        Objects.equals(this.subfolder2, addSyncjobBody.subfolder2) &&
        Objects.equals(this.maxage, addSyncjobBody.maxage) &&
        Objects.equals(this.maxbytespersecond, addSyncjobBody.maxbytespersecond) &&
        Objects.equals(this.timeout1, addSyncjobBody.timeout1) &&
        Objects.equals(this.timeout2, addSyncjobBody.timeout2) &&
        Objects.equals(this.exclude, addSyncjobBody.exclude) &&
        Objects.equals(this.customParams, addSyncjobBody.customParams) &&
        Objects.equals(this.delete2duplicates, addSyncjobBody.delete2duplicates) &&
        Objects.equals(this.delete1, addSyncjobBody.delete1) &&
        Objects.equals(this.delete2, addSyncjobBody.delete2) &&
        Objects.equals(this.automap, addSyncjobBody.automap) &&
        Objects.equals(this.skipcrossduplicates, addSyncjobBody.skipcrossduplicates) &&
        Objects.equals(this.subscribeall, addSyncjobBody.subscribeall) &&
        Objects.equals(this.active, addSyncjobBody.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, host1, port1, password, enc1, minsInternal, subfolder2, maxage, maxbytespersecond, timeout1, timeout2, exclude, customParams, delete2duplicates, delete1, delete2, automap, skipcrossduplicates, subscribeall, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSyncjobBody {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    host1: ").append(toIndentedString(host1)).append("\n");
    sb.append("    port1: ").append(toIndentedString(port1)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    enc1: ").append(toIndentedString(enc1)).append("\n");
    sb.append("    minsInternal: ").append(toIndentedString(minsInternal)).append("\n");
    sb.append("    subfolder2: ").append(toIndentedString(subfolder2)).append("\n");
    sb.append("    maxage: ").append(toIndentedString(maxage)).append("\n");
    sb.append("    maxbytespersecond: ").append(toIndentedString(maxbytespersecond)).append("\n");
    sb.append("    timeout1: ").append(toIndentedString(timeout1)).append("\n");
    sb.append("    timeout2: ").append(toIndentedString(timeout2)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    customParams: ").append(toIndentedString(customParams)).append("\n");
    sb.append("    delete2duplicates: ").append(toIndentedString(delete2duplicates)).append("\n");
    sb.append("    delete1: ").append(toIndentedString(delete1)).append("\n");
    sb.append("    delete2: ").append(toIndentedString(delete2)).append("\n");
    sb.append("    automap: ").append(toIndentedString(automap)).append("\n");
    sb.append("    skipcrossduplicates: ").append(toIndentedString(skipcrossduplicates)).append("\n");
    sb.append("    subscribeall: ").append(toIndentedString(subscribeall)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

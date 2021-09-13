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
 * array containing the fail2ban settings
 */
@Schema(description = "array containing the fail2ban settings")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class Apiv1editfail2banAttr {
  @JsonProperty("backlist")
  private String backlist = null;

  @JsonProperty("ban_time")
  private BigDecimal banTime = null;

  @JsonProperty("max_attempts")
  private BigDecimal maxAttempts = null;

  @JsonProperty("netban_ipv4")
  private BigDecimal netbanIpv4 = null;

  @JsonProperty("netban_ipv6")
  private BigDecimal netbanIpv6 = null;

  @JsonProperty("retry_window")
  private BigDecimal retryWindow = null;

  @JsonProperty("whitelist")
  private String whitelist = null;

  public Apiv1editfail2banAttr backlist(String backlist) {
    this.backlist = backlist;
    return this;
  }

   /**
   * the backlisted ips or hostnames separated by comma
   * @return backlist
  **/
  @Schema(description = "the backlisted ips or hostnames separated by comma")
  public String getBacklist() {
    return backlist;
  }

  public void setBacklist(String backlist) {
    this.backlist = backlist;
  }

  public Apiv1editfail2banAttr banTime(BigDecimal banTime) {
    this.banTime = banTime;
    return this;
  }

   /**
   * the time a ip should be banned
   * @return banTime
  **/
  @Schema(description = "the time a ip should be banned")
  public BigDecimal getBanTime() {
    return banTime;
  }

  public void setBanTime(BigDecimal banTime) {
    this.banTime = banTime;
  }

  public Apiv1editfail2banAttr maxAttempts(BigDecimal maxAttempts) {
    this.maxAttempts = maxAttempts;
    return this;
  }

   /**
   * the maximum numbe of wrong logins before a ip is banned
   * @return maxAttempts
  **/
  @Schema(description = "the maximum numbe of wrong logins before a ip is banned")
  public BigDecimal getMaxAttempts() {
    return maxAttempts;
  }

  public void setMaxAttempts(BigDecimal maxAttempts) {
    this.maxAttempts = maxAttempts;
  }

  public Apiv1editfail2banAttr netbanIpv4(BigDecimal netbanIpv4) {
    this.netbanIpv4 = netbanIpv4;
    return this;
  }

   /**
   * the networks mask to ban for ipv4
   * @return netbanIpv4
  **/
  @Schema(description = "the networks mask to ban for ipv4")
  public BigDecimal getNetbanIpv4() {
    return netbanIpv4;
  }

  public void setNetbanIpv4(BigDecimal netbanIpv4) {
    this.netbanIpv4 = netbanIpv4;
  }

  public Apiv1editfail2banAttr netbanIpv6(BigDecimal netbanIpv6) {
    this.netbanIpv6 = netbanIpv6;
    return this;
  }

   /**
   * the networks mask to ban for ipv6
   * @return netbanIpv6
  **/
  @Schema(description = "the networks mask to ban for ipv6")
  public BigDecimal getNetbanIpv6() {
    return netbanIpv6;
  }

  public void setNetbanIpv6(BigDecimal netbanIpv6) {
    this.netbanIpv6 = netbanIpv6;
  }

  public Apiv1editfail2banAttr retryWindow(BigDecimal retryWindow) {
    this.retryWindow = retryWindow;
    return this;
  }

   /**
   * the maximum time in which a ip as to login with false credentials to be banned
   * @return retryWindow
  **/
  @Schema(description = "the maximum time in which a ip as to login with false credentials to be banned")
  public BigDecimal getRetryWindow() {
    return retryWindow;
  }

  public void setRetryWindow(BigDecimal retryWindow) {
    this.retryWindow = retryWindow;
  }

  public Apiv1editfail2banAttr whitelist(String whitelist) {
    this.whitelist = whitelist;
    return this;
  }

   /**
   * whitelisted ips or hostnames sepereated by comma
   * @return whitelist
  **/
  @Schema(description = "whitelisted ips or hostnames sepereated by comma")
  public String getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(String whitelist) {
    this.whitelist = whitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apiv1editfail2banAttr apiv1editfail2banAttr = (Apiv1editfail2banAttr) o;
    return Objects.equals(this.backlist, apiv1editfail2banAttr.backlist) &&
        Objects.equals(this.banTime, apiv1editfail2banAttr.banTime) &&
        Objects.equals(this.maxAttempts, apiv1editfail2banAttr.maxAttempts) &&
        Objects.equals(this.netbanIpv4, apiv1editfail2banAttr.netbanIpv4) &&
        Objects.equals(this.netbanIpv6, apiv1editfail2banAttr.netbanIpv6) &&
        Objects.equals(this.retryWindow, apiv1editfail2banAttr.retryWindow) &&
        Objects.equals(this.whitelist, apiv1editfail2banAttr.whitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backlist, banTime, maxAttempts, netbanIpv4, netbanIpv6, retryWindow, whitelist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apiv1editfail2banAttr {\n");
    
    sb.append("    backlist: ").append(toIndentedString(backlist)).append("\n");
    sb.append("    banTime: ").append(toIndentedString(banTime)).append("\n");
    sb.append("    maxAttempts: ").append(toIndentedString(maxAttempts)).append("\n");
    sb.append("    netbanIpv4: ").append(toIndentedString(netbanIpv4)).append("\n");
    sb.append("    netbanIpv6: ").append(toIndentedString(netbanIpv6)).append("\n");
    sb.append("    retryWindow: ").append(toIndentedString(retryWindow)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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
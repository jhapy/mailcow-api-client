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
 * InlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-23T22:25:19.320233+01:00[Africa/Casablanca]")
public class InlineResponse200 {
  @JsonProperty("log")
  private List<Object> log = null;

  @JsonProperty("msg")
  private List<Object> msg = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SUCCESS("success"),
    DANGER("danger"),
    ERROR("error");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  public InlineResponse200 log(List<Object> log) {
    this.log = log;
    return this;
  }

  public InlineResponse200 addLogItem(Object logItem) {
    if (this.log == null) {
      this.log = new ArrayList<Object>();
    }
    this.log.add(logItem);
    return this;
  }

   /**
   * contains request object
   * @return log
  **/
  @Schema(description = "contains request object")
  public List<Object> getLog() {
    return log;
  }

  public void setLog(List<Object> log) {
    this.log = log;
  }

  public InlineResponse200 msg(List<Object> msg) {
    this.msg = msg;
    return this;
  }

  public InlineResponse200 addMsgItem(Object msgItem) {
    if (this.msg == null) {
      this.msg = new ArrayList<Object>();
    }
    this.msg.add(msgItem);
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @Schema(description = "")
  public List<Object> getMsg() {
    return msg;
  }

  public void setMsg(List<Object> msg) {
    this.msg = msg;
  }

  public InlineResponse200 type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.log, inlineResponse200.log) &&
        Objects.equals(this.msg, inlineResponse200.msg) &&
        Objects.equals(this.type, inlineResponse200.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(log, msg, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

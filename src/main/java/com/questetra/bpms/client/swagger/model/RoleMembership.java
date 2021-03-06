/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 11.7.0
 * Contact: support@questetra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.questetra.bpms.client.swagger.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RoleMembership
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T16:27:26.082+09:00")
public class RoleMembership {
  @SerializedName("qroleId")
  private Long qroleId = null;

  @SerializedName("qroleName")
  private String qroleName = null;

  @SerializedName("quserEmail")
  private String quserEmail = null;

  @SerializedName("quserId")
  private Long quserId = null;

  @SerializedName("quserName")
  private String quserName = null;

  public RoleMembership qroleId(Long qroleId) {
    this.qroleId = qroleId;
    return this;
  }

   /**
   * Role ID
   * @return qroleId
  **/
  @ApiModelProperty(example = "1", value = "Role ID")
  public Long getQroleId() {
    return qroleId;
  }

  public void setQroleId(Long qroleId) {
    this.qroleId = qroleId;
  }

  public RoleMembership qroleName(String qroleName) {
    this.qroleName = qroleName;
    return this;
  }

   /**
   * Role name
   * @return qroleName
  **/
  @ApiModelProperty(example = "Role A", value = "Role name")
  public String getQroleName() {
    return qroleName;
  }

  public void setQroleName(String qroleName) {
    this.qroleName = qroleName;
  }

  public RoleMembership quserEmail(String quserEmail) {
    this.quserEmail = quserEmail;
    return this;
  }

   /**
   * User email address
   * @return quserEmail
  **/
  @ApiModelProperty(example = "Maldives@questetra.com", value = "User email address")
  public String getQuserEmail() {
    return quserEmail;
  }

  public void setQuserEmail(String quserEmail) {
    this.quserEmail = quserEmail;
  }

  public RoleMembership quserId(Long quserId) {
    this.quserId = quserId;
    return this;
  }

   /**
   * User ID
   * @return quserId
  **/
  @ApiModelProperty(example = "2", value = "User ID")
  public Long getQuserId() {
    return quserId;
  }

  public void setQuserId(Long quserId) {
    this.quserId = quserId;
  }

  public RoleMembership quserName(String quserName) {
    this.quserName = quserName;
    return this;
  }

   /**
   * User name
   * @return quserName
  **/
  @ApiModelProperty(example = "Maldives", value = "User name")
  public String getQuserName() {
    return quserName;
  }

  public void setQuserName(String quserName) {
    this.quserName = quserName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMembership roleMembership = (RoleMembership) o;
    return Objects.equals(this.qroleId, roleMembership.qroleId) &&
        Objects.equals(this.qroleName, roleMembership.qroleName) &&
        Objects.equals(this.quserEmail, roleMembership.quserEmail) &&
        Objects.equals(this.quserId, roleMembership.quserId) &&
        Objects.equals(this.quserName, roleMembership.quserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qroleId, qroleName, quserEmail, quserId, quserName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMembership {\n");
    
    sb.append("    qroleId: ").append(toIndentedString(qroleId)).append("\n");
    sb.append("    qroleName: ").append(toIndentedString(qroleName)).append("\n");
    sb.append("    quserEmail: ").append(toIndentedString(quserEmail)).append("\n");
    sb.append("    quserId: ").append(toIndentedString(quserId)).append("\n");
    sb.append("    quserName: ").append(toIndentedString(quserName)).append("\n");
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


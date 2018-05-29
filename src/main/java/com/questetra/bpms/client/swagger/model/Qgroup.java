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
 * Qgroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T16:27:26.082+09:00")
public class Qgroup {
  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentQgroupEmail")
  private String parentQgroupEmail = null;

  @SerializedName("parentQgroupId")
  private Long parentQgroupId = null;

  @SerializedName("parentQgroupName")
  private String parentQgroupName = null;

  public Qgroup email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Organization email address
   * @return email
  **/
  @ApiModelProperty(example = "accounting@questetra.com", value = "Organization email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Qgroup id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Organization ID
   * @return id
  **/
  @ApiModelProperty(example = "2", value = "Organization ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Qgroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Organization name
   * @return name
  **/
  @ApiModelProperty(example = "Accounting", value = "Organization name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Qgroup parentQgroupEmail(String parentQgroupEmail) {
    this.parentQgroupEmail = parentQgroupEmail;
    return this;
  }

   /**
   * Parent Organization email address
   * @return parentQgroupEmail
  **/
  @ApiModelProperty(example = "org@questetra.com", value = "Parent Organization email address")
  public String getParentQgroupEmail() {
    return parentQgroupEmail;
  }

  public void setParentQgroupEmail(String parentQgroupEmail) {
    this.parentQgroupEmail = parentQgroupEmail;
  }

  public Qgroup parentQgroupId(Long parentQgroupId) {
    this.parentQgroupId = parentQgroupId;
    return this;
  }

   /**
   * Parent Organization ID
   * @return parentQgroupId
  **/
  @ApiModelProperty(example = "1", value = "Parent Organization ID")
  public Long getParentQgroupId() {
    return parentQgroupId;
  }

  public void setParentQgroupId(Long parentQgroupId) {
    this.parentQgroupId = parentQgroupId;
  }

  public Qgroup parentQgroupName(String parentQgroupName) {
    this.parentQgroupName = parentQgroupName;
    return this;
  }

   /**
   * Parent Organization name
   * @return parentQgroupName
  **/
  @ApiModelProperty(example = "Org", value = "Parent Organization name")
  public String getParentQgroupName() {
    return parentQgroupName;
  }

  public void setParentQgroupName(String parentQgroupName) {
    this.parentQgroupName = parentQgroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qgroup qgroup = (Qgroup) o;
    return Objects.equals(this.email, qgroup.email) &&
        Objects.equals(this.id, qgroup.id) &&
        Objects.equals(this.name, qgroup.name) &&
        Objects.equals(this.parentQgroupEmail, qgroup.parentQgroupEmail) &&
        Objects.equals(this.parentQgroupId, qgroup.parentQgroupId) &&
        Objects.equals(this.parentQgroupName, qgroup.parentQgroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, name, parentQgroupEmail, parentQgroupId, parentQgroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qgroup {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentQgroupEmail: ").append(toIndentedString(parentQgroupEmail)).append("\n");
    sb.append("    parentQgroupId: ").append(toIndentedString(parentQgroupId)).append("\n");
    sb.append("    parentQgroupName: ").append(toIndentedString(parentQgroupName)).append("\n");
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


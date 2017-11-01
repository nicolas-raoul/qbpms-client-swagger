/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 1.0.0
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
import com.questetra.bpms.client.swagger.model.Qrole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QroleList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T00:57:19.411Z")
public class QroleList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("qroles")
  private List<Qrole> qroles = null;

  public QroleList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "20", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public QroleList qroles(List<Qrole> qroles) {
    this.qroles = qroles;
    return this;
  }

  public QroleList addQrolesItem(Qrole qrolesItem) {
    if (this.qroles == null) {
      this.qroles = new ArrayList<Qrole>();
    }
    this.qroles.add(qrolesItem);
    return this;
  }

   /**
   * Get qroles
   * @return qroles
  **/
  @ApiModelProperty(value = "")
  public List<Qrole> getQroles() {
    return qroles;
  }

  public void setQroles(List<Qrole> qroles) {
    this.qroles = qroles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QroleList qroleList = (QroleList) o;
    return Objects.equals(this.count, qroleList.count) &&
        Objects.equals(this.qroles, qroleList.qroles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, qroles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QroleList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    qroles: ").append(toIndentedString(qroles)).append("\n");
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


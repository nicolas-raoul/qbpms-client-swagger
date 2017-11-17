/*
 * Questetra BPM Suite APIs
 * Questetra BPM Suite APIs
 *
 * OpenAPI spec version: 11.5.1
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
import com.questetra.bpms.client.swagger.model.RoleMembership;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RoleMembershipList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T18:15:42.398+09:00")
public class RoleMembershipList {
  @SerializedName("roleMemberships")
  private List<RoleMembership> roleMemberships = null;

  public RoleMembershipList roleMemberships(List<RoleMembership> roleMemberships) {
    this.roleMemberships = roleMemberships;
    return this;
  }

  public RoleMembershipList addRoleMembershipsItem(RoleMembership roleMembershipsItem) {
    if (this.roleMemberships == null) {
      this.roleMemberships = new ArrayList<RoleMembership>();
    }
    this.roleMemberships.add(roleMembershipsItem);
    return this;
  }

   /**
   * Get roleMemberships
   * @return roleMemberships
  **/
  @ApiModelProperty(value = "")
  public List<RoleMembership> getRoleMemberships() {
    return roleMemberships;
  }

  public void setRoleMemberships(List<RoleMembership> roleMemberships) {
    this.roleMemberships = roleMemberships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMembershipList roleMembershipList = (RoleMembershipList) o;
    return Objects.equals(this.roleMemberships, roleMembershipList.roleMemberships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleMemberships);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMembershipList {\n");
    
    sb.append("    roleMemberships: ").append(toIndentedString(roleMemberships)).append("\n");
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


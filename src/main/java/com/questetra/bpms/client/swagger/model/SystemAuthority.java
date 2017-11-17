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
import com.questetra.bpms.client.swagger.model.Qgroup;
import com.questetra.bpms.client.swagger.model.Qrole;
import com.questetra.bpms.client.swagger.model.Quser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SystemAuthority
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T18:15:42.398+09:00")
public class SystemAuthority {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("quser")
  private Quser quser = null;

  @SerializedName("qgroup")
  private Qgroup qgroup = null;

  @SerializedName("leader")
  private Boolean leader = null;

  @SerializedName("descendantQgroups")
  private Boolean descendantQgroups = null;

  @SerializedName("qrole")
  private Qrole qrole = null;

  public SystemAuthority id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * System Authorization ID
   * @return id
  **/
  @ApiModelProperty(example = "2", value = "System Authorization ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SystemAuthority type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization
   * @return type
  **/
  @ApiModelProperty(example = "1", value = "Type of System Authorization 0:System Administrator Authorization 1:App Creator Authorization 2:User Manager Authorization")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public SystemAuthority quser(Quser quser) {
    this.quser = quser;
    return this;
  }

   /**
   * Get quser
   * @return quser
  **/
  @ApiModelProperty(value = "")
  public Quser getQuser() {
    return quser;
  }

  public void setQuser(Quser quser) {
    this.quser = quser;
  }

  public SystemAuthority qgroup(Qgroup qgroup) {
    this.qgroup = qgroup;
    return this;
  }

   /**
   * Get qgroup
   * @return qgroup
  **/
  @ApiModelProperty(value = "")
  public Qgroup getQgroup() {
    return qgroup;
  }

  public void setQgroup(Qgroup qgroup) {
    this.qgroup = qgroup;
  }

  public SystemAuthority leader(Boolean leader) {
    this.leader = leader;
    return this;
  }

   /**
   * 
   * @return leader
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean getLeader() {
    return leader;
  }

  public void setLeader(Boolean leader) {
    this.leader = leader;
  }

  public SystemAuthority descendantQgroups(Boolean descendantQgroups) {
    this.descendantQgroups = descendantQgroups;
    return this;
  }

   /**
   * 
   * @return descendantQgroups
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean getDescendantQgroups() {
    return descendantQgroups;
  }

  public void setDescendantQgroups(Boolean descendantQgroups) {
    this.descendantQgroups = descendantQgroups;
  }

  public SystemAuthority qrole(Qrole qrole) {
    this.qrole = qrole;
    return this;
  }

   /**
   * Get qrole
   * @return qrole
  **/
  @ApiModelProperty(value = "")
  public Qrole getQrole() {
    return qrole;
  }

  public void setQrole(Qrole qrole) {
    this.qrole = qrole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemAuthority systemAuthority = (SystemAuthority) o;
    return Objects.equals(this.id, systemAuthority.id) &&
        Objects.equals(this.type, systemAuthority.type) &&
        Objects.equals(this.quser, systemAuthority.quser) &&
        Objects.equals(this.qgroup, systemAuthority.qgroup) &&
        Objects.equals(this.leader, systemAuthority.leader) &&
        Objects.equals(this.descendantQgroups, systemAuthority.descendantQgroups) &&
        Objects.equals(this.qrole, systemAuthority.qrole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, quser, qgroup, leader, descendantQgroups, qrole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAuthority {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quser: ").append(toIndentedString(quser)).append("\n");
    sb.append("    qgroup: ").append(toIndentedString(qgroup)).append("\n");
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
    sb.append("    descendantQgroups: ").append(toIndentedString(descendantQgroups)).append("\n");
    sb.append("    qrole: ").append(toIndentedString(qrole)).append("\n");
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


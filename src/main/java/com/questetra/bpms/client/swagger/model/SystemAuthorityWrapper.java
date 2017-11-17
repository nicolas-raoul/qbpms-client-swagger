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
import com.questetra.bpms.client.swagger.model.SystemAuthority;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SystemAuthorityWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T18:15:42.398+09:00")
public class SystemAuthorityWrapper {
  @SerializedName("systemAuthority")
  private SystemAuthority systemAuthority = null;

  public SystemAuthorityWrapper systemAuthority(SystemAuthority systemAuthority) {
    this.systemAuthority = systemAuthority;
    return this;
  }

   /**
   * Get systemAuthority
   * @return systemAuthority
  **/
  @ApiModelProperty(value = "")
  public SystemAuthority getSystemAuthority() {
    return systemAuthority;
  }

  public void setSystemAuthority(SystemAuthority systemAuthority) {
    this.systemAuthority = systemAuthority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemAuthorityWrapper systemAuthorityWrapper = (SystemAuthorityWrapper) o;
    return Objects.equals(this.systemAuthority, systemAuthorityWrapper.systemAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemAuthority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAuthorityWrapper {\n");
    
    sb.append("    systemAuthority: ").append(toIndentedString(systemAuthority)).append("\n");
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


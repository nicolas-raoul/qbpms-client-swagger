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
import com.questetra.bpms.client.swagger.model.Workitem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkitemWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T00:57:19.411Z")
public class WorkitemWrapper {
  @SerializedName("workitem")
  private Workitem workitem = null;

  public WorkitemWrapper workitem(Workitem workitem) {
    this.workitem = workitem;
    return this;
  }

   /**
   * Get workitem
   * @return workitem
  **/
  @ApiModelProperty(value = "")
  public Workitem getWorkitem() {
    return workitem;
  }

  public void setWorkitem(Workitem workitem) {
    this.workitem = workitem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemWrapper workitemWrapper = (WorkitemWrapper) o;
    return Objects.equals(this.workitem, workitemWrapper.workitem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workitem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemWrapper {\n");
    
    sb.append("    workitem: ").append(toIndentedString(workitem)).append("\n");
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


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
import com.questetra.bpms.client.swagger.model.Workitem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkitemList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T16:27:26.082+09:00")
public class WorkitemList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("workitems")
  private List<Workitem> workitems = null;

  public WorkitemList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "30", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public WorkitemList workitems(List<Workitem> workitems) {
    this.workitems = workitems;
    return this;
  }

  public WorkitemList addWorkitemsItem(Workitem workitemsItem) {
    if (this.workitems == null) {
      this.workitems = new ArrayList<Workitem>();
    }
    this.workitems.add(workitemsItem);
    return this;
  }

   /**
   * Get workitems
   * @return workitems
  **/
  @ApiModelProperty(value = "")
  public List<Workitem> getWorkitems() {
    return workitems;
  }

  public void setWorkitems(List<Workitem> workitems) {
    this.workitems = workitems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemList workitemList = (WorkitemList) o;
    return Objects.equals(this.count, workitemList.count) &&
        Objects.equals(this.workitems, workitemList.workitems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, workitems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    workitems: ").append(toIndentedString(workitems)).append("\n");
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


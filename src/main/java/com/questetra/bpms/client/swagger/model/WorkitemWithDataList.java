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
import com.questetra.bpms.client.swagger.model.WorkitemWithData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkitemWithDataList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T18:15:42.398+09:00")
public class WorkitemWithDataList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("workitems")
  private List<WorkitemWithData> workitems = null;

  public WorkitemWithDataList count(Integer count) {
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

  public WorkitemWithDataList workitems(List<WorkitemWithData> workitems) {
    this.workitems = workitems;
    return this;
  }

  public WorkitemWithDataList addWorkitemsItem(WorkitemWithData workitemsItem) {
    if (this.workitems == null) {
      this.workitems = new ArrayList<WorkitemWithData>();
    }
    this.workitems.add(workitemsItem);
    return this;
  }

   /**
   * Get workitems
   * @return workitems
  **/
  @ApiModelProperty(value = "")
  public List<WorkitemWithData> getWorkitems() {
    return workitems;
  }

  public void setWorkitems(List<WorkitemWithData> workitems) {
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
    WorkitemWithDataList workitemWithDataList = (WorkitemWithDataList) o;
    return Objects.equals(this.count, workitemWithDataList.count) &&
        Objects.equals(this.workitems, workitemWithDataList.workitems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, workitems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemWithDataList {\n");
    
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


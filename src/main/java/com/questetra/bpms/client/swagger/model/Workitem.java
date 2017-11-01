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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Workitem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T00:57:19.411Z")
public class Workitem {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("allocateDatetime")
  private DateTime allocateDatetime = null;

  @SerializedName("allocatedQuserId")
  private Integer allocatedQuserId = null;

  @SerializedName("allocatedQuserName")
  private String allocatedQuserName = null;

  @SerializedName("allocatedQgroupId")
  private Integer allocatedQgroupId = null;

  @SerializedName("allocatedQgroupName")
  private String allocatedQgroupName = null;

  @SerializedName("endDatetime")
  private DateTime endDatetime = null;

  @SerializedName("nodeName")
  private String nodeName = null;

  @SerializedName("nodeNumber")
  private Integer nodeNumber = null;

  @SerializedName("offerDatetime")
  private DateTime offerDatetime = null;

  @SerializedName("processInstanceEndDatetime")
  private DateTime processInstanceEndDatetime = null;

  @SerializedName("processInstanceIdForView")
  private String processInstanceIdForView = null;

  @SerializedName("processInstanceId")
  private Integer processInstanceId = null;

  @SerializedName("processInstanceSequenceNumber")
  private Integer processInstanceSequenceNumber = null;

  @SerializedName("processInstanceInitQgroupId")
  private Integer processInstanceInitQgroupId = null;

  @SerializedName("processInstanceInitQgroupName")
  private String processInstanceInitQgroupName = null;

  @SerializedName("processInstanceInitQuserId")
  private Integer processInstanceInitQuserId = null;

  @SerializedName("processInstanceInitQuserName")
  private String processInstanceInitQuserName = null;

  @SerializedName("processInstanceStartDatetime")
  private DateTime processInstanceStartDatetime = null;

  @SerializedName("processInstanceState")
  private String processInstanceState = null;

  @SerializedName("processInstanceDebug")
  private Boolean processInstanceDebug = null;

  @SerializedName("processInstanceTitle")
  private String processInstanceTitle = null;

  @SerializedName("processModelInfoId")
  private Integer processModelInfoId = null;

  @SerializedName("processModelInfoName")
  private String processModelInfoName = null;

  @SerializedName("processModelInfoCategory")
  private String processModelInfoCategory = null;

  @SerializedName("processModelVersion")
  private Integer processModelVersion = null;

  @SerializedName("startDatetime")
  private DateTime startDatetime = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("failType")
  private String failType = null;

  @SerializedName("swimlaneType")
  private String swimlaneType = null;

  @SerializedName("timeLimitDatetime")
  private DateTime timeLimitDatetime = null;

  @SerializedName("starred")
  private Boolean starred = null;

  @SerializedName("read")
  private Boolean read = null;

  public Workitem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Task instance ID
   * @return id
  **/
  @ApiModelProperty(example = "58399", value = "Task instance ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Workitem allocateDatetime(DateTime allocateDatetime) {
    this.allocateDatetime = allocateDatetime;
    return this;
  }

   /**
   * Time of Task allocation
   * @return allocateDatetime
  **/
  @ApiModelProperty(example = "2010-08-18T14:03:18+0900", value = "Time of Task allocation")
  public DateTime getAllocateDatetime() {
    return allocateDatetime;
  }

  public void setAllocateDatetime(DateTime allocateDatetime) {
    this.allocateDatetime = allocateDatetime;
  }

  public Workitem allocatedQuserId(Integer allocatedQuserId) {
    this.allocatedQuserId = allocatedQuserId;
    return this;
  }

   /**
   * User ID
   * @return allocatedQuserId
  **/
  @ApiModelProperty(example = "0", value = "User ID")
  public Integer getAllocatedQuserId() {
    return allocatedQuserId;
  }

  public void setAllocatedQuserId(Integer allocatedQuserId) {
    this.allocatedQuserId = allocatedQuserId;
  }

  public Workitem allocatedQuserName(String allocatedQuserName) {
    this.allocatedQuserName = allocatedQuserName;
    return this;
  }

   /**
   * User name
   * @return allocatedQuserName
  **/
  @ApiModelProperty(example = "SouthPole", value = "User name")
  public String getAllocatedQuserName() {
    return allocatedQuserName;
  }

  public void setAllocatedQuserName(String allocatedQuserName) {
    this.allocatedQuserName = allocatedQuserName;
  }

  public Workitem allocatedQgroupId(Integer allocatedQgroupId) {
    this.allocatedQgroupId = allocatedQgroupId;
    return this;
  }

   /**
   * Organization ID
   * @return allocatedQgroupId
  **/
  @ApiModelProperty(value = "Organization ID")
  public Integer getAllocatedQgroupId() {
    return allocatedQgroupId;
  }

  public void setAllocatedQgroupId(Integer allocatedQgroupId) {
    this.allocatedQgroupId = allocatedQgroupId;
  }

  public Workitem allocatedQgroupName(String allocatedQgroupName) {
    this.allocatedQgroupName = allocatedQgroupName;
    return this;
  }

   /**
   * Organization name
   * @return allocatedQgroupName
  **/
  @ApiModelProperty(value = "Organization name")
  public String getAllocatedQgroupName() {
    return allocatedQgroupName;
  }

  public void setAllocatedQgroupName(String allocatedQgroupName) {
    this.allocatedQgroupName = allocatedQgroupName;
  }

  public Workitem endDatetime(DateTime endDatetime) {
    this.endDatetime = endDatetime;
    return this;
  }

   /**
   * Time of Task completion
   * @return endDatetime
  **/
  @ApiModelProperty(value = "Time of Task completion")
  public DateTime getEndDatetime() {
    return endDatetime;
  }

  public void setEndDatetime(DateTime endDatetime) {
    this.endDatetime = endDatetime;
  }

  public Workitem nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Task name
   * @return nodeName
  **/
  @ApiModelProperty(example = "Activity 1", value = "Task name")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public Workitem nodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
    return this;
  }

   /**
   * Task number
   * @return nodeNumber
  **/
  @ApiModelProperty(example = "0", value = "Task number")
  public Integer getNodeNumber() {
    return nodeNumber;
  }

  public void setNodeNumber(Integer nodeNumber) {
    this.nodeNumber = nodeNumber;
  }

  public Workitem offerDatetime(DateTime offerDatetime) {
    this.offerDatetime = offerDatetime;
    return this;
  }

   /**
   * Time of offer
   * @return offerDatetime
  **/
  @ApiModelProperty(example = "2010-08-18T14:03:17+0900", value = "Time of offer")
  public DateTime getOfferDatetime() {
    return offerDatetime;
  }

  public void setOfferDatetime(DateTime offerDatetime) {
    this.offerDatetime = offerDatetime;
  }

  public Workitem processInstanceEndDatetime(DateTime processInstanceEndDatetime) {
    this.processInstanceEndDatetime = processInstanceEndDatetime;
    return this;
  }

   /**
   * Time of Process completion
   * @return processInstanceEndDatetime
  **/
  @ApiModelProperty(value = "Time of Process completion")
  public DateTime getProcessInstanceEndDatetime() {
    return processInstanceEndDatetime;
  }

  public void setProcessInstanceEndDatetime(DateTime processInstanceEndDatetime) {
    this.processInstanceEndDatetime = processInstanceEndDatetime;
  }

  public Workitem processInstanceIdForView(String processInstanceIdForView) {
    this.processInstanceIdForView = processInstanceIdForView;
    return this;
  }

   /**
   * Process ID as string
   * @return processInstanceIdForView
  **/
  @ApiModelProperty(example = "p825", value = "Process ID as string")
  public String getProcessInstanceIdForView() {
    return processInstanceIdForView;
  }

  public void setProcessInstanceIdForView(String processInstanceIdForView) {
    this.processInstanceIdForView = processInstanceIdForView;
  }

  public Workitem processInstanceId(Integer processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Process ID
   * @return processInstanceId
  **/
  @ApiModelProperty(example = "825", value = "Process ID")
  public Integer getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(Integer processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public Workitem processInstanceSequenceNumber(Integer processInstanceSequenceNumber) {
    this.processInstanceSequenceNumber = processInstanceSequenceNumber;
    return this;
  }

   /**
   * Sequence Number in Process Model
   * @return processInstanceSequenceNumber
  **/
  @ApiModelProperty(example = "12", value = "Sequence Number in Process Model")
  public Integer getProcessInstanceSequenceNumber() {
    return processInstanceSequenceNumber;
  }

  public void setProcessInstanceSequenceNumber(Integer processInstanceSequenceNumber) {
    this.processInstanceSequenceNumber = processInstanceSequenceNumber;
  }

  public Workitem processInstanceInitQgroupId(Integer processInstanceInitQgroupId) {
    this.processInstanceInitQgroupId = processInstanceInitQgroupId;
    return this;
  }

   /**
   * Organization ID who started the Process
   * @return processInstanceInitQgroupId
  **/
  @ApiModelProperty(value = "Organization ID who started the Process")
  public Integer getProcessInstanceInitQgroupId() {
    return processInstanceInitQgroupId;
  }

  public void setProcessInstanceInitQgroupId(Integer processInstanceInitQgroupId) {
    this.processInstanceInitQgroupId = processInstanceInitQgroupId;
  }

  public Workitem processInstanceInitQgroupName(String processInstanceInitQgroupName) {
    this.processInstanceInitQgroupName = processInstanceInitQgroupName;
    return this;
  }

   /**
   * Orgazation name who started the Process
   * @return processInstanceInitQgroupName
  **/
  @ApiModelProperty(value = "Orgazation name who started the Process")
  public String getProcessInstanceInitQgroupName() {
    return processInstanceInitQgroupName;
  }

  public void setProcessInstanceInitQgroupName(String processInstanceInitQgroupName) {
    this.processInstanceInitQgroupName = processInstanceInitQgroupName;
  }

  public Workitem processInstanceInitQuserId(Integer processInstanceInitQuserId) {
    this.processInstanceInitQuserId = processInstanceInitQuserId;
    return this;
  }

   /**
   * User ID who started the Process
   * @return processInstanceInitQuserId
  **/
  @ApiModelProperty(example = "0", value = "User ID who started the Process")
  public Integer getProcessInstanceInitQuserId() {
    return processInstanceInitQuserId;
  }

  public void setProcessInstanceInitQuserId(Integer processInstanceInitQuserId) {
    this.processInstanceInitQuserId = processInstanceInitQuserId;
  }

  public Workitem processInstanceInitQuserName(String processInstanceInitQuserName) {
    this.processInstanceInitQuserName = processInstanceInitQuserName;
    return this;
  }

   /**
   * User name who started the Process
   * @return processInstanceInitQuserName
  **/
  @ApiModelProperty(example = "SouthPole", value = "User name who started the Process")
  public String getProcessInstanceInitQuserName() {
    return processInstanceInitQuserName;
  }

  public void setProcessInstanceInitQuserName(String processInstanceInitQuserName) {
    this.processInstanceInitQuserName = processInstanceInitQuserName;
  }

  public Workitem processInstanceStartDatetime(DateTime processInstanceStartDatetime) {
    this.processInstanceStartDatetime = processInstanceStartDatetime;
    return this;
  }

   /**
   * Time of Process start
   * @return processInstanceStartDatetime
  **/
  @ApiModelProperty(example = "2010-08-18T14:03:16+0900", value = "Time of Process start")
  public DateTime getProcessInstanceStartDatetime() {
    return processInstanceStartDatetime;
  }

  public void setProcessInstanceStartDatetime(DateTime processInstanceStartDatetime) {
    this.processInstanceStartDatetime = processInstanceStartDatetime;
  }

  public Workitem processInstanceState(String processInstanceState) {
    this.processInstanceState = processInstanceState;
    return this;
  }

   /**
   * Process Status
   * @return processInstanceState
  **/
  @ApiModelProperty(example = "STARTED", value = "Process Status")
  public String getProcessInstanceState() {
    return processInstanceState;
  }

  public void setProcessInstanceState(String processInstanceState) {
    this.processInstanceState = processInstanceState;
  }

  public Workitem processInstanceDebug(Boolean processInstanceDebug) {
    this.processInstanceDebug = processInstanceDebug;
    return this;
  }

   /**
   * Debug mode
   * @return processInstanceDebug
  **/
  @ApiModelProperty(example = "false", value = "Debug mode")
  public Boolean getProcessInstanceDebug() {
    return processInstanceDebug;
  }

  public void setProcessInstanceDebug(Boolean processInstanceDebug) {
    this.processInstanceDebug = processInstanceDebug;
  }

  public Workitem processInstanceTitle(String processInstanceTitle) {
    this.processInstanceTitle = processInstanceTitle;
    return this;
  }

   /**
   * Process Title
   * @return processInstanceTitle
  **/
  @ApiModelProperty(example = "Process 1", value = "Process Title")
  public String getProcessInstanceTitle() {
    return processInstanceTitle;
  }

  public void setProcessInstanceTitle(String processInstanceTitle) {
    this.processInstanceTitle = processInstanceTitle;
  }

  public Workitem processModelInfoId(Integer processModelInfoId) {
    this.processModelInfoId = processModelInfoId;
    return this;
  }

   /**
   * Process Model ID
   * @return processModelInfoId
  **/
  @ApiModelProperty(example = "9", value = "Process Model ID")
  public Integer getProcessModelInfoId() {
    return processModelInfoId;
  }

  public void setProcessModelInfoId(Integer processModelInfoId) {
    this.processModelInfoId = processModelInfoId;
  }

  public Workitem processModelInfoName(String processModelInfoName) {
    this.processModelInfoName = processModelInfoName;
    return this;
  }

   /**
   * Process Model name
   * @return processModelInfoName
  **/
  @ApiModelProperty(example = "Test App", value = "Process Model name")
  public String getProcessModelInfoName() {
    return processModelInfoName;
  }

  public void setProcessModelInfoName(String processModelInfoName) {
    this.processModelInfoName = processModelInfoName;
  }

  public Workitem processModelInfoCategory(String processModelInfoCategory) {
    this.processModelInfoCategory = processModelInfoCategory;
    return this;
  }

   /**
   * Category of the Process Model
   * @return processModelInfoCategory
  **/
  @ApiModelProperty(example = "Category 1", value = "Category of the Process Model")
  public String getProcessModelInfoCategory() {
    return processModelInfoCategory;
  }

  public void setProcessModelInfoCategory(String processModelInfoCategory) {
    this.processModelInfoCategory = processModelInfoCategory;
  }

  public Workitem processModelVersion(Integer processModelVersion) {
    this.processModelVersion = processModelVersion;
    return this;
  }

   /**
   * Version of the Process Model
   * @return processModelVersion
  **/
  @ApiModelProperty(example = "4", value = "Version of the Process Model")
  public Integer getProcessModelVersion() {
    return processModelVersion;
  }

  public void setProcessModelVersion(Integer processModelVersion) {
    this.processModelVersion = processModelVersion;
  }

  public Workitem startDatetime(DateTime startDatetime) {
    this.startDatetime = startDatetime;
    return this;
  }

   /**
   * Time of Task start
   * @return startDatetime
  **/
  @ApiModelProperty(value = "Time of Task start")
  public DateTime getStartDatetime() {
    return startDatetime;
  }

  public void setStartDatetime(DateTime startDatetime) {
    this.startDatetime = startDatetime;
  }

  public Workitem state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Task Status
   * @return state
  **/
  @ApiModelProperty(example = "ALLOCATED", value = "Task Status")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Workitem failType(String failType) {
    this.failType = failType;
    return this;
  }

   /**
   * Task Fail Type
   * @return failType
  **/
  @ApiModelProperty(value = "Task Fail Type")
  public String getFailType() {
    return failType;
  }

  public void setFailType(String failType) {
    this.failType = failType;
  }

  public Workitem swimlaneType(String swimlaneType) {
    this.swimlaneType = swimlaneType;
    return this;
  }

   /**
   * Swimlane Type
   * @return swimlaneType
  **/
  @ApiModelProperty(example = "NORMAL", value = "Swimlane Type")
  public String getSwimlaneType() {
    return swimlaneType;
  }

  public void setSwimlaneType(String swimlaneType) {
    this.swimlaneType = swimlaneType;
  }

  public Workitem timeLimitDatetime(DateTime timeLimitDatetime) {
    this.timeLimitDatetime = timeLimitDatetime;
    return this;
  }

   /**
   * Time of Task Deadline
   * @return timeLimitDatetime
  **/
  @ApiModelProperty(value = "Time of Task Deadline")
  public DateTime getTimeLimitDatetime() {
    return timeLimitDatetime;
  }

  public void setTimeLimitDatetime(DateTime timeLimitDatetime) {
    this.timeLimitDatetime = timeLimitDatetime;
  }

  public Workitem starred(Boolean starred) {
    this.starred = starred;
    return this;
  }

   /**
   * Starred
   * @return starred
  **/
  @ApiModelProperty(example = "false", value = "Starred")
  public Boolean getStarred() {
    return starred;
  }

  public void setStarred(Boolean starred) {
    this.starred = starred;
  }

  public Workitem read(Boolean read) {
    this.read = read;
    return this;
  }

   /**
   * read
   * @return read
  **/
  @ApiModelProperty(example = "true", value = "read")
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workitem workitem = (Workitem) o;
    return Objects.equals(this.id, workitem.id) &&
        Objects.equals(this.allocateDatetime, workitem.allocateDatetime) &&
        Objects.equals(this.allocatedQuserId, workitem.allocatedQuserId) &&
        Objects.equals(this.allocatedQuserName, workitem.allocatedQuserName) &&
        Objects.equals(this.allocatedQgroupId, workitem.allocatedQgroupId) &&
        Objects.equals(this.allocatedQgroupName, workitem.allocatedQgroupName) &&
        Objects.equals(this.endDatetime, workitem.endDatetime) &&
        Objects.equals(this.nodeName, workitem.nodeName) &&
        Objects.equals(this.nodeNumber, workitem.nodeNumber) &&
        Objects.equals(this.offerDatetime, workitem.offerDatetime) &&
        Objects.equals(this.processInstanceEndDatetime, workitem.processInstanceEndDatetime) &&
        Objects.equals(this.processInstanceIdForView, workitem.processInstanceIdForView) &&
        Objects.equals(this.processInstanceId, workitem.processInstanceId) &&
        Objects.equals(this.processInstanceSequenceNumber, workitem.processInstanceSequenceNumber) &&
        Objects.equals(this.processInstanceInitQgroupId, workitem.processInstanceInitQgroupId) &&
        Objects.equals(this.processInstanceInitQgroupName, workitem.processInstanceInitQgroupName) &&
        Objects.equals(this.processInstanceInitQuserId, workitem.processInstanceInitQuserId) &&
        Objects.equals(this.processInstanceInitQuserName, workitem.processInstanceInitQuserName) &&
        Objects.equals(this.processInstanceStartDatetime, workitem.processInstanceStartDatetime) &&
        Objects.equals(this.processInstanceState, workitem.processInstanceState) &&
        Objects.equals(this.processInstanceDebug, workitem.processInstanceDebug) &&
        Objects.equals(this.processInstanceTitle, workitem.processInstanceTitle) &&
        Objects.equals(this.processModelInfoId, workitem.processModelInfoId) &&
        Objects.equals(this.processModelInfoName, workitem.processModelInfoName) &&
        Objects.equals(this.processModelInfoCategory, workitem.processModelInfoCategory) &&
        Objects.equals(this.processModelVersion, workitem.processModelVersion) &&
        Objects.equals(this.startDatetime, workitem.startDatetime) &&
        Objects.equals(this.state, workitem.state) &&
        Objects.equals(this.failType, workitem.failType) &&
        Objects.equals(this.swimlaneType, workitem.swimlaneType) &&
        Objects.equals(this.timeLimitDatetime, workitem.timeLimitDatetime) &&
        Objects.equals(this.starred, workitem.starred) &&
        Objects.equals(this.read, workitem.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, allocateDatetime, allocatedQuserId, allocatedQuserName, allocatedQgroupId, allocatedQgroupName, endDatetime, nodeName, nodeNumber, offerDatetime, processInstanceEndDatetime, processInstanceIdForView, processInstanceId, processInstanceSequenceNumber, processInstanceInitQgroupId, processInstanceInitQgroupName, processInstanceInitQuserId, processInstanceInitQuserName, processInstanceStartDatetime, processInstanceState, processInstanceDebug, processInstanceTitle, processModelInfoId, processModelInfoName, processModelInfoCategory, processModelVersion, startDatetime, state, failType, swimlaneType, timeLimitDatetime, starred, read);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workitem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    allocateDatetime: ").append(toIndentedString(allocateDatetime)).append("\n");
    sb.append("    allocatedQuserId: ").append(toIndentedString(allocatedQuserId)).append("\n");
    sb.append("    allocatedQuserName: ").append(toIndentedString(allocatedQuserName)).append("\n");
    sb.append("    allocatedQgroupId: ").append(toIndentedString(allocatedQgroupId)).append("\n");
    sb.append("    allocatedQgroupName: ").append(toIndentedString(allocatedQgroupName)).append("\n");
    sb.append("    endDatetime: ").append(toIndentedString(endDatetime)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeNumber: ").append(toIndentedString(nodeNumber)).append("\n");
    sb.append("    offerDatetime: ").append(toIndentedString(offerDatetime)).append("\n");
    sb.append("    processInstanceEndDatetime: ").append(toIndentedString(processInstanceEndDatetime)).append("\n");
    sb.append("    processInstanceIdForView: ").append(toIndentedString(processInstanceIdForView)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceSequenceNumber: ").append(toIndentedString(processInstanceSequenceNumber)).append("\n");
    sb.append("    processInstanceInitQgroupId: ").append(toIndentedString(processInstanceInitQgroupId)).append("\n");
    sb.append("    processInstanceInitQgroupName: ").append(toIndentedString(processInstanceInitQgroupName)).append("\n");
    sb.append("    processInstanceInitQuserId: ").append(toIndentedString(processInstanceInitQuserId)).append("\n");
    sb.append("    processInstanceInitQuserName: ").append(toIndentedString(processInstanceInitQuserName)).append("\n");
    sb.append("    processInstanceStartDatetime: ").append(toIndentedString(processInstanceStartDatetime)).append("\n");
    sb.append("    processInstanceState: ").append(toIndentedString(processInstanceState)).append("\n");
    sb.append("    processInstanceDebug: ").append(toIndentedString(processInstanceDebug)).append("\n");
    sb.append("    processInstanceTitle: ").append(toIndentedString(processInstanceTitle)).append("\n");
    sb.append("    processModelInfoId: ").append(toIndentedString(processModelInfoId)).append("\n");
    sb.append("    processModelInfoName: ").append(toIndentedString(processModelInfoName)).append("\n");
    sb.append("    processModelInfoCategory: ").append(toIndentedString(processModelInfoCategory)).append("\n");
    sb.append("    processModelVersion: ").append(toIndentedString(processModelVersion)).append("\n");
    sb.append("    startDatetime: ").append(toIndentedString(startDatetime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    failType: ").append(toIndentedString(failType)).append("\n");
    sb.append("    swimlaneType: ").append(toIndentedString(swimlaneType)).append("\n");
    sb.append("    timeLimitDatetime: ").append(toIndentedString(timeLimitDatetime)).append("\n");
    sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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


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
 * Error
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T16:27:26.082+09:00")
public class Error {
  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("input")
  private String input = null;

  @SerializedName("type")
  private String type = null;

  public Error errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(example = "10001", value = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public Error input(String input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(example = "hello", value = "")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public Error type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "InvalidId", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.input, error.input) &&
        Objects.equals(this.type, error.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, input, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


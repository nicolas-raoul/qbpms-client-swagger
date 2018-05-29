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
import java.util.ArrayList;
import java.util.List;

/**
 * ItemCacheList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T16:27:26.082+09:00")
public class ItemCacheList {
  @SerializedName("urls")
  private List<String> urls = null;

  public ItemCacheList urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public ItemCacheList addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(example = "[\"http://qbpms-select.appspot.com/simple/yesno.xml\",\"file:///select/baseball-league.xml\"]", value = "")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemCacheList itemCacheList = (ItemCacheList) o;
    return Objects.equals(this.urls, itemCacheList.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCacheList {\n");
    
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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


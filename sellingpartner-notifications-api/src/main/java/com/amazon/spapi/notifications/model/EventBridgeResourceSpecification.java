/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.notifications.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The information required to create an Amazon EventBridge destination.
 */
@ApiModel(description = "The information required to create an Amazon EventBridge destination.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:51:27.111+08:00")
public class EventBridgeResourceSpecification {
  @SerializedName("region")
  private String region = null;

  @SerializedName("accountId")
  private String accountId = null;

  public EventBridgeResourceSpecification region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The AWS region in which you will be receiving the notifications.
   * @return region
  **/
  @ApiModelProperty(required = true, value = "The AWS region in which you will be receiving the notifications.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public EventBridgeResourceSpecification accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The identifier for the AWS account that is responsible for charges related to receiving notifications.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the AWS account that is responsible for charges related to receiving notifications.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventBridgeResourceSpecification eventBridgeResourceSpecification = (EventBridgeResourceSpecification) o;
    return Objects.equals(this.region, eventBridgeResourceSpecification.region) &&
        Objects.equals(this.accountId, eventBridgeResourceSpecification.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventBridgeResourceSpecification {\n");
    
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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


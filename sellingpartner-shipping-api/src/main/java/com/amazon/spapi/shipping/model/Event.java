/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.shipping.model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.shipping.model.Location;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * An event of a shipment
 */
@ApiModel(description = "An event of a shipment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:59:38.614+08:00")
public class Event {
  @SerializedName("eventCode")
  private String eventCode = null;

  @SerializedName("eventTime")
  private OffsetDateTime eventTime = null;

  @SerializedName("location")
  private Location location = null;

  public Event eventCode(String eventCode) {
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Get eventCode
   * @return eventCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEventCode() {
    return eventCode;
  }

  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }

  public Event eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * The date and time of an event for a shipment.
   * @return eventTime
  **/
  @ApiModelProperty(required = true, value = "The date and time of an event for a shipment.")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public Event location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventCode, event.eventCode) &&
        Objects.equals(this.eventTime, event.eventTime) &&
        Objects.equals(this.location, event.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCode, eventTime, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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


/*
 * Selling Partner API for FBA Inventory
 * The Selling Partner API for FBA Inventory lets you programmatically retrieve information about inventory in Amazon's fulfillment network.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.fbainventory.model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.fbainventory.model.ResearchingQuantity;
import com.amazon.spapi.fbainventory.model.ReservedQuantity;
import com.amazon.spapi.fbainventory.model.UnfulfillableQuantity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Summarized inventory details. This object will not appear if the details parameter in the request is false.
 */
@ApiModel(description = "Summarized inventory details. This object will not appear if the details parameter in the request is false.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:24:28.343+08:00")
public class InventoryDetails {
  @SerializedName("fulfillableQuantity")
  private Integer fulfillableQuantity = null;

  @SerializedName("inboundWorkingQuantity")
  private Integer inboundWorkingQuantity = null;

  @SerializedName("inboundShippedQuantity")
  private Integer inboundShippedQuantity = null;

  @SerializedName("inboundReceivingQuantity")
  private Integer inboundReceivingQuantity = null;

  @SerializedName("reservedQuantity")
  private ReservedQuantity reservedQuantity = null;

  @SerializedName("researchingQuantity")
  private ResearchingQuantity researchingQuantity = null;

  @SerializedName("unfulfillableQuantity")
  private UnfulfillableQuantity unfulfillableQuantity = null;

  public InventoryDetails fulfillableQuantity(Integer fulfillableQuantity) {
    this.fulfillableQuantity = fulfillableQuantity;
    return this;
  }

   /**
   * The item quantity that can be picked, packed, and shipped.
   * @return fulfillableQuantity
  **/
  @ApiModelProperty(value = "The item quantity that can be picked, packed, and shipped.")
  public Integer getFulfillableQuantity() {
    return fulfillableQuantity;
  }

  public void setFulfillableQuantity(Integer fulfillableQuantity) {
    this.fulfillableQuantity = fulfillableQuantity;
  }

  public InventoryDetails inboundWorkingQuantity(Integer inboundWorkingQuantity) {
    this.inboundWorkingQuantity = inboundWorkingQuantity;
    return this;
  }

   /**
   * The number of units in an inbound shipment for which you have notified Amazon.
   * @return inboundWorkingQuantity
  **/
  @ApiModelProperty(value = "The number of units in an inbound shipment for which you have notified Amazon.")
  public Integer getInboundWorkingQuantity() {
    return inboundWorkingQuantity;
  }

  public void setInboundWorkingQuantity(Integer inboundWorkingQuantity) {
    this.inboundWorkingQuantity = inboundWorkingQuantity;
  }

  public InventoryDetails inboundShippedQuantity(Integer inboundShippedQuantity) {
    this.inboundShippedQuantity = inboundShippedQuantity;
    return this;
  }

   /**
   * The number of units in an inbound shipment that you have notified Amazon about and have provided a tracking number.
   * @return inboundShippedQuantity
  **/
  @ApiModelProperty(value = "The number of units in an inbound shipment that you have notified Amazon about and have provided a tracking number.")
  public Integer getInboundShippedQuantity() {
    return inboundShippedQuantity;
  }

  public void setInboundShippedQuantity(Integer inboundShippedQuantity) {
    this.inboundShippedQuantity = inboundShippedQuantity;
  }

  public InventoryDetails inboundReceivingQuantity(Integer inboundReceivingQuantity) {
    this.inboundReceivingQuantity = inboundReceivingQuantity;
    return this;
  }

   /**
   * The number of units that have not yet been received at an Amazon fulfillment center for processing, but are part of an inbound shipment with some units that have already been received and processed.
   * @return inboundReceivingQuantity
  **/
  @ApiModelProperty(value = "The number of units that have not yet been received at an Amazon fulfillment center for processing, but are part of an inbound shipment with some units that have already been received and processed.")
  public Integer getInboundReceivingQuantity() {
    return inboundReceivingQuantity;
  }

  public void setInboundReceivingQuantity(Integer inboundReceivingQuantity) {
    this.inboundReceivingQuantity = inboundReceivingQuantity;
  }

  public InventoryDetails reservedQuantity(ReservedQuantity reservedQuantity) {
    this.reservedQuantity = reservedQuantity;
    return this;
  }

   /**
   * Get reservedQuantity
   * @return reservedQuantity
  **/
  @ApiModelProperty(value = "")
  public ReservedQuantity getReservedQuantity() {
    return reservedQuantity;
  }

  public void setReservedQuantity(ReservedQuantity reservedQuantity) {
    this.reservedQuantity = reservedQuantity;
  }

  public InventoryDetails researchingQuantity(ResearchingQuantity researchingQuantity) {
    this.researchingQuantity = researchingQuantity;
    return this;
  }

   /**
   * Get researchingQuantity
   * @return researchingQuantity
  **/
  @ApiModelProperty(value = "")
  public ResearchingQuantity getResearchingQuantity() {
    return researchingQuantity;
  }

  public void setResearchingQuantity(ResearchingQuantity researchingQuantity) {
    this.researchingQuantity = researchingQuantity;
  }

  public InventoryDetails unfulfillableQuantity(UnfulfillableQuantity unfulfillableQuantity) {
    this.unfulfillableQuantity = unfulfillableQuantity;
    return this;
  }

   /**
   * Get unfulfillableQuantity
   * @return unfulfillableQuantity
  **/
  @ApiModelProperty(value = "")
  public UnfulfillableQuantity getUnfulfillableQuantity() {
    return unfulfillableQuantity;
  }

  public void setUnfulfillableQuantity(UnfulfillableQuantity unfulfillableQuantity) {
    this.unfulfillableQuantity = unfulfillableQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryDetails inventoryDetails = (InventoryDetails) o;
    return Objects.equals(this.fulfillableQuantity, inventoryDetails.fulfillableQuantity) &&
        Objects.equals(this.inboundWorkingQuantity, inventoryDetails.inboundWorkingQuantity) &&
        Objects.equals(this.inboundShippedQuantity, inventoryDetails.inboundShippedQuantity) &&
        Objects.equals(this.inboundReceivingQuantity, inventoryDetails.inboundReceivingQuantity) &&
        Objects.equals(this.reservedQuantity, inventoryDetails.reservedQuantity) &&
        Objects.equals(this.researchingQuantity, inventoryDetails.researchingQuantity) &&
        Objects.equals(this.unfulfillableQuantity, inventoryDetails.unfulfillableQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillableQuantity, inboundWorkingQuantity, inboundShippedQuantity, inboundReceivingQuantity, reservedQuantity, researchingQuantity, unfulfillableQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryDetails {\n");
    
    sb.append("    fulfillableQuantity: ").append(toIndentedString(fulfillableQuantity)).append("\n");
    sb.append("    inboundWorkingQuantity: ").append(toIndentedString(inboundWorkingQuantity)).append("\n");
    sb.append("    inboundShippedQuantity: ").append(toIndentedString(inboundShippedQuantity)).append("\n");
    sb.append("    inboundReceivingQuantity: ").append(toIndentedString(inboundReceivingQuantity)).append("\n");
    sb.append("    reservedQuantity: ").append(toIndentedString(reservedQuantity)).append("\n");
    sb.append("    researchingQuantity: ").append(toIndentedString(researchingQuantity)).append("\n");
    sb.append("    unfulfillableQuantity: ").append(toIndentedString(unfulfillableQuantity)).append("\n");
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


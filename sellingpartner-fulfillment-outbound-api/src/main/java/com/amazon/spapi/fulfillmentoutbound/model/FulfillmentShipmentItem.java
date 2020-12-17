/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.fulfillmentoutbound.model;

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
 * Item information for a shipment in a fulfillment order.
 */
@ApiModel(description = "Item information for a shipment in a fulfillment order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:44:18.412+08:00")
public class FulfillmentShipmentItem {
  @SerializedName("sellerSku")
  private String sellerSku = null;

  @SerializedName("sellerFulfillmentOrderItemId")
  private String sellerFulfillmentOrderItemId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("packageNumber")
  private Integer packageNumber = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  public FulfillmentShipmentItem sellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSku
  **/
  @ApiModelProperty(required = true, value = "The seller SKU of the item.")
  public String getSellerSku() {
    return sellerSku;
  }

  public void setSellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
  }

  public FulfillmentShipmentItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    return this;
  }

   /**
   * The fulfillment order item identifier that the seller created and submitted with a call to the createFulfillmentOrder operation.
   * @return sellerFulfillmentOrderItemId
  **/
  @ApiModelProperty(required = true, value = "The fulfillment order item identifier that the seller created and submitted with a call to the createFulfillmentOrder operation.")
  public String getSellerFulfillmentOrderItemId() {
    return sellerFulfillmentOrderItemId;
  }

  public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
  }

  public FulfillmentShipmentItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public FulfillmentShipmentItem packageNumber(Integer packageNumber) {
    this.packageNumber = packageNumber;
    return this;
  }

   /**
   * An identifier for the package that contains the item quantity.
   * @return packageNumber
  **/
  @ApiModelProperty(value = "An identifier for the package that contains the item quantity.")
  public Integer getPackageNumber() {
    return packageNumber;
  }

  public void setPackageNumber(Integer packageNumber) {
    this.packageNumber = packageNumber;
  }

  public FulfillmentShipmentItem serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The serial number of the shipped item.
   * @return serialNumber
  **/
  @ApiModelProperty(value = "The serial number of the shipped item.")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentShipmentItem fulfillmentShipmentItem = (FulfillmentShipmentItem) o;
    return Objects.equals(this.sellerSku, fulfillmentShipmentItem.sellerSku) &&
        Objects.equals(this.sellerFulfillmentOrderItemId, fulfillmentShipmentItem.sellerFulfillmentOrderItemId) &&
        Objects.equals(this.quantity, fulfillmentShipmentItem.quantity) &&
        Objects.equals(this.packageNumber, fulfillmentShipmentItem.packageNumber) &&
        Objects.equals(this.serialNumber, fulfillmentShipmentItem.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSku, sellerFulfillmentOrderItemId, quantity, packageNumber, serialNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentShipmentItem {\n");
    
    sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
    sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    packageNumber: ").append(toIndentedString(packageNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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


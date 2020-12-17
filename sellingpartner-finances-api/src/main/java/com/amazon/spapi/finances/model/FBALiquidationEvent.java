/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.finances.model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.finances.model.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A payment event for Fulfillment by Amazon (FBA) inventory liquidation. This event is used only in the US marketplace.
 */
@ApiModel(description = "A payment event for Fulfillment by Amazon (FBA) inventory liquidation. This event is used only in the US marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:01:58.583+08:00")
public class FBALiquidationEvent {
  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("OriginalRemovalOrderId")
  private String originalRemovalOrderId = null;

  @SerializedName("LiquidationProceedsAmount")
  private Currency liquidationProceedsAmount = null;

  @SerializedName("LiquidationFeeAmount")
  private Currency liquidationFeeAmount = null;

  public FBALiquidationEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public FBALiquidationEvent originalRemovalOrderId(String originalRemovalOrderId) {
    this.originalRemovalOrderId = originalRemovalOrderId;
    return this;
  }

   /**
   * The identifier for the original removal order.
   * @return originalRemovalOrderId
  **/
  @ApiModelProperty(value = "The identifier for the original removal order.")
  public String getOriginalRemovalOrderId() {
    return originalRemovalOrderId;
  }

  public void setOriginalRemovalOrderId(String originalRemovalOrderId) {
    this.originalRemovalOrderId = originalRemovalOrderId;
  }

  public FBALiquidationEvent liquidationProceedsAmount(Currency liquidationProceedsAmount) {
    this.liquidationProceedsAmount = liquidationProceedsAmount;
    return this;
  }

   /**
   * The amount paid by the liquidator for the seller&#39;s inventory. The seller receives this amount minus LiquidationFeeAmount.
   * @return liquidationProceedsAmount
  **/
  @ApiModelProperty(value = "The amount paid by the liquidator for the seller's inventory. The seller receives this amount minus LiquidationFeeAmount.")
  public Currency getLiquidationProceedsAmount() {
    return liquidationProceedsAmount;
  }

  public void setLiquidationProceedsAmount(Currency liquidationProceedsAmount) {
    this.liquidationProceedsAmount = liquidationProceedsAmount;
  }

  public FBALiquidationEvent liquidationFeeAmount(Currency liquidationFeeAmount) {
    this.liquidationFeeAmount = liquidationFeeAmount;
    return this;
  }

   /**
   * The fee charged to the seller by Amazon for liquidating the seller&#39;s FBA inventory.
   * @return liquidationFeeAmount
  **/
  @ApiModelProperty(value = "The fee charged to the seller by Amazon for liquidating the seller's FBA inventory.")
  public Currency getLiquidationFeeAmount() {
    return liquidationFeeAmount;
  }

  public void setLiquidationFeeAmount(Currency liquidationFeeAmount) {
    this.liquidationFeeAmount = liquidationFeeAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FBALiquidationEvent fbALiquidationEvent = (FBALiquidationEvent) o;
    return Objects.equals(this.postedDate, fbALiquidationEvent.postedDate) &&
        Objects.equals(this.originalRemovalOrderId, fbALiquidationEvent.originalRemovalOrderId) &&
        Objects.equals(this.liquidationProceedsAmount, fbALiquidationEvent.liquidationProceedsAmount) &&
        Objects.equals(this.liquidationFeeAmount, fbALiquidationEvent.liquidationFeeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, originalRemovalOrderId, liquidationProceedsAmount, liquidationFeeAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FBALiquidationEvent {\n");
    
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    originalRemovalOrderId: ").append(toIndentedString(originalRemovalOrderId)).append("\n");
    sb.append("    liquidationProceedsAmount: ").append(toIndentedString(liquidationProceedsAmount)).append("\n");
    sb.append("    liquidationFeeAmount: ").append(toIndentedString(liquidationFeeAmount)).append("\n");
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


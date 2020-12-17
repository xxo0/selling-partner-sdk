/*
 * Selling Partner API for Product Fees
 * The Selling Partner API for Product Fees lets you programmatically retrieve estimated fees for a product. You can then account for those fees in your pricing.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.productfees.model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.productfees.model.FeeDetailList;
import com.amazon.spapi.productfees.model.MoneyType;
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
 * The total estimated fees for an item and a list of details.
 */
@ApiModel(description = "The total estimated fees for an item and a list of details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:52:41.175+08:00")
public class FeesEstimate {
  @SerializedName("TimeOfFeesEstimation")
  private OffsetDateTime timeOfFeesEstimation = null;

  @SerializedName("TotalFeesEstimate")
  private MoneyType totalFeesEstimate = null;

  @SerializedName("FeeDetailList")
  private FeeDetailList feeDetailList = null;

  public FeesEstimate timeOfFeesEstimation(OffsetDateTime timeOfFeesEstimation) {
    this.timeOfFeesEstimation = timeOfFeesEstimation;
    return this;
  }

   /**
   * The time for which the fees were estimated. This defaults to the time the request is made.
   * @return timeOfFeesEstimation
  **/
  @ApiModelProperty(required = true, value = "The time for which the fees were estimated. This defaults to the time the request is made.")
  public OffsetDateTime getTimeOfFeesEstimation() {
    return timeOfFeesEstimation;
  }

  public void setTimeOfFeesEstimation(OffsetDateTime timeOfFeesEstimation) {
    this.timeOfFeesEstimation = timeOfFeesEstimation;
  }

  public FeesEstimate totalFeesEstimate(MoneyType totalFeesEstimate) {
    this.totalFeesEstimate = totalFeesEstimate;
    return this;
  }

   /**
   * Total estimated fees for a given item, price, and fulfillment channel.
   * @return totalFeesEstimate
  **/
  @ApiModelProperty(value = "Total estimated fees for a given item, price, and fulfillment channel.")
  public MoneyType getTotalFeesEstimate() {
    return totalFeesEstimate;
  }

  public void setTotalFeesEstimate(MoneyType totalFeesEstimate) {
    this.totalFeesEstimate = totalFeesEstimate;
  }

  public FeesEstimate feeDetailList(FeeDetailList feeDetailList) {
    this.feeDetailList = feeDetailList;
    return this;
  }

   /**
   * Get feeDetailList
   * @return feeDetailList
  **/
  @ApiModelProperty(value = "")
  public FeeDetailList getFeeDetailList() {
    return feeDetailList;
  }

  public void setFeeDetailList(FeeDetailList feeDetailList) {
    this.feeDetailList = feeDetailList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeesEstimate feesEstimate = (FeesEstimate) o;
    return Objects.equals(this.timeOfFeesEstimation, feesEstimate.timeOfFeesEstimation) &&
        Objects.equals(this.totalFeesEstimate, feesEstimate.totalFeesEstimate) &&
        Objects.equals(this.feeDetailList, feesEstimate.feeDetailList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOfFeesEstimation, totalFeesEstimate, feeDetailList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeesEstimate {\n");
    
    sb.append("    timeOfFeesEstimation: ").append(toIndentedString(timeOfFeesEstimation)).append("\n");
    sb.append("    totalFeesEstimate: ").append(toIndentedString(totalFeesEstimate)).append("\n");
    sb.append("    feeDetailList: ").append(toIndentedString(feeDetailList)).append("\n");
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


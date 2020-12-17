/*
 * Selling Partner API for FBA Small And Light
 * The Selling Partner API for FBA Small and Light lets you help sellers manage their listings in the Small and Light program. The program reduces the cost of fulfilling orders for small and lightweight FBA inventory. You can enroll or remove items from the program and check item eligibility and enrollment status. You can also preview the estimated program fees charged to a seller for items sold while enrolled in the program.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.fbasmallandlight.model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.fbasmallandlight.model.FeeLineItem;
import com.amazon.spapi.fbasmallandlight.model.MoneyType;
import com.amazon.spapi.model.ErrorList;
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
 * The fee estimate for a specific item.
 */
@ApiModel(description = "The fee estimate for a specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:31:52.166+08:00")
public class FeePreview {
  @SerializedName("asin")
  private String asin = null;

  @SerializedName("price")
  private MoneyType price = null;

  @SerializedName("feeBreakdown")
  private List<FeeLineItem> feeBreakdown = null;

  @SerializedName("totalFees")
  private MoneyType totalFees = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public FeePreview asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) value used to identify the item.
   * @return asin
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) value used to identify the item.")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public FeePreview price(MoneyType price) {
    this.price = price;
    return this;
  }

   /**
   * The price that the seller plans to charge for the item.
   * @return price
  **/
  @ApiModelProperty(value = "The price that the seller plans to charge for the item.")
  public MoneyType getPrice() {
    return price;
  }

  public void setPrice(MoneyType price) {
    this.price = price;
  }

  public FeePreview feeBreakdown(List<FeeLineItem> feeBreakdown) {
    this.feeBreakdown = feeBreakdown;
    return this;
  }

  public FeePreview addFeeBreakdownItem(FeeLineItem feeBreakdownItem) {
    if (this.feeBreakdown == null) {
      this.feeBreakdown = new ArrayList<FeeLineItem>();
    }
    this.feeBreakdown.add(feeBreakdownItem);
    return this;
  }

   /**
   * A list of the Small and Light fees for the item.
   * @return feeBreakdown
  **/
  @ApiModelProperty(value = "A list of the Small and Light fees for the item.")
  public List<FeeLineItem> getFeeBreakdown() {
    return feeBreakdown;
  }

  public void setFeeBreakdown(List<FeeLineItem> feeBreakdown) {
    this.feeBreakdown = feeBreakdown;
  }

  public FeePreview totalFees(MoneyType totalFees) {
    this.totalFees = totalFees;
    return this;
  }

   /**
   * The total fees charged if the item participated in the Small and Light program.
   * @return totalFees
  **/
  @ApiModelProperty(value = "The total fees charged if the item participated in the Small and Light program.")
  public MoneyType getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(MoneyType totalFees) {
    this.totalFees = totalFees;
  }

  public FeePreview errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the getSmallAndLightFeePreview operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the getSmallAndLightFeePreview operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePreview feePreview = (FeePreview) o;
    return Objects.equals(this.asin, feePreview.asin) &&
        Objects.equals(this.price, feePreview.price) &&
        Objects.equals(this.feeBreakdown, feePreview.feeBreakdown) &&
        Objects.equals(this.totalFees, feePreview.totalFees) &&
        Objects.equals(this.errors, feePreview.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, price, feeBreakdown, totalFees, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePreview {\n");
    
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    feeBreakdown: ").append(toIndentedString(feeBreakdown)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


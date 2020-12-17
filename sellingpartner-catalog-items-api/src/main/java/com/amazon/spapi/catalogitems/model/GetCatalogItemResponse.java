/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.catalogitems.model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.catalogitems.model.Item;
import com.amazon.spapi.model.ErrorList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetCatalogItemResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:17:36.166+08:00")
public class GetCatalogItemResponse {
  @SerializedName("payload")
  private Item payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetCatalogItemResponse payload(Item payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getCatalogItem operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getCatalogItem operation.")
  public Item getPayload() {
    return payload;
  }

  public void setPayload(Item payload) {
    this.payload = payload;
  }

  public GetCatalogItemResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the getCatalogItem operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the getCatalogItem operation.")
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
    GetCatalogItemResponse getCatalogItemResponse = (GetCatalogItemResponse) o;
    return Objects.equals(this.payload, getCatalogItemResponse.payload) &&
        Objects.equals(this.errors, getCatalogItemResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCatalogItemResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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


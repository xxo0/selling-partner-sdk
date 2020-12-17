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
import com.amazon.spapi.shipping.model.LabelSpecification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The label details of the container.
 */
@ApiModel(description = "The label details of the container.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:59:38.614+08:00")
public class Label {
  @SerializedName("labelStream")
  private String labelStream = null;

  @SerializedName("labelSpecification")
  private LabelSpecification labelSpecification = null;

  public Label labelStream(String labelStream) {
    this.labelStream = labelStream;
    return this;
  }

   /**
   * Get labelStream
   * @return labelStream
  **/
  @ApiModelProperty(value = "")
  public String getLabelStream() {
    return labelStream;
  }

  public void setLabelStream(String labelStream) {
    this.labelStream = labelStream;
  }

  public Label labelSpecification(LabelSpecification labelSpecification) {
    this.labelSpecification = labelSpecification;
    return this;
  }

   /**
   * Get labelSpecification
   * @return labelSpecification
  **/
  @ApiModelProperty(value = "")
  public LabelSpecification getLabelSpecification() {
    return labelSpecification;
  }

  public void setLabelSpecification(LabelSpecification labelSpecification) {
    this.labelSpecification = labelSpecification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.labelStream, label.labelStream) &&
        Objects.equals(this.labelSpecification, label.labelSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelStream, labelSpecification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    labelStream: ").append(toIndentedString(labelStream)).append("\n");
    sb.append("    labelSpecification: ").append(toIndentedString(labelSpecification)).append("\n");
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


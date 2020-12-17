/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2020-09-04
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.reports.model;

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
 * Encryption details required for decryption of a report document&#39;s contents.
 */
@ApiModel(description = "Encryption details required for decryption of a report document's contents.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:55:47.344+08:00")
public class ReportDocumentEncryptionDetails {
  /**
   * The encryption standard required to decrypt the document contents.
   */
  @JsonAdapter(StandardEnum.Adapter.class)
  public enum StandardEnum {
    AES("AES");

    private String value;

    StandardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StandardEnum fromValue(String text) {
      for (StandardEnum b : StandardEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StandardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StandardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StandardEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StandardEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("standard")
  private StandardEnum standard = null;

  @SerializedName("initializationVector")
  private String initializationVector = null;

  @SerializedName("key")
  private String key = null;

  public ReportDocumentEncryptionDetails standard(StandardEnum standard) {
    this.standard = standard;
    return this;
  }

   /**
   * The encryption standard required to decrypt the document contents.
   * @return standard
  **/
  @ApiModelProperty(required = true, value = "The encryption standard required to decrypt the document contents.")
  public StandardEnum getStandard() {
    return standard;
  }

  public void setStandard(StandardEnum standard) {
    this.standard = standard;
  }

  public ReportDocumentEncryptionDetails initializationVector(String initializationVector) {
    this.initializationVector = initializationVector;
    return this;
  }

   /**
   * The vector to decrypt the document contents using Cipher Block Chaining (CBC).
   * @return initializationVector
  **/
  @ApiModelProperty(required = true, value = "The vector to decrypt the document contents using Cipher Block Chaining (CBC).")
  public String getInitializationVector() {
    return initializationVector;
  }

  public void setInitializationVector(String initializationVector) {
    this.initializationVector = initializationVector;
  }

  public ReportDocumentEncryptionDetails key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The encryption key used to decrypt the document contents.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The encryption key used to decrypt the document contents.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDocumentEncryptionDetails reportDocumentEncryptionDetails = (ReportDocumentEncryptionDetails) o;
    return Objects.equals(this.standard, reportDocumentEncryptionDetails.standard) &&
        Objects.equals(this.initializationVector, reportDocumentEncryptionDetails.initializationVector) &&
        Objects.equals(this.key, reportDocumentEncryptionDetails.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standard, initializationVector, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDocumentEncryptionDetails {\n");
    
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    initializationVector: ").append(toIndentedString(initializationVector)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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


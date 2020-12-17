/*
 * Selling Partner API for Uploads
 * The Selling Partner API for Uploads provides operations that support uploading files.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.uploads.api;

import com.amazon.spapi.uploads.ApiException;
import com.amazon.spapi.uploads.model.CreateUploadDestinationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UploadsApi
 */
@Ignore
public class UploadsApiTest {

    private final UploadsApi api = new UploadsApi();

    
    /**
     * 
     *
     * Creates an upload destination for a resource that you specify and returns the information required to upload to that destination.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | .1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUploadDestinationForResourceTest() throws ApiException {
        List<String> marketplaceIds = null;
        String contentMD5 = null;
        String resource = null;
        String contentType = null;
        CreateUploadDestinationResponse response = api.createUploadDestinationForResource(marketplaceIds, contentMD5, resource, contentType);

        // TODO: test validations
    }
    
}
/*
 * Delivery API
 * Simple delivery manager
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.rafaelbarros.delivery.client.api;

import com.rafaelbarros.delivery.client.model.Product;
import com.rafaelbarros.delivery.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for V1SellerApi
 */
@Ignore
public class V1SellerApiTest {

    private final V1SellerApi api = new V1SellerApi();

    
    /**
     * Add product to delivery
     *
     * Use to request to make available product
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProductTest() {
        List<User> user = null;
        api.addProduct(user);

        // TODO: test validations
    }
    
    /**
     * Delete a product
     *
     * use to delete a product
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProductTest() {
        String productId = null;
        api.deleteProduct(productId);

        // TODO: test validations
    }
    
    /**
     * Finds Product by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findProductByStatusTest() {
        List<String> status = null;
        Integer offset = null;
        Integer limit = null;
        List<Product> response = api.findProductByStatus(status, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Find product by ID
     *
     * Returns a product by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductByIdTest() {
        Integer productId = null;
        Product response = api.getProductById(productId);

        // TODO: test validations
    }
    
    /**
     * Update registry of products
     *
     * Use to update products
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProductTest() {
        List<User> user = null;
        api.updateProduct(user);

        // TODO: test validations
    }
    
}

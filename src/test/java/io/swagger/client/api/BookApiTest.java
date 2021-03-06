/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find  out more about Swagger at  [http://swagger.io](http://swagger.io) or on  [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.Books;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookApi
 */
@Ignore
public class BookApiTest {

    private final BookApi api = new BookApi();

    
    /**
     * List of all \&quot;The Lord of the Rings\&quot; books
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addPetTest() throws Exception {
        Books response = api.addPet();

        // TODO: test validations
    }
    
    /**
     * Find book by ID
     *
     * Returns a single pet
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBookByIdTest() throws Exception {
        Long id = null;
        Books response = api.getBookById(id);

        // TODO: test validations
    }
    
}

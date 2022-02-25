# BookApi

All URIs are relative to *https://virtserver.swaggerhub.com/tac-tech/the-one-api.dev/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPet**](BookApi.md#addPet) | **GET** /book | List of all \&quot;The Lord of the Rings\&quot; books
[**getBookById**](BookApi.md#getBookById) | **GET** /book/{id} | Find book by ID


<a name="addPet"></a>
# **addPet**
> Books addPet()

List of all \&quot;The Lord of the Rings\&quot; books

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookApi;


BookApi apiInstance = new BookApi();
try {
    Books result = apiInstance.addPet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookApi#addPet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Books**](Books.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getBookById"></a>
# **getBookById**
> Books getBookById(id)

Find book by ID

Returns a single pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BookApi apiInstance = new BookApi();
Long id = 789L; // Long | ID of book to return
try {
    Books result = apiInstance.getBookById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookApi#getBookById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of book to return |

### Return type

[**Books**](Books.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


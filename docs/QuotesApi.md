# QuotesApi

All URIs are relative to *https://virtserver.swaggerhub.com/tac-tech/the-one-api.dev/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllQuotes**](QuotesApi.md#getAllQuotes) | **GET** /quote | List of all \&quot;The Lord of the Rings\&quot; movie
[**getQuoteById**](QuotesApi.md#getQuoteById) | **GET** /quote/{id} | Find quote by ID


<a name="getAllQuotes"></a>
# **getAllQuotes**
> MovieQuotes getAllQuotes()

List of all \&quot;The Lord of the Rings\&quot; movie

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuotesApi apiInstance = new QuotesApi();
try {
    MovieQuotes result = apiInstance.getAllQuotes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#getAllQuotes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MovieQuotes**](MovieQuotes.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getQuoteById"></a>
# **getQuoteById**
> Quote getQuoteById(id)

Find quote by ID

Returns a single pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

QuotesApi apiInstance = new QuotesApi();
Long id = 789L; // Long | ID of quote
try {
    Quote result = apiInstance.getQuoteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#getQuoteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of quote |

### Return type

[**Quote**](Quote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


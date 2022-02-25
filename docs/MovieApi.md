# MovieApi

All URIs are relative to *https://virtserver.swaggerhub.com/tac-tech/the-one-api.dev/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMovie**](MovieApi.md#getAllMovie) | **GET** /movie | List of all \&quot;The Lord of the Rings\&quot; movie
[**getAllMovieQuotes**](MovieApi.md#getAllMovieQuotes) | **GET** /movie/{id}/quote | List of all \&quot;The Lord of the Rings\&quot; movie


<a name="getAllMovie"></a>
# **getAllMovie**
> Movies getAllMovie()

List of all \&quot;The Lord of the Rings\&quot; movie

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MovieApi;


MovieApi apiInstance = new MovieApi();
try {
    Movies result = apiInstance.getAllMovie();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#getAllMovie");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Movies**](Movies.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getAllMovieQuotes"></a>
# **getAllMovieQuotes**
> MovieQuotes getAllMovieQuotes(id)

List of all \&quot;The Lord of the Rings\&quot; movie

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MovieApi;


MovieApi apiInstance = new MovieApi();
Long id = 789L; // Long | ID of book to return
try {
    MovieQuotes result = apiInstance.getAllMovieQuotes(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieApi#getAllMovieQuotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of book to return |

### Return type

[**MovieQuotes**](MovieQuotes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml


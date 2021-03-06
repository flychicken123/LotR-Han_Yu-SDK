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


package io.swagger.client.model;

import java.util.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Quote;


/**
 * MovieQuotes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-25T07:32:05.010Z")
public class MovieQuotes {
  @SerializedName("docs")
  private List<Quote> docs = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("limit")
  private Long limit = null;

  @SerializedName("offset")
  private Long offset = null;

  @SerializedName("page")
  private Long page = null;

  @SerializedName("pages")
  private Long pages = null;

  public MovieQuotes docs(List<Quote> docs) {
    this.docs = docs;
    return this;
  }

  public MovieQuotes addDocsItem(Quote docsItem) {
    if (this.docs == null) {
      this.docs = new ArrayList<Quote>();
    }
    this.docs.add(docsItem);
    return this;
  }

   /**
   * Get docs
   * @return docs
  **/
  @ApiModelProperty(value = "")
  public List<Quote> getDocs() {
    return docs;
  }

  public void setDocs(List<Quote> docs) {
    this.docs = docs;
  }

  public MovieQuotes total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * total number of book
   * @return total
  **/
  @ApiModelProperty(value = "total number of book")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public MovieQuotes limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public MovieQuotes offset(Long offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(value = "")
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public MovieQuotes page(Long page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public MovieQuotes pages(Long pages) {
    this.pages = pages;
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @ApiModelProperty(value = "")
  public Long getPages() {
    return pages;
  }

  public void setPages(Long pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieQuotes movieQuotes = (MovieQuotes) o;
    return Objects.equals(this.docs, movieQuotes.docs) &&
        Objects.equals(this.total, movieQuotes.total) &&
        Objects.equals(this.limit, movieQuotes.limit) &&
        Objects.equals(this.offset, movieQuotes.offset) &&
        Objects.equals(this.page, movieQuotes.page) &&
        Objects.equals(this.pages, movieQuotes.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docs, total, limit, offset, page, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieQuotes {\n");
    
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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


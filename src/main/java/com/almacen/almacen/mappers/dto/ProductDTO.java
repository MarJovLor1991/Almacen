package com.almacen.almacen.mappers.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO {
    String productCode;
    Float buyPrize;
    Float sellPrize;
    Integer stock;
    String providerCode;
    @JsonProperty(value = "Name")
    String productName;
    String size;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Float getBuyPrize() {
        return buyPrize;
    }

    public void setBuyPrize(Float buyPrize) {
        this.buyPrize = buyPrize;
    }

    public Float getSellPrize() {
        return sellPrize;
    }

    public void setSellPrize(Float sellPrize) {
        this.sellPrize = sellPrize;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

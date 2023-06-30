package com.almacen.almacen.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class ProductEntity {
    @Id
    @Column(name = "COD_PRODUCTO")
    String productCode;
    @Column(name = "PRECIO_COMPRA")
    Float buyPrize;
    @Column(name = "PRECIO_VENTA")
    Float sellPrize;
    @Column(name = "STOCK_PRODUCTO")
    Integer stock;
    @Column(name = "COD_PROVEEDOR")
    String providerCode;
    @Column(name = "NOMBRE_PRODUCTO")
    String productName;
    @Column(name = "TALLA")
    String size;

    public ProductEntity(){}
    public ProductEntity(String productCode, Float buyPrize, Float sellPrize,
                         Integer stock, String providerCode, String productName, String size) {
        this.productCode = productCode;
        this.buyPrize = buyPrize;
        this.sellPrize = sellPrize;
        this.stock = stock;
        this.providerCode = providerCode;
        this.productName = productName;
        this.size = size;
    }

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

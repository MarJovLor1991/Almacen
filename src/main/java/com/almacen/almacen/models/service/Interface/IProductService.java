package com.almacen.almacen.models.service.Interface;

import com.almacen.almacen.models.entity.ProductEntity;

import java.util.List;

public interface IProductService {

    List<ProductEntity> findAll();
    ProductEntity findByProductCode(String productCode);
    List<ProductEntity> findAllByProviderCode(String providerCode);
    ProductEntity findByproductName(String productName);
    void save(ProductEntity product);
    void delete(ProductEntity product);

}

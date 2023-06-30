package com.almacen.almacen.models.dao;

import com.almacen.almacen.models.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductDAO extends JpaRepository<ProductEntity, String> {
    ProductEntity findByProductCode(String productCode);
    List<ProductEntity> findAllByProviderCode(String providerCode);
    ProductEntity findByproductName(String productName);
}

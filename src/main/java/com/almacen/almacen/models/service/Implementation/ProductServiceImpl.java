package com.almacen.almacen.models.service.Implementation;

import com.almacen.almacen.models.dao.IProductDAO;
import com.almacen.almacen.models.entity.ProductEntity;
import com.almacen.almacen.models.service.Interface.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductDAO dao;
    @Override
    public List<ProductEntity> findAll() {
        return dao.findAll();
    }

    @Override
    public ProductEntity findByProductCode(String productCode) {
        return dao.findByProductCode(productCode);
    }

    @Override
    public List<ProductEntity> findAllByProviderCode(String providerCode) {
        return dao.findAllByProviderCode(providerCode);
    }

    @Override
    public ProductEntity findByproductName(String productName) {
        return dao.findByproductName(productName);
    }

    @Override
    public void save(ProductEntity product) {
        dao.save(product);
    }

    @Override
    public void delete(ProductEntity product) {
        dao.delete(product);
    }
}

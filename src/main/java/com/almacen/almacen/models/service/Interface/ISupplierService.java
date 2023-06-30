package com.almacen.almacen.models.service.Interface;

import com.almacen.almacen.models.entity.SupplierEntity;

import java.util.List;

public interface ISupplierService {
    List<SupplierEntity> findAll();
    SupplierEntity findBySupplierCode(String supplierCode);
    SupplierEntity findBySupplierName(String supplierName);
    void save(SupplierEntity supplier);
    void delete(SupplierEntity supplier);
    void deleteBySupplierCode(String supplierCode);

}

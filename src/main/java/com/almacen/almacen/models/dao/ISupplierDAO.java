package com.almacen.almacen.models.dao;

import com.almacen.almacen.models.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplierDAO extends JpaRepository<SupplierEntity, String> {
    SupplierEntity findBySupplierCode(String supplierCode);
    SupplierEntity findBySupplierName(String supplierName);
    void deleteBySupplierCode(String supplierCode);
}

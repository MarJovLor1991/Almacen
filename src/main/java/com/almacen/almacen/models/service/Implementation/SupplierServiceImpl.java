package com.almacen.almacen.models.service.Implementation;

import com.almacen.almacen.models.dao.ISupplierDAO;
import com.almacen.almacen.models.entity.SupplierEntity;
import com.almacen.almacen.models.service.Interface.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements ISupplierService {
    @Autowired
    ISupplierDAO dao;
    @Override
    public List<SupplierEntity> findAll() {
        return dao.findAll();
    }

    @Override
    public SupplierEntity findBySupplierCode(String supplierCode) {
        return dao.findBySupplierCode(supplierCode);
    }

    @Override
    public SupplierEntity findBySupplierName(String supplierName) {
        return dao.findBySupplierName(supplierName);
    }

    @Override
    public void save(SupplierEntity supplier) {
        dao.save(supplier);
    }

    @Override
    public void delete(SupplierEntity supplier) {
        dao.delete(supplier);
    }

    @Override
    public void deleteBySupplierCode(String supplierCode) {
        dao.deleteBySupplierCode(supplierCode);
    }
}

package com.almacen.almacen.controllers;

import com.almacen.almacen.mappers.ProductMapper;
import com.almacen.almacen.mappers.SupplierMapper;
import com.almacen.almacen.mappers.dto.ProductDTO;
import com.almacen.almacen.mappers.dto.SupplierDTO;
import com.almacen.almacen.models.entity.ProductEntity;
import com.almacen.almacen.models.entity.SupplierEntity;
import com.almacen.almacen.models.service.Interface.IProductService;
import com.almacen.almacen.models.service.Interface.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    IProductService productService;
    @Autowired
    ISupplierService supplierService;
    @Qualifier("CustomProductDTO")
    @Autowired
    ProductMapper productMapperCustom;
    @Qualifier("CustomSupplierDTO")
    @Autowired
    SupplierMapper supplierMapperCustom;

    @GetMapping("/listAll")
    ResponseEntity<List<ProductEntity>>listAll(){
        if(productService.findAll() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
        }
    }
    @GetMapping("/getOneForInvoice/{productCode}")
    ResponseEntity<ProductDTO>findForInvoice(@PathVariable String productCode){
        if(productService.findByProductCode(productCode) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(productMapperCustom
                    .entityToDTOInvoice(productService.findByProductCode(productCode))
                    , HttpStatus.OK);
        }
    }

    @GetMapping("/listAllSuppliers")
    ResponseEntity<List<SupplierEntity>>listAllSuppliers(){
        if(supplierService.findAll() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(supplierService.findAll(), HttpStatus.OK);
        }
    }

    @GetMapping("/getOneForOrder/{supplierCode}")
    ResponseEntity<SupplierDTO>findForOrder(@PathVariable String supplierCode){
        if(supplierService.findBySupplierCode(supplierCode) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(supplierMapperCustom
                    .entityToDTOrder(supplierService.findBySupplierCode(supplierCode))
                    , HttpStatus.OK);
        }
    }

}

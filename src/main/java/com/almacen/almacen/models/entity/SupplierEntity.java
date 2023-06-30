package com.almacen.almacen.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedores")
public class SupplierEntity {
    @Id
    @Column(name = "COD_PROVEEDOR")
    String supplierCode;
    @Column(name = "NOMBRE_PROVEEDOR")
    String supplierName;
    @Column(name = "TELEFONO_PROVEEDOR")
    String supplierPhone;
    @Column(name = "CIF_PROVEEDOR")
    String supplierCIF;
    @Column(name = "EMAIL_PROVEEDOR")
    String supplierEmail;
    @Column(name = "DIRECCION_PROVEEDOR")
    String supplierAddress;
    @Column(name = "RAZON_SOCIAL")
    String supplierDenomination;
    @Column(name = "IBAN_PROVEEDOR")
    String supplierAccount;


    public SupplierEntity() {
    }

    public SupplierEntity(String supplierName, String supplierPhone,
                          String supplierCIF, String supplierEmail, String supplierAddress,
                          String supplierDenomination, String supplierAccount,
                          String supplierCode) {
        this.supplierName = supplierName;
        this.supplierPhone = supplierPhone;
        this.supplierCIF = supplierCIF;
        this.supplierEmail = supplierEmail;
        this.supplierAddress = supplierAddress;
        this.supplierDenomination = supplierDenomination;
        this.supplierAccount = supplierAccount;
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierCIF() {
        return supplierCIF;
    }

    public void setSupplierCIF(String supplierCIF) {
        this.supplierCIF = supplierCIF;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierDenomination() {
        return supplierDenomination;
    }

    public void setSupplierDenomination(String supplierDenomination) {
        this.supplierDenomination = supplierDenomination;
    }

    public String getSupplierAccount() {
        return supplierAccount;
    }

    public void setSupplierAccount(String supplierAccount) {
        this.supplierAccount = supplierAccount;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }
}

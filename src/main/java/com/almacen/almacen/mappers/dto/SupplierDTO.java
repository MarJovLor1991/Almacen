package com.almacen.almacen.mappers.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierDTO {
    Integer supplierId;
    @JsonProperty(value = "Name")
    String supplierName;
    @JsonProperty(value = "Phone")
    String supplierPhone;
    @JsonProperty(value = "CIF")
    String supplierCIF;
    @JsonProperty(value = "Email")
    String supplierEmail;
    @JsonProperty(value = "Address")
    String supplierAddress;
    @JsonProperty(value = "Denomination")
    String supplierDenomination;
    @JsonProperty(value = "Account")
    String supplierAccount;
    @JsonProperty(value = "Code")
    String supplierCode;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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

package com.almacen.almacen.mappers;

import com.almacen.almacen.mappers.dto.SupplierDTO;
import com.almacen.almacen.models.entity.SupplierEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplierMapper {
    SupplierDTO entityToDTO(SupplierEntity entity);
    SupplierEntity dtoToEntity(SupplierDTO dto);
    List<SupplierDTO> entityToDTOList(List<SupplierEntity> productEntityList);
    List<SupplierEntity> dtoToEntityList(List<SupplierDTO> SupplierDTOList);
    @Named(value = "forInvoices")
    SupplierDTO entityToDTOrder(SupplierEntity entity);
}

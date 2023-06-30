package com.almacen.almacen.mappers;

import com.almacen.almacen.mappers.dto.ProductDTO;
import com.almacen.almacen.models.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Named;


import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

     ProductDTO entityToDTO(ProductEntity entity);
     ProductEntity dtoToEntity(ProductDTO dto);
     List<ProductDTO> entityToDTOList(List<ProductEntity> productEntityList);
     List<ProductEntity> dtoToEntityList(List<ProductDTO> ProductDTOList);
     @Named(value = "forInvoices")
     ProductDTO entityToDTOInvoice(ProductEntity entity);

}

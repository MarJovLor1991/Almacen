package com.almacen.almacen.mappers.implementations;

import com.almacen.almacen.mappers.ProductMapper;
import com.almacen.almacen.mappers.dto.ProductDTO;
import com.almacen.almacen.models.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@Qualifier("CustomProductDTO")
    public class ProductMapperImplementation implements ProductMapper {

        @Override
        public ProductDTO entityToDTO(ProductEntity entity) {
            if ( entity == null ) {
                return null;
            }

            ProductDTO productDTO = new ProductDTO();

            productDTO.setProductCode( entity.getProductCode() );
            productDTO.setBuyPrize( entity.getBuyPrize() );
            productDTO.setSellPrize( entity.getSellPrize() );
            productDTO.setStock( entity.getStock() );
            productDTO.setProviderCode( entity.getProviderCode() );
            productDTO.setProductName( entity.getProductName() );
            productDTO.setSize( entity.getSize() );

            return productDTO;
        }

        @Override
        public ProductEntity dtoToEntity(ProductDTO dto) {
            if ( dto == null ) {
                return null;
            }

            ProductEntity productEntity = new ProductEntity();

            productEntity.setProductCode( dto.getProductCode() );
            productEntity.setBuyPrize( dto.getBuyPrize() );
            productEntity.setSellPrize( dto.getSellPrize() );
            productEntity.setStock( dto.getStock() );
            productEntity.setProviderCode( dto.getProviderCode() );
            productEntity.setProductName( dto.getProductName() );
            productEntity.setSize( dto.getSize() );

            return productEntity;
        }

        @Override
        public List<ProductDTO> entityToDTOList(List<ProductEntity> productEntityList) {
            if ( productEntityList == null ) {
                return null;
            }

            List<ProductDTO> list = new ArrayList<ProductDTO>( productEntityList.size() );
            for ( ProductEntity productEntity : productEntityList ) {
                list.add( entityToDTO( productEntity ) );
            }

            return list;
        }

        @Override
        public List<ProductEntity> dtoToEntityList(List<ProductDTO> ProductDTOList) {
            if ( ProductDTOList == null ) {
                return null;
            }

            List<ProductEntity> list = new ArrayList<ProductEntity>( ProductDTOList.size() );
            for ( ProductDTO productDTO : ProductDTOList ) {
                list.add( dtoToEntity( productDTO ) );
            }

            return list;
        }

        @Override
        public ProductDTO entityToDTOInvoice(ProductEntity entity) {
            if ( entity == null ) {
                return null;
            }
            ProductDTO productDTO = new ProductDTO();
            productDTO.setProductCode(entity.getProductCode());
            productDTO.setSellPrize(entity.getSellPrize());
            productDTO.setProductName(entity.getProductName());
            return productDTO;
        }
    }


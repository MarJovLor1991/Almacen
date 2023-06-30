package com.almacen.almacen.mappers.implementations;

import com.almacen.almacen.mappers.SupplierMapper;
import com.almacen.almacen.mappers.dto.SupplierDTO;
import com.almacen.almacen.models.entity.SupplierEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@Qualifier("CustomSupplierDTO")
public class SupplierMapperImplementation implements SupplierMapper {
    @Override
    public SupplierDTO entityToDTO(SupplierEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SupplierDTO supplierDTO = new SupplierDTO();

        supplierDTO.setSupplierName( entity.getSupplierName() );
        supplierDTO.setSupplierPhone( entity.getSupplierPhone() );
        supplierDTO.setSupplierCIF( entity.getSupplierCIF() );
        supplierDTO.setSupplierEmail( entity.getSupplierEmail() );
        supplierDTO.setSupplierAddress( entity.getSupplierAddress() );
        supplierDTO.setSupplierDenomination( entity.getSupplierDenomination() );
        supplierDTO.setSupplierAccount( entity.getSupplierAccount() );
        supplierDTO.setSupplierCode( entity.getSupplierCode() );

        return supplierDTO;
    }

    @Override
    public SupplierEntity dtoToEntity(SupplierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SupplierEntity supplierEntity = new SupplierEntity();

        supplierEntity.setSupplierName( dto.getSupplierName() );
        supplierEntity.setSupplierPhone( dto.getSupplierPhone() );
        supplierEntity.setSupplierCIF( dto.getSupplierCIF() );
        supplierEntity.setSupplierEmail( dto.getSupplierEmail() );
        supplierEntity.setSupplierAddress( dto.getSupplierAddress() );
        supplierEntity.setSupplierDenomination( dto.getSupplierDenomination() );
        supplierEntity.setSupplierAccount( dto.getSupplierAccount() );
        supplierEntity.setSupplierCode( dto.getSupplierCode() );

        return supplierEntity;
    }

    @Override
    public List<SupplierDTO> entityToDTOList(List<SupplierEntity> productEntityList) {
        if ( productEntityList == null ) {
            return null;
        }

        List<SupplierDTO> list = new ArrayList<SupplierDTO>( productEntityList.size() );
        for ( SupplierEntity supplierEntity : productEntityList ) {
            list.add( entityToDTO( supplierEntity ) );
        }

        return list;
    }

    @Override
    public List<SupplierEntity> dtoToEntityList(List<SupplierDTO> SupplierDTOList) {
        if ( SupplierDTOList == null ) {
            return null;
        }

        List<SupplierEntity> list = new ArrayList<SupplierEntity>( SupplierDTOList.size() );
        for ( SupplierDTO supplierDTO : SupplierDTOList ) {
            list.add( dtoToEntity( supplierDTO ) );
        }

        return list;
    }

    @Override
    public SupplierDTO entityToDTOrder(SupplierEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SupplierDTO supplierDTO = new SupplierDTO();

        supplierDTO.setSupplierPhone( entity.getSupplierPhone() );
        supplierDTO.setSupplierCIF( entity.getSupplierCIF() );
        supplierDTO.setSupplierEmail( entity.getSupplierEmail() );
        supplierDTO.setSupplierAddress( entity.getSupplierAddress() );
        supplierDTO.setSupplierDenomination( entity.getSupplierDenomination() );

        return supplierDTO;
    }
}

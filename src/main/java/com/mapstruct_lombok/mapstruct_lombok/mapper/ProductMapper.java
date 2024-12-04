package com.mapstruct_lombok.mapstruct_lombok.mapper;

import com.mapstruct_lombok.mapstruct_lombok.dtos.GetProduct;
import com.mapstruct_lombok.mapstruct_lombok.entities.Product;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {

    /**
     * como las propiedades id y name se llaman igual en la entity y el dto las podemos evitar
     * mapStruct igual las mapeara
     */
    @Mappings({
//            @Mapping(source = "id", target = "id"),
//            @Mapping(source = "name", target = "name"),
            @Mapping(source = "creationDate", target = "creationDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    })
    GetProduct toGetDTO(Product product);

    @InheritInverseConfiguration
    Product toEntity(GetProduct getProduct);

    List<GetProduct> toGetProductList(List<Product> productList);

    List<Product> toEntityProductList(List<GetProduct> productList);
}

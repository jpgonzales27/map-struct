package com.mapstruct_lombok.mapstruct_lombok.mapper;
import com.mapstruct_lombok.mapstruct_lombok.dtos.GetCategory;
import com.mapstruct_lombok.mapstruct_lombok.entities.Category;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {

    GetCategory toGetCategory ( Category category );

    @InheritInverseConfiguration
    Category toEntity(GetCategory getCategory);

    List<GetCategory> toGetCategoryList(List<Category> categoryList);
    List<Category> toGetEntityList(List<GetCategory> getCategoryList);
}

package com.mapstruct_lombok.mapstruct_lombok.mapper;
import com.mapstruct_lombok.mapstruct_lombok.dtos.GetCategory;
import com.mapstruct_lombok.mapstruct_lombok.entities.Category;
import com.mapstruct_lombok.mapstruct_lombok.repositories.CategoryRepository;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class CategoryMapper {

    @Autowired
    private CategoryRepository categoryRepository;

    abstract GetCategory toGetCategory ( Category category );

    Category toEntity(GetCategory getCategory){
        if (getCategory == null) return null;
        Category category = categoryRepository.findById(getCategory.getId()).orElse(null);

        if(category == null) return null;

        category.setId(getCategory.getId());
        category.setName(getCategory.getName());

        return category;
    }

    abstract List<GetCategory> toGetCategoryList(List<Category> categoryList);
    abstract List<Category> toGetEntityList(List<GetCategory> getCategoryList);
}

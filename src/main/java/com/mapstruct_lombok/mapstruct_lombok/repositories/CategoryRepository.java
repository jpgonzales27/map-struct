package com.mapstruct_lombok.mapstruct_lombok.repositories;

import com.mapstruct_lombok.mapstruct_lombok.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository< Category,Long> {
}

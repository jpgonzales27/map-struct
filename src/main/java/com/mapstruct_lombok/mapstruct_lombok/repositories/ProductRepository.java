package com.mapstruct_lombok.mapstruct_lombok.repositories;

import com.mapstruct_lombok.mapstruct_lombok.entities.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}

package com.mapstruct_lombok.mapstruct_lombok.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    private Long id;

    private String name;

    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}

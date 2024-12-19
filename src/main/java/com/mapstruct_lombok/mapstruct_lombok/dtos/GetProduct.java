package com.mapstruct_lombok.mapstruct_lombok.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetProduct {

    private long id;

    private String name;

    private String creationDate;

    private GetCategory category;

    private String price;
}

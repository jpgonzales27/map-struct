package com.mapstruct_lombok.mapstruct_lombok.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetProduct {

    private Long id;

    private String name;

    private String creationDate;
}

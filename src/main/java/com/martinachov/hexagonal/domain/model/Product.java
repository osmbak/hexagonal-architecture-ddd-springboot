package com.martinachov.hexagonal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//just model
//without create dto or entity Branch 24 2
public class Product {

    private Long id;

    private String name;

    private String description;

}

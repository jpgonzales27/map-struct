package com.mapstruct_lombok.mapstruct_lombok.test;

import com.mapstruct_lombok.mapstruct_lombok.dtos.GetProduct;
import com.mapstruct_lombok.mapstruct_lombok.entities.Product;
import com.mapstruct_lombok.mapstruct_lombok.mapper.ProductMapper;
import com.mapstruct_lombok.mapstruct_lombok.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class InitDatabase {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {

            System.out.println("------------Mapeando objetos individuales----------------");
            List<Product> products = productRepository.findAll();
            System.out.println("---PRODUCTS---");
            products.forEach(System.out::println);

            System.out.println("---DTO PRODUCTS---");
            List<GetProduct> getProductList = products.stream()
                    .map(product -> productMapper.toGetDTO(product)).peek(System.out::println).toList();

            System.out.println("------------Mapeando listas de objetos----------------");

            System.out.println("---DTO PRODUCT LIST---");
            List<GetProduct> getProductList2 = productMapper.toGetProductList(products);
            getProductList2.forEach(System.out::println);

            System.out.println("---ENTITY PRODUCT LIST---");
            List<Product> mappedProducts = productMapper.toEntityProductList(getProductList2);
            mappedProducts.forEach(System.out::println);
        };
    }
}

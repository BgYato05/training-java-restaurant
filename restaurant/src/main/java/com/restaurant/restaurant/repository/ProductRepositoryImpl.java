package com.restaurant.restaurant.repository;

import com.restaurant.restaurant.entity.CategoryProduct;
import com.restaurant.restaurant.entity.ProductEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    //Dummy = datos quemados

    List<ProductEntity> productEntityList = null;

    @Override
    public ProductEntity findProductById(Long id){

        return productEntityList.stream().filter(p -> Objects.equals(p.getId(), id)).findFirst().orElse(null);
    }

    @PostConstruct
    public void init(){
        productEntityList = List.of(
                ProductEntity.builder()
                        .id(1L)
                        .name("Pizza")
                        .uuid(UUID.randomUUID().toString())
                        .description("Pizza de piña")
                        .category(CategoryProduct.MEATS)
                        .price(15000.0)
                        .available(true)
                        .build(),
                ProductEntity.builder()
                        .id(2L)
                        .name("Hamburguesa")
                        .uuid(UUID.randomUUID().toString())
                        .description("Desc2")
                        .category(CategoryProduct.HAMBURGERS_AND_HOTDOGS)
                        .price(7000.0)
                        .available(true)
                        .build(),
                ProductEntity.builder()
                        .id(3L)
                        .name("Papas")
                        .uuid(UUID.randomUUID().toString())
                        .description("Desc3")
                        .category(CategoryProduct.FISH)
                        .price(10000.0)
                        .available(true)
                        .build()
        );
    }
}

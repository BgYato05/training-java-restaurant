package com.restaurant.restaurant.repository;

import com.restaurant.restaurant.entity.ProductEntity;

public interface ProductRepository {
    ProductEntity findProductById(Long id);
}

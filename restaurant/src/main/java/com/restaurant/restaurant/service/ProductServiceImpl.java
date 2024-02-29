package com.restaurant.restaurant.service;

import com.restaurant.restaurant.entity.ProductEntity;
import com.restaurant.restaurant.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService{

    ProductRepository productRepository = null;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String getAllProducts() {
        return "products";
    }

    public ProductEntity getById(Long id) {
        return productRepository.findProductById(id);
    }
}

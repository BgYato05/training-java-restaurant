package com.restaurant.restaurant.controller;

import com.restaurant.restaurant.entity.ProductEntity;
import com.restaurant.restaurant.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping(path = {"/all"})
    public String getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping(path = {"/{id}"})
    public ProductEntity getProduct(@PathVariable Long id){
        return productService.getById(id);
    }
}

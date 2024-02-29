package com.restaurant.restaurant.controller;

import com.restaurant.restaurant.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class OrderController {

    @Autowired
    OrderServiceImpl orderService;

    @GetMapping(path = {"/order/{id}"})
    public String getOrder(){ return orderService.getAllOrders(); }
}

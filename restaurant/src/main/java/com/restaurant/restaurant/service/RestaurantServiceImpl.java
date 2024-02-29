package com.restaurant.restaurant.service;

import org.springframework.stereotype.Service;

//Implements the interface
@Service
public class RestaurantServiceImpl implements IRestaurantService{
    @Override
    public String findAllClients() {
        return "Andres";
    }
}

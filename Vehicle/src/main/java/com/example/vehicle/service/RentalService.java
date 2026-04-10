package com.example.vehicle.service;

import org.springframework.stereotype.Service;

@Service
public class RentalService {

    public double calculateRent(double price, int days) {
        return price * days;
    }
}
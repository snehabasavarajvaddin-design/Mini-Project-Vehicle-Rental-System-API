package com.example.vehicle.controller;

import org.springframework.web.bind.annotation.*;

import com.example.vehicle.model.vehicle;
import com.example.vehicle.service.VehicleService;
import com.example.vehicle.service.RentalService;

@RestController
@RequestMapping("/rent")
public class RentalController {

    private VehicleService vehicleService;
    private RentalService rentalService;

    public RentalController(VehicleService vehicleService, RentalService rentalService) {
        this.vehicleService = vehicleService;
        this.rentalService = rentalService;
    }

    @GetMapping("/{id}/{days}")
    public String rent(@PathVariable int id, @PathVariable int days) {

        vehicle v = vehicleService.getVehicleById(id);

        if (v == null) {
            return "Vehicle not found";
        }

        double total = rentalService.calculateRent(v.getPricePerDay(), days);

        return "Total Rent: " + total;
    }
}
package com.example.vehicle.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.vehicle.model.vehicle;
import com.example.vehicle.service.VehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @GetMapping
    public List<vehicle> getAll() {
        return service.getAllVehicles();
    }
}
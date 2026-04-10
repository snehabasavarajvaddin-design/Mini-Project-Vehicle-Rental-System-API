package com.example.vehicle.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.vehicle.model.vehicle;

@Service
public class VehicleService {

    private List<vehicle> list = new ArrayList<>();

    public VehicleService() {
        list.add(new vehicle(1, "Car", 1000));
        list.add(new vehicle(2, "Bike", 500));
    }

    public List<vehicle> getAllVehicles() {
        return list;
    }

    public vehicle getVehicleById(int id) {
        for (vehicle v : list) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }
}
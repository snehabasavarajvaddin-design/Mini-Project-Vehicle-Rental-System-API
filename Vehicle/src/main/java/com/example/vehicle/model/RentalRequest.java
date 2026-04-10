package com.example.vehicle.model;

public class RentalRequest {

    private int vehicleId;
    private int days;

    public RentalRequest() {}

    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public int getDays() { return days; }
    public void setDays(int days) { this.days = days; }
}
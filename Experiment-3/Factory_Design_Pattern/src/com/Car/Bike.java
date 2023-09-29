package com.Car;

public class Bike implements vehicle
{
    String vehicleType;

    public Bike(String vehicleType)
    {
        this.vehicleType = vehicleType;
        System.out.println("Bike is called");
    }

    @Override
    public void Drive()
    {
        System.out.println("Bike is drive by person");
    }

    @Override
    public String getVehicleType()
    {
        return "Type is "+vehicleType;
    }
}

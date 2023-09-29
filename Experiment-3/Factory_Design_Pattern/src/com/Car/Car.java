package com.Car;

public class Car implements vehicle
{
    String vehicleType;

    public Car(String vehicleType)
    {
        this.vehicleType = vehicleType;
        System.out.println("Car Constructor is called");
    }
    @Override
    public void Drive()
    {
        System.out.println("Car is drive by person");
    }

    @Override
    public String getVehicleType()
    {
        return "Type is "+vehicleType;
    }
}

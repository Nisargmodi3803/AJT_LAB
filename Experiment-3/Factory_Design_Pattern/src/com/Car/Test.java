package com.Car;

public class Test
{
    public static void main(String[] args) {
        vehicleCall vc = new vehicleCall();
        vc.addVehicle("Car");
        vc.addVehicle("Bike");
        vc.call();
    }
}

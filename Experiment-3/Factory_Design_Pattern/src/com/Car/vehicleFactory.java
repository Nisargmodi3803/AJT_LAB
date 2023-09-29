package com.Car;

public class vehicleFactory
{
    public static vehicle getVehicle(String vehicleName)
    {
        switch (vehicleName)
        {
            case "Car":
                return new Car(vehicleName);
            case "Bike":
                return new Bike(vehicleName);
        }
        return null;
    }
}

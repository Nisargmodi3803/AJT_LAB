package com.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class vehicleCall
{
    private List<vehicle> name = new ArrayList<>();

    public void addVehicle(String vehicleType)
    {
        vehicle v = vehicleFactory.getVehicle(vehicleType);
        name.add(v);
    }

    public void call()
    {
        Iterator<vehicle> itr = name.iterator();

        while (itr.hasNext())
        {
            vehicle v = itr.next();
            v.Drive();
            System.out.println(v.getVehicleType());
        }
    }
}

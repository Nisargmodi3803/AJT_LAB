// Shape_factory.java

package com.shape;

public class shape_factory
{
    public static Shape getShape(String shapeName)
    {
        if(shapeName.equalsIgnoreCase("circle"))
            return new Circle(20,20,10);
        else if(shapeName.equalsIgnoreCase("rectangle"))
            return new Rectangle(20,10);
        else
            return null;
    }
}

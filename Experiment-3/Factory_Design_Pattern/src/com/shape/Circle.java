// Circle.java

package com.shape;

public class Circle implements Shape
{
    private int xPoint,yPoint;
    private int radius;

    public Circle(int xPoint,int yPoint,int radius)
    {
        this.xPoint=xPoint;
        this.yPoint=yPoint;
        this.radius=radius;
    }
    @Override
    public void draw()
    {
        System.out.println("Circle of radius "+radius+" is drawn at point ("+xPoint+","+yPoint+")");
    }

    @Override
    public void fill_color()
    {
        System.out.println("Red Color is fill inside circle");
    }
}

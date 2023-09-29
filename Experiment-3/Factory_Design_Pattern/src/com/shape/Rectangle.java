// Rectangle.java

package com.shape;

public class Rectangle implements Shape
{
    private int length,breadth;

    public Rectangle(int length,int breadth)
    {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public void draw()
    {
        System.out.println("Rectangle of length "+length+" & Breadth "+breadth+" is drawn");
    }

    @Override
    public void fill_color()
    {
        System.out.println("Rectangle is fill with pint color");
    }

}

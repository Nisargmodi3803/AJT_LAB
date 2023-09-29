// test.java

package com.shape;

import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Shape Name to draw & fillColor : ");
        String shapeName = sc.next();

        Shape shape = shape_factory.getShape(shapeName);
        shape.draw();
        shape.fill_color();
    }
}

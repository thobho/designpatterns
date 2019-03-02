package com.sda.designpatterns.structural.bridge2;

import java.util.ArrayList;
import java.util.List;

public class ShapesMain {
    public static void main(String[] args) {
        Color red = new RedColor();
        Shape sqare = new Square(red, 2);
        Shape circle = new Circle(red, 10);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(sqare);
        shapes.add(circle);

        for (Shape shape:shapes) {
            System.out.println(shape.color);
        }


    }
}

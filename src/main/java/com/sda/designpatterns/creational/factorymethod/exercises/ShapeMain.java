package com.sda.designpatterns.creational.factorymethod.exercises;

public class ShapeMain {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.randomShape();

        Shape shape1 = ShapeFactory.createShape(2);

        System.out.println(shape);
        System.out.println(shape1);

    }

}

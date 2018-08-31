package com.sda.designpatterns.creational.factorymethod;

public class ShapeFactoryMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println(shapeFactory.createShape(1));
        System.out.println(shapeFactory.createShape(2));
        System.out.println(shapeFactory.createShape(3));
    }

}

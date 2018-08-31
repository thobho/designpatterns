package com.sda.designpatterns.creational.factorymethod;

public class ShapeFactory {
    public Shape createShape(int type) {
        switch (type) {
            case 1:
                return new Circle();
            case 2:
                return new Square();
            case 3:
                return new Triangle();
            default:
                throw new IllegalArgumentException();
        }
    }
}

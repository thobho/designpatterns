package com.sda.designpatterns.creational.factorymethod;

public class ShapeFactory {


    public static Shape createShape(int type) {
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




    public static Shape createShape(String type) {
        if (type.equalsIgnoreCase("kwadrat")) {
            return new Square();
        }
        if (type.equalsIgnoreCase("koło")) {
            return new Circle();
        } else {
            throw new IllegalArgumentException("wrong name");
        }
    }

    public static void main(String[] args) {
        Shape koło = ShapeFactory.createShape("koło");
        Shape kwadrat = ShapeFactory.createShape("kwadrat");
    }
}

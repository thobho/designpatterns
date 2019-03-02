package com.sda.designpatterns.creational.factorymethod;

public class ShapeFactoryMain {

    public static void main(String[] args) {
        System.out.println(randomShape().draw());
    }

    public static Shape randomShape(){
        int random = 2;
        return ShapeFactory.createShape(random);
    }

}

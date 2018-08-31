package com.sda.designpatterns.creational.factorymethod;

public class Triangle implements  Shape{
    public String draw() {
        System.out.println("Drawing triang");
        return "Triangle";
    }
}

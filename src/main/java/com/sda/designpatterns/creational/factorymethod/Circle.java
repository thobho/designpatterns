package com.sda.designpatterns.creational.factorymethod;

public class Circle implements Shape{

    public String draw() {
        System.out.println("Drawing circle");
        return "this is circle";
    }
}

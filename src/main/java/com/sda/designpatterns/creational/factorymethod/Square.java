package com.sda.designpatterns.creational.factorymethod;

public class Square implements Shape {

    public String draw() {
        System.out.println("Drawing square...");
        return "This is square";
    }
}

package com.sda.designpatterns.creational.factorymethod.exercises;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }

    @Override
    public String toString() {
        return "Circle";
    }
}

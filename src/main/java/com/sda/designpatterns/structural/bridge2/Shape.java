package com.sda.designpatterns.structural.bridge2;

public abstract class Shape {
    double area;

    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract double calculateArea();
}

package com.sda.designpatterns.structural.bridge2;

public class Square extends Shape {

    double length;

    public Square(Color color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    double calculateArea() {
        return length * length;
    }
}

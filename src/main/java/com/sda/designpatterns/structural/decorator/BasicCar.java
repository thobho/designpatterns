package com.sda.designpatterns.structural.decorator;

public class BasicCar implements Car {

    public void assemble() {
        System.out.print("Basic Car.");
    }


    public static void main(String[] args) {
        BasicCar basicCar = new BasicCar();
    }
}
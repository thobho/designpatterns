package com.sda.designpatterns.creational.factorymethod.example.animals;

public class Bird extends Animal{
    private int wingsNumber;

    public Bird(int wingsNumber) {
        super("ptak");
        this.wingsNumber = wingsNumber;
    }
}

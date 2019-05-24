package com.sda.designpatterns.creational.factorymethod.example;

public abstract class Animal {
    private String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }
}

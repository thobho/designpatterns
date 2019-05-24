package com.sda.designpatterns.creational.factorymethod.example.animals;

public abstract class Animal {
    private String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }
}

package com.sda.designpatterns.creational.factorymethod.example;

public class Lion extends Animal {

    private String grzywa;

    public Lion(String grzywa) {
        super("lew pospolity");
        this.grzywa = grzywa;
    }
}

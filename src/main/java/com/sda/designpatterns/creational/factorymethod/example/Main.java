package com.sda.designpatterns.creational.factorymethod.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal("lion");
    }
}

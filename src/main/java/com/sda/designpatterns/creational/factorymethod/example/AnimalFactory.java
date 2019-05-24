package com.sda.designpatterns.creational.factorymethod.example;

public class AnimalFactory {

    public static Animal createAnimal(String type){
        switch (type){
            case "lion":
                return new Lion("Wielka grzywa");
            case "bird":
                return new Bird(2);
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        Animal lion = AnimalFactory.createAnimal("lion");


        System.out.println(lion);
    }
}

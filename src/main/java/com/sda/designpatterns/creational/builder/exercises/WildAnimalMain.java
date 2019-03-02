package com.sda.designpatterns.creational.builder.exercises;

import com.sda.designpatterns.creational.builder.Animal;

public class WildAnimalMain {
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimalBuilder("Wolf", 4)
                .setPredator(true)
                .createAnimal();
        System.out.println(wolf);
    }
}

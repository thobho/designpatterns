package com.sda.designpatterns.behavioral.templatemethod.exercises;

public class MakeTea extends MakeHotDrink {

    @Override
    public void boilWater() {
        System.out.println("Zagotuj wódkę");
    }

    @Override
    void prepareIngridiends() {
        System.out.println("Dodaje herbate");
    }

    @Override
    void addSmoething() {
        System.out.println("Dodaje cytryne");
    }
}

package com.sda.designpatterns.behavioral.templatemethod.exercises;

public abstract class MakeHotDrink {

    public void boilWater(){
        System.out.println("gotowanie wody");
    }

    abstract void prepareIngridiends();

    public void pourWater(){
        System.out.println("Wlewanie wody");
    }

    abstract void addSmoething();

    public void mix(){
        System.out.println("Mix");
    }

    //TEMPLATE METHOD

    public void makeDring(){
        boilWater();
        prepareIngridiends();
        pourWater();
        addSmoething();
        mix();
    }

}

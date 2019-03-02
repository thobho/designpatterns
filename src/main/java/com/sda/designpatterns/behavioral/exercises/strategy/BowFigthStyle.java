package com.sda.designpatterns.behavioral.exercises.strategy;

public class BowFigthStyle implements FightStyle {

    @Override
    public void fight() {
        System.out.println("I am shooting arrows from my bow!!!");
    }
}

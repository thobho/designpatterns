package com.sda.designpatterns.behavioral.exercises.strategy;

public class SwordFightStyle implements FightStyle {
    @Override
    public void fight() {
        System.out.println("HAAA! I am fighting with my sword!!");
    }
}

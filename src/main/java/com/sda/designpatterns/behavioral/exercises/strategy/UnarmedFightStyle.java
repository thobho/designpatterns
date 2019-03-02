package com.sda.designpatterns.behavioral.exercises.strategy;

public class UnarmedFightStyle implements FightStyle{
    @Override
    public void fight() {
        System.out.println("I have no weapon!");
    }
}

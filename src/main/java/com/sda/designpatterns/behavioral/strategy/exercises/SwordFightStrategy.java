package com.sda.designpatterns.behavioral.strategy.exercises;

public class SwordFightStrategy implements FightStrategy{
    @Override
    public void fight() {
        System.out.println("Walczę mieczem!!!!");
    }
}

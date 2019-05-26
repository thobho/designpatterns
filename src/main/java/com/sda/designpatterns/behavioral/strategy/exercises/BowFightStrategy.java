package com.sda.designpatterns.behavioral.strategy.exercises;

public class BowFightStrategy implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("walczę łukiem!!!");
    }
}

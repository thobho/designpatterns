package com.sda.designpatterns.behavioral.strategy.exercises;

public class Hero {
    private String name;
    private FightStrategy fightStrategy;

    public Hero(String name) {
        this.name = name;
        this.fightStrategy = new DefaultFightStrategy();
    }

    public FightStrategy getFightStrategy() {
        return fightStrategy;
    }

    public void setFightStrategy(FightStrategy fightStrategy) {
        this.fightStrategy = fightStrategy;
    }
}

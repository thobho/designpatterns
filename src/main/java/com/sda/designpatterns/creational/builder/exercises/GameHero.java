package com.sda.designpatterns.creational.builder.exercises;

public class GameHero {
    private String name;
    private boolean isImmortal;
    private int health;

    public GameHero(String name, boolean isImmortal, int health) {
        this.name = name;
        this.isImmortal = isImmortal;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isImmortal() {
        return isImmortal;
    }

    public void setImmortal(boolean immortal) {
        isImmortal = immortal;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "GameHero{" +
                "name='" + name + '\'' +
                ", isImmortal=" + isImmortal +
                ", health=" + health +
                '}';
    }
}


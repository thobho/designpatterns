package com.sda.designpatterns.creational.builder.exercises;

public class GameHeroBuilder {
    private String name;
    private boolean isImmortal;
    private int health;

    public GameHeroBuilder(String name) {
        this.name = name;
    }

    public GameHeroBuilder setImmortal(boolean immortal) {
        isImmortal = immortal;
        return this;
    }

    public GameHeroBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public GameHero createHero(){
        return new GameHero(this.name, this.isImmortal, this.health);
    }
}

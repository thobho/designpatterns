package com.sda.designpatterns.creational.builder.exercises;

public class GameHeroTest {
    public static void main(String[] args) {
        GameHero jack = new GameHeroBuilder("Jack")
                .setHealth(100)
                .setImmortal(true)
                .createHero();
        System.out.println(jack);
    }
}

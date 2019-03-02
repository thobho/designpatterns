package com.sda.designpatterns.behavioral.exercises.template;

public class FootballGame extends Game {
    @Override
    void prepareField() {
        System.out.println("Prepare football square");
    }

    @Override
    void endGame() {
        System.out.println("End football game");
    }
}

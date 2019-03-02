package com.sda.designpatterns.behavioral.exercises.template;

public abstract class Game {
    void initialze(){
        System.out.println("Przygotowanie zawodników, rozgrzewka.");
    }

    abstract void prepareField();

    void play(){
        System.out.println("GRAMY!!!");
    }

    abstract void endGame();
    //starts game and assemble it from template
    void startGame(){
        initialze();
        prepareField();
        play();
        endGame();
    }

}

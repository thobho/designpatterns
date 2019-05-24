package com.sda.designpatterns.behavioral.templatemethod;

import java.util.List;

public abstract class Game {

    List<String> players;

    void initialize(){
        System.out.println("Inicjalizacja boiska");
    }

    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}

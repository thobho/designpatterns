package com.sda.designpatterns.behavioral.strategy3;

public interface WalczStrategy {

    void walcz(String nazwaWroga);

    default boolean czyJestWrogiem(String nazwaWroga){
        return !nazwaWroga.toLowerCase().contains("krasno");
    }
}

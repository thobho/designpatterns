package com.sda.designpatterns.behavioral.strategy3;

public class WalczStrategyMieczem implements WalczStrategy {
    @Override
    public void walcz(String nazwaWroga) {
        if (czyJestWrogiem(nazwaWroga)) {
            System.out.println("Walczę mieczem z " + nazwaWroga);
        } else {
            System.out.println("To mój ziomek - nie walczę z nim!");
        }

    }
}

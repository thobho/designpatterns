package com.sda.designpatterns.behavioral.strategy3;

public class Hero {

    private WalczStrategy walczStrategy;

    public Hero() {
        this.walczStrategy = new WalczStrategyMieczem();
    }

    public WalczStrategy getWalczStrategy() {
        return walczStrategy;
    }

    public void setWalczStrategy(WalczStrategy walczStrategy) {
        this.walczStrategy = walczStrategy;
    }

    void walcz(String nazwaWroga){
        walczStrategy.walcz(nazwaWroga);
    }

    public static void main(String[] args) {
        Hero krsnolod = new Hero();

        krsnolod.walcz("krasvno");
    }
}

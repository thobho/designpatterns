package com.sda.designpatterns.behavioral.chain2;

public class Handler50 implements Handler{

    private static final int AMOUNT_OF_HADLER = 50;

    private Handler nextHandler;

    public Handler50(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public Handler getNextHandler() {
        return nextHandler;
    }

    @Override
    public int handle(int amountOfMoney) {
        System.out.println("Wydaję " + amountOfMoney / AMOUNT_OF_HADLER + " x 50zł");
        return amountOfMoney % AMOUNT_OF_HADLER;
    }
}

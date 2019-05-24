package com.sda.designpatterns.behavioral.chain2;

public class Handler100 implements Handler{

    private Handler nextHandler;

    public Handler100(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public Handler getNextHandler() {
        return nextHandler;
    }

    @Override
    public int handle(int amountOfMoney) {
        System.out.println("Wydaję " + amountOfMoney / 100 + " x 100zł");
        return amountOfMoney % 100;
    }
}

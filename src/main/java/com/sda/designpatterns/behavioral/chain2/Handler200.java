package com.sda.designpatterns.behavioral.chain2;

public class Handler200 implements Handler {

    private Handler nextHandler;

    public Handler200() {
    }

    public Handler200(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public Handler getNextHandler() {
        return nextHandler;
    }

    @Override
    public int handle(int amountOfMoney) {
        System.out.println("Wydaję " + amountOfMoney / 200 + " x 200zł");
        return amountOfMoney % 200;
    }
}

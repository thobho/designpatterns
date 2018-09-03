package com.sda.designpatterns.behavioral.chain2;

public class Handler100 implements Handler{

    private Handler nextHandler;

    @Override
    public Handler getNextHandler() {
        return nextHandler;
    }

    @Override
    public int handle(int amountOfMoney) {
        System.out.println(amountOfMoney % 100);
        return amountOfMoney % 100;
    }
}

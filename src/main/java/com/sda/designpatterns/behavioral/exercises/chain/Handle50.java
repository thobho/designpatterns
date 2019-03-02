package com.sda.designpatterns.behavioral.exercises.chain;

public class Handle50 implements Handler {

    Handler handler;

    public Handle50(Handler handler) {
        this.handler = handler;
    }

    @Override
    public int handle(int amountOfMoney) {
        System.out.println("Liczba nominałów 50:" + amountOfMoney/50);
        return amountOfMoney % 50;
    }

    @Override
    public Handler nextHandler() {
        return handler;
    }
}

package com.sda.designpatterns.behavioral.exercises.chain;

import com.sun.istack.internal.logging.Logger;

import java.util.logging.Level;

public class GeneralHadler implements Handler {

    Logger logger = Logger.getLogger(GeneralHadler.class);

    int nominal;
    Handler nextHandler;

    public GeneralHadler(int nominal, Handler nextHandler) {
        this.nominal = nominal;
        this.nextHandler = nextHandler;
    }

    @Override
    public int handle(int amountOfMoney) {
        logger.log(Level.WARNING, "test");
        System.out.println("Liczba nominałów " + nominal + ":" + amountOfMoney / nominal);
        return amountOfMoney % nominal;
    }

    @Override
    public Handler nextHandler() {
        return nextHandler;
    }
}

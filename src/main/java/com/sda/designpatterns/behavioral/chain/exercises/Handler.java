package com.sda.designpatterns.behavioral.chain.exercises;

public interface Handler {

    Handler getNextHandler();

    int handle(int amountOfMoney);

}

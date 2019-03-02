package com.sda.designpatterns.behavioral.exercises.chain;

public interface Handler {
    int handle(int amountOfMoney);

    Handler nextHandler();
}

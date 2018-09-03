package com.sda.designpatterns.behavioral.chain2;

public interface Handler {

    Handler getNextHandler();

    int handle(int amountOfMoney);

}

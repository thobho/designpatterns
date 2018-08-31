package com.sda.designpatterns.behavioral.strategy;


public class Cash implements PaymentMethod {
    @Override
    public void pay(int cents) {
        System.out.println("Payed " + cents + " cents using cash");
    }
}
package com.sda.designpatterns.behavioral.chain2;

public class Main {

    public static void main(String[] args) {
        Handler100 handler100 = new Handler100();
        Handler200 handler200 = new Handler200(handler100);


        Handler current = handler200;
        int currentAmount = 900;

        while (current != null) {
            currentAmount = current.handle(currentAmount);
            current = current.getNextHandler();

        }
    }
}

package com.sda.designpatterns.behavioral.chain2;

public class Main {

    public static void main(String[] args) {

        Handler50 handler50 = new Handler50(null);
        Handler100 handler100 = new Handler100(handler50);
        Handler200 handler200 = new Handler200(handler100);


        Handler currentProcessingHandler = handler200;
        int currentAmount = 900;

        while (currentProcessingHandler != null) {
            currentAmount = currentProcessingHandler.handle(currentAmount);
            currentProcessingHandler = currentProcessingHandler.getNextHandler();

        }
    }
}

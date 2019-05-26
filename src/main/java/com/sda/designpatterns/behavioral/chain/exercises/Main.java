package com.sda.designpatterns.behavioral.chain.exercises;
//handler main
public class Main {

    public static void main(String[] args) {

        Handler200 handler200 = new Handler200(null);

        Handler currentProcessingHandler = handler200;
        int currentAmount = 900;

        while (currentProcessingHandler != null) {
            currentAmount = currentProcessingHandler.handle(currentAmount);
            currentProcessingHandler = currentProcessingHandler.getNextHandler();

        }
    }
}

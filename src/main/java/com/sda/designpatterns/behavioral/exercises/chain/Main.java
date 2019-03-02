package com.sda.designpatterns.behavioral.exercises.chain;

public class Main {
    public static void main(String[] args) {

//        Handler handler10 = new Handle10(null);
//        Handler handler20 = new Handle20(handler10);
//        Handler handler50 = new Handle50(handler20);

        Handler handler10 = new GeneralHadler(10, null);
        Handler handler20 = new GeneralHadler(20, handler10);
        Handler handler50 = new GeneralHadler(50, handler20);

        int money = 880;

        Handler actualProcessingHandler = handler50;
        int actualAmount = money;

        while (actualProcessingHandler != null){
            actualAmount = actualProcessingHandler.handle(actualAmount);
            actualProcessingHandler = actualProcessingHandler.nextHandler();
        }
    }
}

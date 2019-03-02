package com.sda.designpatterns.behavioral.exercises.observer;

public class ConsoleRandomIntObserver implements Observer {
    @Override
    public void handleSubjectMessage(int randomInteger) {
        System.out.println(randomInteger);
    }
}

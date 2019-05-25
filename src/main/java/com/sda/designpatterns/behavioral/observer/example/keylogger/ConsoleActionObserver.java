package com.sda.designpatterns.behavioral.observer.example.keylogger;

public class ConsoleActionObserver implements Observer {
    @Override
    public void update(String text) {
        System.out.println("Uzytkownik napisał: " + text);
    }
}

package com.sda.designpatterns.behavioral.observer3;

public class ConsoleActionObserver implements Observer {
    @Override
    public void update(int number) {
        System.out.println("Uzytkownik wcisnął: " + number);
    }
}

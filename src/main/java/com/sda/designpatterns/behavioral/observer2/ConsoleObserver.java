package com.sda.designpatterns.behavioral.observer2;

public class ConsoleObserver implements Observer {
    @Override
    public void update(int number) {
        System.out.println(number);
    }
}

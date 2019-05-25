package com.sda.designpatterns.behavioral.observer.example.randomNumerGenerator;

public class ConsoleObserver implements Observer {
    @Override
    public void update(int number) {
        System.out.println(number);
    }
}

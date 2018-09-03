package com.sda.designpatterns.behavioral.observer3;

import java.util.ArrayList;
import java.util.List;

public class KeyPressObservable implements Observable {

    private List<Observer> observableList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Observer sie zarejestrował");
        observableList.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observableList.remove(observer);
    }

    @Override
    public void notifyObservers(int number) {
        for (Observer observer : observableList) {
            observer.update(number);
        }
    }
}

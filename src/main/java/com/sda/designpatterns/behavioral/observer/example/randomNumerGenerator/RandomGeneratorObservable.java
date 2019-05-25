package com.sda.designpatterns.behavioral.observer.example.randomNumerGenerator;

import java.util.ArrayList;
import java.util.List;

public class RandomGeneratorObservable implements Observable{

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(int number) {

        for (Observer obs : observerList) {
            obs.update(number);
        }
    }
}

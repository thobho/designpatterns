package com.sda.designpatterns.behavioral.observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        observerList.forEach(observer -> observer.update(number));
    }
}

package com.sda.designpatterns.behavioral.observer.example.randomNumerGenerator;

public interface Observable {

    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers(int number);

}

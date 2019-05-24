package com.sda.designpatterns.behavioral.observer2;

public interface Observable {

    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers(int number);

}

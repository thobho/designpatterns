package com.sda.designpatterns.behavioral.exercises.observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(int message);
}

package com.sda.designpatterns.behavioral.exercises.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntGenerator implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int message) {
        for (Observer observer : observers) {
            observer.handleSubjectMessage(message);
        }
    }

    public void generateNumbers(){
        //sposób na tworznie liczb w osobnym wątku
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(new Random().nextInt() % 1000 + 1000);
                    int number = new Random().nextInt();
                    notifyObservers(number);
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException();
            }
        });
        thread.start();
    }
}

package com.sda.designpatterns.behavioral.exercises.observer;

public class RandomIntsMain {
    public static void main(String[] args) {
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        ConsoleRandomIntObserver consoleRandomIntObserver = new ConsoleRandomIntObserver();
        randomIntGenerator.subscribe(consoleRandomIntObserver);
        randomIntGenerator.generateNumbers();
        randomIntGenerator.unsubscribe(consoleRandomIntObserver);
    }
}

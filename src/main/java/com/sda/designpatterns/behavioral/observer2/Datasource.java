package com.sda.designpatterns.behavioral.observer2;

import java.util.Random;

public class Datasource {
    public static void generate() {
        RandomGenerator randomGenerator = new RandomGenerator();
        randomGenerator.registerObserver(new ConsoleObserver());
        //sposób na tworznie liczb w osobnym wątku
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(new Random().nextInt() % 1000 + 1000);
                    randomGenerator.notifyObservers(new Random().nextInt());
                }
            } catch (InterruptedException e) {

            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        Datasource.generate();
    }
}

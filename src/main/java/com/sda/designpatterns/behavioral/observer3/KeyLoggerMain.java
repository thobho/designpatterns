package com.sda.designpatterns.behavioral.observer3;

import java.util.Scanner;

public class KeyLoggerMain {
    private static ConsoleActionObserver consoleActionObserver = new ConsoleActionObserver();
    private static KeyPressObservable keyPressObservable = new KeyPressObservable();

    public static void main(String[] args) {
        keyPressObservable.registerObserver(consoleActionObserver);

        Scanner scanner = new Scanner(System.in);

        while (true){
            char c = scanner.next().charAt(0);
            keyPressObservable.notifyObservers(c);
        }

    }
}

package com.sda.designpatterns.behavioral.observer3;

import java.util.Scanner;

public class KeyLoggerMain {
    private static ConsoleActionObserver consoleActionObserver = new ConsoleActionObserver();
    private static FileLoggerObserver fileLoggerObserver = new FileLoggerObserver();
    private static KeyPressObservable keyPressObservable = new KeyPressObservable();

    public static void main(String[] args) {
        keyPressObservable.registerObserver(consoleActionObserver);
        keyPressObservable.registerObserver(fileLoggerObserver);

        Scanner scanner = new Scanner(System.in);

        while (true){
            keyPressObservable.notifyObservers(scanner.nextLine());
        }

    }
}

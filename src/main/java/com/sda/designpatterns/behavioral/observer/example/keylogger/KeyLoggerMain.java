package com.sda.designpatterns.behavioral.observer.example.keylogger;

import java.util.Scanner;

public class KeyLoggerMain {
    private static ConsoleActionObserver consoleActionObserver = new ConsoleActionObserver();
    private static KeyPressObservable keyPressObservable = new KeyPressObservable();

    //dodana!
    private static FileActionObserver fileActionObserver = new FileActionObserver();

    public static void main(String[] args) {
        keyPressObservable.registerObserver(consoleActionObserver);

        //dodana!!
        keyPressObservable.registerObserver(fileActionObserver);
        Scanner scanner = new Scanner(System.in);

        while (true){
            String inputText = scanner.nextLine(); //w tym miejscu program jest zblokwowany
            keyPressObservable.notifyObservers(inputText);
        }

    }
}

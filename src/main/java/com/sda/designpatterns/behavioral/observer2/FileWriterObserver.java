package com.sda.designpatterns.behavioral.observer2;

import java.io.FileWriter;

public class FileWriterObserver implements Observer {
    @Override
    public void update(int number) {
        try {
            FileWriter fileWriter = new FileWriter("observer.txt");
            fileWriter.write(new Integer(number).toString());
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}


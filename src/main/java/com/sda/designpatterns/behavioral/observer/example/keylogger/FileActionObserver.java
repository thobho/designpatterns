package com.sda.designpatterns.behavioral.observer.example.keylogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileActionObserver implements Observer {

    File file = new File("log.txt");

    public FileActionObserver() {
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Nie można stworzyć pliku");
        }
    }

    @Override
    public void update(String text) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(new Date().toString() + " | " +text+"\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

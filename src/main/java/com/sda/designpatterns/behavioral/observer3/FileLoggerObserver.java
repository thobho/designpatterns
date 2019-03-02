package com.sda.designpatterns.behavioral.observer3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLoggerObserver implements Observer {

    File file = new File("log.txt");

    public FileLoggerObserver() {
        try {
            file.createNewFile();
        } catch (IOException e) {

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

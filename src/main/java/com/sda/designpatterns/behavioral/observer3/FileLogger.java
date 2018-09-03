package com.sda.designpatterns.behavioral.observer3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Observer {

    File file = new File("log.txt");

    public FileLogger() {
        try {
            file.createNewFile();
        } catch (IOException e) {

        }
    }

    @Override
    public void update(int number) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(number);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

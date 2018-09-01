package com.sda.designpatterns.creational.singleton;

import sun.reflect.generics.scope.DummyScope;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    private static MyWindow INSTANCE;

    private MyWindow(String title) {
        super(title);
        this.setSize(300, 300);
        this.setVisible(true);

    }

    public static MyWindow getINSTANCE(String windowTitle) {
        if (INSTANCE == null) {
            INSTANCE = new MyWindow(windowTitle);
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        MyWindow.getINSTANCE("title");
    }


}


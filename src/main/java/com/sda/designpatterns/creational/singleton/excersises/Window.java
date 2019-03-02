package com.sda.designpatterns.creational.singleton.excersises;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private static Window window = new Window();

    public static Window getWindow() {
        return window;
    }

    private JButton jButton;

    private Window() throws HeadlessException {
        super("OKNO");
        this.jButton = new JButton("button");
        this.add(jButton);
        this.setSize(200,200);
    }

    public static void showWindow() {
        window.setVisible(true);
    }
}

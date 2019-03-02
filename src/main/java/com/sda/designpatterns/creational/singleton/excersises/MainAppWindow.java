package com.sda.designpatterns.creational.singleton.excersises;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainAppWindow extends JFrame {

    private String welcomeMessage;

    private static final MainAppWindow INSTANCE = new MainAppWindow();

    private JButton jButton;

    private MainAppWindow() {
        super("OKNO");
        this.jButton = new JButton("button");


        this.jButton.addActionListener((event) -> {
            System.out.println("Hello!");
        });


//        ActionListener hej = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("HEJ");
//            }
//        };
//
//        this.jButton.addActionListener(hej);

        this.add(jButton);
        this.setSize(200, 200);
    }

    static MainAppWindow getInstance() {
        return INSTANCE;
    }

    public static void showWindow() {
        INSTANCE.setVisible(true);
    }
}

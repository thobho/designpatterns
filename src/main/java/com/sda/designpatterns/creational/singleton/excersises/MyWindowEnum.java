package com.sda.designpatterns.creational.singleton.excersises;

import javax.swing.*;

public enum MyWindowEnum {
    INSTANCE("nazwa");

    MyWindowEnum(String title) {
        JFrame window = new JFrame(title);
        window.setSize(200,200);
        window.setVisible(true);

    }

    public static void main(String[] args) {
        MyWindowEnum instance = MyWindowEnum.INSTANCE;
    }
}

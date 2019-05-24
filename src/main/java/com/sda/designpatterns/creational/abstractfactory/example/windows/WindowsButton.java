package com.sda.designpatterns.creational.abstractfactory.example.windows;

import com.sda.designpatterns.creational.abstractfactory.example.Button;

public class WindowsButton implements Button {
    public void paint() {
        System.out.println("Windows button created");
    }
}

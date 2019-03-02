package com.sda.designpatterns.creational.singleton.excersises;

public class Main {

    public static void main(String[] args) {
        MainAppWindow instance = MainAppWindow.getInstance();
        MainAppWindow instance2 = MainAppWindow.getInstance();
        MainAppWindow instance3 = MainAppWindow.getInstance();
        MainAppWindow instance4 = MainAppWindow.getInstance();
        MainAppWindow.showWindow();
    }
}

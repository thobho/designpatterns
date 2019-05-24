package com.sda.designpatterns.creational.singleton.examples;

public class MySingletonTest {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton mySingleton2 = MySingleton.getInstance();

    }
}

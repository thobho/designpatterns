package com.sda.designpatterns.creational.singleton.examples;

public class SingletonDemo {
    public static void main(String[] args) {
        ApplicationWindowThreadSafe window = ApplicationWindowThreadSafe.getInstance();
        ApplicationWindowThreadSafe window2 = ApplicationWindowThreadSafe.getInstance();
        ApplicationWindowThreadSafe window3 = ApplicationWindowThreadSafe.getInstance();




        System.out.println("end");

    }
}

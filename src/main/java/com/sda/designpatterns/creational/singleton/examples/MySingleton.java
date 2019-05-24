package com.sda.designpatterns.creational.singleton.examples;

public class MySingleton {

    private static MySingleton ONLY_ONE_INSTANCE = new MySingleton();

    private MySingleton(){
        //do nothing
    }

    public static MySingleton getInstance(){
        return ONLY_ONE_INSTANCE;
    }

}

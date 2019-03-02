package com.sda.designpatterns.creational.singleton.examples;

public class ApplicationWindowThreadSafe {

    private static final ApplicationWindowThreadSafe instance = new ApplicationWindowThreadSafe();

    private ApplicationWindowThreadSafe(){
        //private constructor
    }

    public static ApplicationWindowThreadSafe getInstance() {
        return instance;
    }
}

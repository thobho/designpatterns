package com.sda.designpatterns.creational.singleton.examples;

public class ApplicationWindowClassic {

    private static ApplicationWindowClassic instance;

    private ApplicationWindowClassic(){
        //private constructor top prevent instantiation
    }

    public static ApplicationWindowClassic getInstance(){
        if(instance == null){
            instance = new ApplicationWindowClassic();
        }
        return instance;
    }
}
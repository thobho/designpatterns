package com.sda.designpatterns.creational.builder.examples;

public class BuilderMain {

    public static void main(String[] args) {

        Person person = new PersonBuilder("Jan", "Kowalski")
                .setNewCity("Wrocław")
                .setNewIsEmployed(true)
                .setNewIsFemale(false)
                .createPerson();

    }
}

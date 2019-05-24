package com.sda.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {

        PersonBuilder personBuilder = new PersonBuilder("Janusz", "Kowalski");

        Person person = personBuilder
                .setNewCity("dasda")
                .setNewStreetAddress("dasda")
                .createPerson();

    }
}

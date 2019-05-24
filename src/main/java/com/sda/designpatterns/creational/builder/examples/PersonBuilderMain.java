package com.sda.designpatterns.creational.builder.examples;

public class PersonBuilderMain {

    public static void main(String[] args) {
        Person person = new PersonBuilder("Adam", "Kowalski")
                .setNewState("")
                .setNewCity("Wrocław")
                .setNewIsFemale(false)
                .setNewStreetAddress("ul. Powstańców").createPerson();


        Person adam = new Person();
        adam.setCity("Wroc");
    }

}

package com.sda.designpatterns.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {


        Person person = new PersonBuilder("safhj", "test")
                .setNewCity("City")
                .setNewCity("das")
                .createPerson();


        Person person2 = new Person.PersonBuilder("test", "test2,", "test3")
                .lastName("AS:DLK")
                .isHomeOwner(false)
                .createPerson();
        System.out.println(person);
        System.out.println(person2);
    }

}

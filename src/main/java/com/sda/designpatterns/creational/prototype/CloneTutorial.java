package com.sda.designpatterns.creational.prototype;

import javax.sound.midi.Soundbank;
import java.security.PublicKey;
import java.util.concurrent.atomic.AtomicLongArray;

public class CloneTutorial {


    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Janusz", 20, new Address("ul. Ołowiana", "Wrocław"));

        Person clone = person.clone();

        System.out.printf(person.toString());
        System.out.printf(clone.toString());
        System.out.println("End");
    }


    static class Person implements Cloneable {

        public Person(String name, int age, Address address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public Address getAddress() {
            return address;
        }

        private String name;
        private int age;
        private Address address;

        public Person clone() throws CloneNotSupportedException {
            Person clone = (Person) super.clone();
            clone.setAddress(this.address.clone());
            return clone;
        }
    }

    static class Address implements Cloneable {
        private String address;
        private String city;

        public Address(String address, String city) {
            this.address = address;
            this.city = city;
        }

        public Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }
    }

}

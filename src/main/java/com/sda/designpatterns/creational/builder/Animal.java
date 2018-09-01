package com.sda.designpatterns.creational.builder;

public class Animal {

    private String name;
    private int age;
    private Heart heart;


    public Animal(Animal animalToCopy) {
        this.name = animalToCopy.getName();
        this.age = animalToCopy.getAge();
        this.heart = new Heart(animalToCopy.getHeart());
    }

    public Heart getHeart() {
        return heart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final class AnimalBuilder {
        private String name;
        private int age;

        private AnimalBuilder() {
        }

        public static AnimalBuilder anAnimal() {
            return new AnimalBuilder();
        }

        public AnimalBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder withAge(int age) {
            this.age = age;
            return this;
        }

    }
}

package com.sda.designpatterns.creational.builder.exercises;

public class WildAnimal {

    private String specesName; //not null
    private int legsCount;
    private boolean isPredator;
    private double weight;
    private String diet;

    public WildAnimal(String specesName, int legsCount, boolean isPredator, double weight, String diet) {
        this.specesName = specesName;
        this.legsCount = legsCount;
        this.isPredator = isPredator;
        this.weight = weight;
        this.diet = diet;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "specesName='" + specesName + '\'' +
                ", legsCount=" + legsCount +
                ", isPredator=" + isPredator +
                ", weight=" + weight +
                ", diet='" + diet + '\'' +
                '}';
    }
}

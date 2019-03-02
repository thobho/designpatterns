package com.sda.designpatterns.creational.builder.exercises;

public class WildAnimalBuilder {
    private String specesName; //not null
    private int legsCount;
    private boolean isPredator;
    private double weight;
    private String diet;

    public WildAnimalBuilder(String specesName, int legsCount) {
        this.specesName = specesName;
        this.legsCount = legsCount;
    }

    public WildAnimalBuilder setSpecesName(String specesName) {
        this.specesName = specesName;
        return this;
    }

    public WildAnimalBuilder setLegsCount(int legsCount) {
        this.legsCount = legsCount;
        return this;
    }

    public WildAnimalBuilder setPredator(boolean predator) {
        isPredator = predator;
        return this;
    }

    public WildAnimalBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public WildAnimalBuilder setDiet(String diet) {
        this.diet = diet;
        return this;
    }

    public WildAnimal createAnimal(){
        return new WildAnimal(specesName, legsCount, isPredator, weight, diet);
    }
}

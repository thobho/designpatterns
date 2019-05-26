package com.sda.designpatterns.creational.builder.examples;

public class PersonBuilder
{
    private String newLastName;
    private String newFirstName;
    private String newMiddleName;
    private String newSalutation;
    private String newSuffix;
    private String newStreetAddress;
    private String newCity;
    private String newState;
    private boolean newIsFemale;
    private boolean newIsEmployed;
    private boolean newIsHomeOwner;

    public PersonBuilder(String newLastName, String newFirstName) {
        this.newFirstName = newFirstName;
        this.newLastName = newLastName;
    }

    public PersonBuilder setNewMiddleName(String newMiddleName) {
        this.newMiddleName = newMiddleName;
        return this;
    }

    public PersonBuilder setNewSalutation(String newSalutation) {
        this.newSalutation = newSalutation;
        return this;
    }

    public PersonBuilder setNewSuffix(String newSuffix) {
        this.newSuffix = newSuffix;
        return this;
    }

    public PersonBuilder setNewStreetAddress(String newStreetAddress) {
        this.newStreetAddress = newStreetAddress;
        return this;
    }

    public PersonBuilder setNewCity(String newCity) {
        this.newCity = newCity;
        return this;
    }

    public PersonBuilder setNewState(String newState) {
        this.newState = newState;
        return this;
    }

    public PersonBuilder setNewIsFemale(boolean newIsFemale) {
        this.newIsFemale = newIsFemale;
        return this;
    }

    public PersonBuilder setNewIsEmployed(boolean newIsEmployed) {
        this.newIsEmployed = newIsEmployed;
        return this;
    }

    public PersonBuilder setNewIsHomeOwner(boolean newIsHomeOwner) {
        this.newIsHomeOwner = newIsHomeOwner;
        return this;
    }

    public Person createPerson() {
        return new Person(this.newLastName,
                this.newFirstName,
                this.newMiddleName,
                this.newSalutation,
                this.newSuffix,
                this.newStreetAddress,
                this.newCity,
                this.newState,
                this.newIsFemale,
                this.newIsEmployed,
                this.newIsHomeOwner
        );
    }

}
package io.zipcoder;

public class Parrot extends Pet {

    public Parrot() {
        super();
        species = "Parrot";
    }

    public Parrot(String name) {
        this.name = name;
        species = "Parrot";
    }

    public String speak() {
        return "Squaawk";
    }

}

package io.zipcoder;

public class Dog extends Pet {

    public Dog() {
        super();
        species = "Dog";
    }

    public Dog(String name) {
        this.name = name;
        species = "Dog";
    }

    public String speak() {
        return "Woof";
    }

}

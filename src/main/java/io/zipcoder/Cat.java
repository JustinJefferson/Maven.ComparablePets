package io.zipcoder;

public class Cat extends Pet {

    public Cat() {
        super();
        species = "Cat";
    }

    public Cat(String name) {
        this.name = name;
        species = "Cat";
    }

    public String speak() {
        return "Miau";
    }


}

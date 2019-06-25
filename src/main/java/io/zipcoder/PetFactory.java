package io.zipcoder;

public class PetFactory {

    public static Pet createPet(String pet, String name) {
        return null;
    }

    protected static Cat createCat(String name){
        return new Cat(name);
    }

    protected static Dog createDog(String name){
        return new Dog(name);
    }

    protected static Parrot createParrot(String name) {
        return new Parrot(name);
    }
}

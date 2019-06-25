package io.zipcoder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PetFactoryTest {

    @Test
    public void createCatTest(){

        //Given
        String name = "Lulu";

        //When
        Cat cat = PetFactory.createCat(name);

        //Then
        assertTrue(cat instanceof Cat);
        assertEquals(name, cat.getName());

    }

    @Test
    public void createDogTest(){

        //Given
        String name = "Lulu";

        //When
        Dog dog = PetFactory.createDog(name);

        //Then
        assertTrue(dog instanceof Dog);
        assertEquals(name, dog.getName());

    }

    @Test
    public void createParrotTest(){

        //Given
        String name = "Lulu";

        //When
        Parrot parrot = PetFactory.createParrot(name);

        //Then
        assertTrue(parrot instanceof Parrot);
        assertEquals(name, parrot.getName());

    }

}

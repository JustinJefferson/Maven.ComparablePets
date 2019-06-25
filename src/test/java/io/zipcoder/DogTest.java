package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest(){
        // Given
        Pet cat = new Dog();

        // When
        String actualSpeak = cat.speak();

        // Assert
        String expectedSpeak = "Woof";
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void defaultConstructorTest(){
        // Given
        Pet cat = new Dog();

        // When
        String actualName = cat.getName();

        // Assert
        String expectedName = "no name set";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nameConstructorTest(){
        // Given
        String expected = "Jeff";
        Pet cat = new Dog(expected);

        // When
        String actual = cat.getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }
}
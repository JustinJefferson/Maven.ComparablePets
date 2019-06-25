package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest(){
        // Given
        Pet cat = new Cat();

        // When
        String actualSpeak = cat.speak();

        // Assert
        String expectedSpeak = "Miau";
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void defaultConstructorTest(){
        // Given
        Pet cat = new Cat();

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
        Pet cat = new Cat(expected);

        // When
        String actual = cat.getName();

        // Assert
        Assert.assertEquals(expected, actual);
    }
}
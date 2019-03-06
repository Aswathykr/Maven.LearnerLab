package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void PersonContructorTest(){

        //Given
        long expectedID = 23098;
        //When
        Person person =  new Person(expectedID);
        //Then
        long retrievedID = person.getId();
        Assert.assertEquals(retrievedID, expectedID);
    }

    @Test
    public void getIdTest() {
        long expectedID = 11111;
        Person person =  new Person(expectedID);
        long retrievedID = person.getId();
        Assert.assertEquals(retrievedID, expectedID);
    }

    @Test // Covers the setter test as well
    public void getNameTest() {
        long expectedID = 11111;
        String expectedName = "Aswathy";
        Person person =  new Person(expectedID);
        person.setName(expectedName);
        String retrievedName = person.getName();

        Assert.assertEquals(retrievedName, expectedName);
    }

}

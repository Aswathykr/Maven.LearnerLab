package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class TestPeople {

    @Test
    public void testAdd(){
        long id = 9876989;
        Person person = new Person(id);
        People people = new People();
        people.add(person);
        people.add(person);

        int retrievednumber = people.getCount();
        Assert.assertEquals(retrievednumber, 2);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemove(){
        long id = 9876;
        Person person = new Person(id);
        People people = new People();
        people.add(person);

        Person retrievedPerson = people.findById(id);
        Assert.assertEquals(retrievedPerson, person);

        people.remove(id);
        retrievedPerson = people.findById(id);

    }

    @Test
    public void testFindById(){
        long id = 987876;
        Person person = new Person(id);
        People people = new People();
        people.add(person);

        Person retrievedPerson = people.findById(id);
        Assert.assertEquals(retrievedPerson, person);

    }
}

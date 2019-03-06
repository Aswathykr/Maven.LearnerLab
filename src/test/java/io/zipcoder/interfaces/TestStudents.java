package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test(){
        Students students = Students.getInstance();
        int retrievedNumber = students.getCount();
        Assert.assertEquals(retrievedNumber, 25);
    }
}

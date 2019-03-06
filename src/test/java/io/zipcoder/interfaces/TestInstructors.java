package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test(){
        Instructors instructors = Instructors.getInstance();
        instructors.removeAll();
        instructors.addAllInstructors();
        int retrievedNumber = instructors.getCount();
        Assert.assertEquals(retrievedNumber, 5);
    }
}

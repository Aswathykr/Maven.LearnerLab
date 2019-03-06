package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){
        long id = 99876;
        Student student = new Student(id);
        boolean isInstance = student instanceof Learner;
        Assert.assertTrue(isInstance);
    }

    @Test
    public void testInheritance(){
        long id = 99876;
        Student student = new Student(id);
        boolean isInstance = student instanceof Person;
        Assert.assertTrue(isInstance);
    }

    @Test
    public void learnTest() {
        long id = 99876;
        Student student = new Student(id);
        double initialHours = 0.0;
        student.learn(10);
        double retrievedHrs = student.getTotalStudyTime();
        Assert.assertEquals(retrievedHrs, initialHours + 10.0, 0.01);

    }
}

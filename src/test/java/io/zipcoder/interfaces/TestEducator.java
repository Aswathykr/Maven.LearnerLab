package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        Educator educator = Educator.Leon;
        boolean isInstance = educator instanceof Teacher;
        Assert.assertTrue(isInstance);

    }


    @Test
    public void testTeach(){
        Educator educator = Educator.Leon;
        Student student = new Student(8765);
        double initialStudyTime = 10.0;
        student.learn(initialStudyTime);
        educator.teach(student, 10.5);
        double expectedStudyTime = initialStudyTime + 10.5;
        double retrievedStudyTime = student.getTotalStudyTime();
        Assert.assertEquals(retrievedStudyTime,expectedStudyTime, 0.01);

    }

    @Test
    public void testLecture(){
        Educator educator = Educator.Leon;
        Student[] students =  new Student[3];
        students[0] = new Student(8765);
        students[1] = new Student(8766);
        students[2] = new Student(8767);
        educator.lecture(students, 12.3);
        double expectedStudyTime =   12.3 / 3;
        for(Student student : students) {
            double retrievedStudyTime = student.getTotalStudyTime();
            Assert.assertEquals(retrievedStudyTime, expectedStudyTime, 0.01);
        }

    }
}

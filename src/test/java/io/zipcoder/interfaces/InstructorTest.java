package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    @Test
    public void testImplementation(){
        long id = 99876;
        Instructor instructor = new Instructor(id);
        boolean isInstance = instructor instanceof Teacher;
        Assert.assertTrue(isInstance);

    }

    @Test
    public void testInheritance(){
        long id = 99876;
        Instructor instructor = new Instructor(id);
        boolean isInstance = instructor instanceof Person;
        Assert.assertTrue(isInstance);

    }

    @Test
    public void testTeach(){
        long id = 99876;
        Instructor instructor = new Instructor(id);
        Student student = new Student(8765);
        double initialStudyTime = 10.0;
        student.learn(initialStudyTime);
        instructor.teach(student, 10.5);
        double expectedStudyTime = initialStudyTime + 10.5;
        double retrievedStudyTime = student.getTotalStudyTime();
        Assert.assertEquals(retrievedStudyTime,expectedStudyTime, 0.01);

    }

    @Test
    public void testLecture(){
        long id = 99876;
        Instructor instructor = new Instructor(id);
        Student[] students =  new Student[3];
        students[0] = new Student(8765);
        students[1] = new Student(8766);
        students[2] = new Student(8767);
        instructor.lecture(students, 12.3);
        double expectedStudyTime =   12.3 / 3;
        for(Student student : students) {
            double retrievedStudyTime = student.getTotalStudyTime();
            Assert.assertEquals(retrievedStudyTime, expectedStudyTime, 0.01);
        }

    }
}

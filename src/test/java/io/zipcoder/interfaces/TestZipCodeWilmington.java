package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void hostLectureTest(){
        ZipCodeWilmington institution = ZipCodeWilmington.getInstance();
        //Clearing the student/instructors state for test
        Students students = ZipCodeWilmington.getInstance().getStudents();
        students.removeAll();
        students.addAllStudents();

        Instructors instructors = ZipCodeWilmington.getInstance().getInstructors();
        instructors.removeAll();
        instructors.addAllInstructors();

        //When
        institution.hostLecture(instructors.getArray()[0],15);

        Student[] studentsArray = students.getArray();
        double numberOfStudents = students.getCount();
        double expectedHoursTime = 15 / numberOfStudents;
        for(Student student : studentsArray) {
            double hoursTime = student.getTotalStudyTime();
            Assert.assertEquals(hoursTime, expectedHoursTime, 0.01);
        }
    }

    @Test
    public void hostLectureWithEducatorTest(){
        ZipCodeWilmington institution = ZipCodeWilmington.getInstance();
        Educator educator = Educator.Leon;
        institution.hostLecture(educator,15);

        Students students = ZipCodeWilmington.getInstance().getStudents();
        Student[] studentsArray = students.getArray();
        double numberOfStudents = students.getCount();
        double expectedHoursTime = 15 / numberOfStudents;
        for(Student student : studentsArray) {
            double hoursTime = student.getTotalStudyTime();
            Assert.assertEquals(hoursTime, expectedHoursTime, 0.01);
        }
    }
}

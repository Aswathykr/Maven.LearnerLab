package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void hostLectureTest(){
        ZipCodeWilmington institution = ZipCodeWilmington.getInstance();
        //Clearing the student/instructors state for test
        Students students = institution.getStudents();
        students.removeAll();
        students.addAllStudents();

        Instructors instructors = institution.getInstructors();
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
        Students students = institution.getStudents();
        students.removeAll();
        students.addAllStudents();

        Educator educator = Educator.Leon;
        institution.hostLecture(educator,15);

        Student[] studentsArray = students.getArray();
        double numberOfStudents = students.getCount();
        double expectedHoursTime = 15 / numberOfStudents;
        for(Student student : studentsArray) {
            double hoursTime = student.getTotalStudyTime();
            Assert.assertEquals(hoursTime, expectedHoursTime, 0.01);
        }
    }
    @Test
    public void hostLectureWithIdEducatorTest(){
        ZipCodeWilmington institution = ZipCodeWilmington.getInstance();
        Students students = institution.getStudents();
        students.removeAll();
        students.addAllStudents();

        Educator educator = Educator.Leon;
        Instructors.getInstance().add(educator.getInstructor());
        institution.hostLecture(educator.ordinal(),15);
        Student[] studentsArray = students.getArray();
        double numberOfStudents = students.getCount();
        double expectedHoursTime = 15 / numberOfStudents;
        for(Student student : studentsArray) {
            double hoursTime = student.getTotalStudyTime();
            Assert.assertEquals(hoursTime, expectedHoursTime, 0.01);
        }

    }
}

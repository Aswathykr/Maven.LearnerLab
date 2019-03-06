package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students;

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    private Instructors instructors;

    private ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long teacherId, double numberOfHours){
        instructors.findById(teacherId).lecture(students.getArray(), numberOfHours);
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

}

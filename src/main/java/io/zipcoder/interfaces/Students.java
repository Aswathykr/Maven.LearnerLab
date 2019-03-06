package io.zipcoder.interfaces;

public final class Students extends People<Student>{
    private static  final Students INSTANCE = new Students() ;

    private Students(){
        addAllStudents();
    }
    public void addAllStudents() {
        int numberOfStudents = 25;
        for(int i = 0; i < numberOfStudents; i++) {
            Student student = new Student(100 + i);
            add(student);
        }
    }
    public static Students getInstance(){
        return INSTANCE;
    }

}

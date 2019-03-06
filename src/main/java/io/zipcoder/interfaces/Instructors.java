package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors() ;

    private Instructors(){
        addAllInstructors();
    }
    public void addAllInstructors(){
        String[] instructorsNames = {"Leon", "Wil", "Dudlan" , "Nhu", "Frolian"};
        int numberOfInstructors = instructorsNames.length;
        for(int i = 0; i < numberOfInstructors; i++) {
            Instructor instructor = new Instructor(1000 + i);
            instructor.setName(instructorsNames[i]);
            personList.add(instructor);
        }

    }
    public static Instructors getInstance(){
        return INSTANCE;
    }

}

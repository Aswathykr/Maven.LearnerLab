package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    Leon,
    Wil,
    Dudlan ,
    Nhu,
    Frolian;

    private double timeWorked;
    Educator(){
        Instructor instructor = new Instructor(ordinal());
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        timeWorked +=numberOfHours;
        Instructors.getInstance().getArray()[ordinal()].teach(learner,numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked +=numberOfHours;
        Instructors.getInstance().getArray()[ordinal()].lecture(learners,numberOfHours);
    }
}

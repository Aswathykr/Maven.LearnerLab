package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    Leon,
    Wil,
    Dudlan ,
    Nhu,
    Frolian;

    private double timeWorked;
    private Instructor instructor;
    Educator(){
        this.instructor = new Instructor(ordinal()){
            @Override
            public void teach(Learner learner, double numberOfHours) {
                super.teach(learner,numberOfHours);
                timeWorked += numberOfHours;
            }
        };
        instructor.setName(this.toString());
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner,numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
       instructor.lecture(learners,numberOfHours);
    }

    public Instructor getInstructor() {
        return instructor;
    }
}

package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    DOLIO(new Instructor(0L, "Dolio")),
    CHRIS(new Instructor(1L, "Chris")),
    FROILAN(new Instructor(2L, "Froilan")),
    ROBERTO(new Instructor(3L, "Roberto"));

    final Instructor instructor;
    double timeWorked = 0.0;

    Educator(Instructor instructor){
        this.instructor = instructor;
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner,numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }
}

package io.zipcoder.interfaces;



public class ZipCodeWilmington {

    private static final Students students = Students.getINSTANCE();
    private static final Instructors instructors = Instructors.getINSTANCE();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public static ZipCodeWilmington getINSTANCE(){
        return INSTANCE;
    }
}

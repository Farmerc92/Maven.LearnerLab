package io.zipcoder.interfaces;

public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        String[] names = {"Dolio","Chris","Froilan","Roberto"};
        for(Integer i = 0; i < names.length; i++){
            Instructor instructor = new Instructor(i.longValue(), names[i]);
            super.add(instructor);
        }
    }

    public static Instructors getINSTANCE(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray(){
        return super.getPersonList().toArray(new Instructor[getPersonList().size()]);
    }

}

package io.zipcoder.interfaces;

public final class Students extends People<Student>{
    private static final Students INSTANCE = new Students();

    private Students(){
        String[] names = {"David","David","Aarti","Zeth","April","Han","James","Zanetta","Sandy","Raheel","Leila","Giles","Khalil","Sandeep","Adam","Moe","Matt",
        "Emily","Jeremy","Maurice","Corey","Kevin","Von","Greg","Jimmy","Ujjwal","Destiny","Chris","Chip"};
        for (Integer i = 0; i < names.length; i++){
            Student student = new Student(i.longValue(), names[i]);
            super.add(student);
        }
    }

    public static Students getINSTANCE(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray(){
        return super.personList.toArray(new Student[personList.size()]);
    }


}

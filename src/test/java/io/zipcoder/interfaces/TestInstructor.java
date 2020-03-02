package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor i = new Instructor(20, "");

        Assert.assertTrue(i instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor i = new Instructor(20, "");

        Assert.assertTrue(i instanceof Person);
    }

    @Test
    public void testTeach(){
        Student s1 = new Student(20, "");

        Instructor i = new Instructor(20, "");
        Double expectedHours = 20.0;
        i.teach(s1, expectedHours);

        Assert.assertEquals(expectedHours, s1.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        Student s1 = new Student(20, "");
        Student s2 = new Student(20, "");

        Student[] arrayOfStudents = new Student[2];
        arrayOfStudents[0] = s1;
        arrayOfStudents[1] = s2;

        Instructor i = new Instructor(20, "");

        i.lecture(arrayOfStudents, 20.0);

        Double expectedHours = 10.0;

        Assert.assertEquals(expectedHours, s1.getTotalStudyTime());
        Assert.assertEquals(expectedHours, s2.getTotalStudyTime());
    }
}

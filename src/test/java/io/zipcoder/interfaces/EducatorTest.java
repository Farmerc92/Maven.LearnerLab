package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    @Test
    public void test(){
        Assert.assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void lectureTest(){
        Student[] students = {new Student(123L, "Karl"), new Student(456L, "Franz")};

        Double expected = 1.0 / students.length;
        Educator.DOLIO.lecture(students, 1.0);

        Assert.assertEquals(expected, students[0].getTotalStudyTime());
        Assert.assertEquals(expected, students[1].getTotalStudyTime());
    }

    @Test
    public void teachTest(){
        Student karl = new Student(123L, "Karl");

        Double expected = 1.0;
        Educator.DOLIO.teach(karl, expected);

        Assert.assertEquals(expected, karl.getTotalStudyTime());
    }

    @Test
    public void lectureTimeWorkedTest(){
        Student[] students = {new Student(123L, "Karl"), new Student(456L, "Franz")};

        Double expected = 1.0;
        Educator.ROBERTO.lecture(students, 1.0);

        Assert.assertEquals(expected, Educator.ROBERTO.timeWorked, 0.0);
    }

    @Test
    public void teachTimeWorked(){
        Student karl = new Student(123L, "Karl");

        Double expected = 1.0;
        Educator.CHRIS.teach(karl, expected);

        Assert.assertEquals(expected, Educator.CHRIS.timeWorked, 0.0);
    }
}

package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student s = new Student(20, "bob");

        Assert.assertTrue(s instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student s = new Student(20, "");

        Assert.assertTrue(s instanceof Person);
    }

    @Test
    public void testLearn(){
        Student s = new Student(20, "");

        Double expectedHours = 20.0;

        s.learn(expectedHours);

        Assert.assertEquals(expectedHours, s.getTotalStudyTime());
    }
}

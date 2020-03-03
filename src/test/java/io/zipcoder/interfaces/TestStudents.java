package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {


    @Test
    public void test(){
        People people = Students.getINSTANCE();

        Person[] actualCohort6 = people.toArray();

        List<String> expectedNames = Arrays.asList("David","David","Aarti","Zeth","April","Han","James","Zanetta","Sandy","Raheel","Leila","Giles","Khalil","Sandeep","Adam","Moe","Matt",
                "Emily","Jeremy","Maurice","Corey","Kevin","Von","Greg","Jimmy","Ujjwal","Destiny","Chris","Chip");
        for (int i = 0; i < expectedNames.size(); i++) {
            Person person = actualCohort6[i];
            Assert.assertTrue(expectedNames.contains(person.getName()));
        }

    }
}

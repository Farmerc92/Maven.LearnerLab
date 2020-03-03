package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {
    @Test
    public void test(){
        Instructors dolioAndTheBoys = Instructors.getINSTANCE();

        Person[] dolioAndTheBoysButArray = dolioAndTheBoys.toArray();

        List<String> expectedNames = Arrays.asList("Dolio","Chris","Froilan","Roberto");
        for (int i = 0; i < expectedNames.size(); i++) {
            Person person = dolioAndTheBoysButArray[i];
            Assert.assertTrue(expectedNames.contains(person.getName()));
        }
    }
}

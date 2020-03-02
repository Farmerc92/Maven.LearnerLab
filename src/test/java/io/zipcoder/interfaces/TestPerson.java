package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        String expectedName = "Steve";
        long expectedId = 100;

        Person steve = new Person(expectedId, expectedName);

        Assert.assertEquals(expectedId, steve.getId());
        Assert.assertEquals(expectedName, steve.getName());
    }

    @Test
    public void testSetName(){
        String expectedName = "Steve";
        long expectedId = 100;

        Person steve = new Person(expectedId, expectedName);

        String actualName = "bob";

        steve.setName(actualName);

        Assert.assertEquals(actualName, steve.getName());
    }
}

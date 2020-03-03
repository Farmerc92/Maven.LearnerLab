package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {

    People people = Students.getINSTANCE();

    @Before
    public void setup(){
        people.removeAll();
    }
    @Test
    public void testAdd(){
        Person p = new Person(20, "");
        Person p1 = new Person(20, "");
        Person p2 = new Person(20, "");


        people.add(p);
        people.add(p1);
        people.add(p2);

        Assert.assertTrue(people.contains(p));
        Assert.assertTrue(people.contains(p1));
        Assert.assertTrue(people.contains(p2));
    }

    @Test
    public void testRemove(){
        Person p = new Person(5, "");
        Person p1 = new Person(10, "");
        Person p2 = new Person(20, "");

        people.add(p);
        people.add(p1);
        people.add(p2);
        people.remove(p2);
        people.remove(10);

        Assert.assertTrue(people.contains(p));
        Assert.assertFalse(people.contains(p1));
        Assert.assertFalse(people.contains(p2));
        Assert.assertEquals(1, people.count());

        people.removeAll();

        Assert.assertEquals(0, people.count());
    }

    @Test
    public void testFindById(){
        Person p = new Person(5, "");
        Person p1 = new Person(10, "");
        Person p2 = new Person(20, "");

        people.add(p);
        people.add(p1);
        people.add(p2);

        Assert.assertEquals(p, people.findById(5));
    }
}

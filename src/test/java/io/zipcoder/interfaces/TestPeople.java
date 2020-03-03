package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        Person p = new Person(20, "");
        Person p1 = new Person(20, "");
        Person p2 = new Person(20, "");

        People persons = new People();

        persons.add(p);
        persons.add(p1);
        persons.add(p2);

        Assert.assertTrue(persons.contains(p));
        Assert.assertTrue(persons.contains(p1));
        Assert.assertTrue(persons.contains(p2));
    }

    @Test
    public void testRemove(){
        Person p = new Person(5, "");
        Person p1 = new Person(10, "");
        Person p2 = new Person(20, "");

        People persons = new People();

        persons.add(p);
        persons.add(p1);
        persons.add(p2);
        persons.remove(p2);
        persons.remove(10);

        Assert.assertTrue(persons.contains(p));
        Assert.assertFalse(persons.contains(p1));
        Assert.assertFalse(persons.contains(p2));
        Assert.assertEquals(1, persons.count());

        persons.removeAll();

        Assert.assertEquals(0, persons.count());
    }

    @Test
    public void testFindById(){
        Person p = new Person(5, "");
        Person p1 = new Person(10, "");
        Person p2 = new Person(20, "");

        People persons = new People();

        persons.add(p);
        persons.add(p1);
        persons.add(p2);

        Assert.assertEquals(p, persons.findById(5));
    }
}

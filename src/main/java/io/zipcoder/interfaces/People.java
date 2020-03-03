package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{

    private List<Person> personList = new ArrayList<>();

    public void add(Person p){
        personList.add(p);
    }

    public Person findById(long id){
        for (Person p :
                personList) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        ArrayList<Person> toRemove = new ArrayList<>();
        for (Person p: personList) {
            if (p.getId() == id){
                toRemove.add(p);
            }
        }
        personList.removeAll(toRemove);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] array = new Person[personList.size()];
        for (int i = 0; i < personList.size(); i++) {
            array[i] = personList.get(i);
        }
        return array;
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}

package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person>{

    protected List<E> personList = new ArrayList<>();

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for (E p : personList) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(E person){
        return personList.contains(person);
    }

    public void remove(E person){
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

    abstract public E[] toArray();

    public Iterator<E> iterator(){
        return this.personList.iterator();
    }
}

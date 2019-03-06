package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class People<T extends Person> {
    protected List<T> personList = new ArrayList<T>();

    public void add(T person){
        personList.add(person);

    }
    public T findById(long id)throws NoSuchElementException {
        return personList.stream()
                .filter(person -> person.getId() == id)
                .findFirst().get();
    }

    public void remove(T person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(findById(id));
    }

    public int getCount(){
        return personList.size();
    }

    public T[] getArray(){
        if(personList.size() == 0)
            return null;

        return personList.toArray((T[])Array.newInstance(
                personList.get(0).getClass(), personList.size()));
    }

    public void removeAll(){
        personList.clear();
    }
}

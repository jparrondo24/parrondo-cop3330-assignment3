package org.cop3330.ex41;

import java.util.ArrayList;
import java.util.Collections;

public class PersonList {
    ArrayList<Person> list = new ArrayList<>();

    public PersonList() {
        list = new ArrayList<>();
    }

    public void addPerson(Person p) {
        list.add(p);
    }

    public void sortPeople() {
        Collections.sort(list);
    }

    @Override
    public String toString() {
        String output = String.format("Total of %d names\n", list.size());
        output += "-----------------";
        for (Person p : list)
            output += "\n" + p.toString();

        return output;
    }
}

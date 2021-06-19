/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex41;


import java.util.ArrayList;
import java.util.Collections;

public class PersonList {
    ArrayList<Person> list;

    // Construct PersonList by initializing the list
    public PersonList() {
        list = new ArrayList<>();
    }

    // Add a Person by simply adding it to an inner list
    public void addPerson(Person p) {
        list.add(p);
    }

    // Use Collections.sort to sort the inner list
    public void sortPeople() {
        Collections.sort(list);
    }

    // Override toString to get the desired format for our list
    @Override
    public String toString() {
        String output = String.format("Total of %d names\n", list.size());
        output += "-----------------";
        for (Person p : list)
            output += "\n" + p.toString();

        return output;
    }
}

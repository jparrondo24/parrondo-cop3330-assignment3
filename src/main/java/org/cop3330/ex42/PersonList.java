/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex42;

import java.util.ArrayList;

public class PersonList {
    ArrayList<Person> list;

    // Construct object by simply initializing inner list
    public PersonList() {
        list = new ArrayList<>();
    }

    // Simply add Person to inner list
    public void addPerson(Person p) {
        list.add(p);
    }

    // Override toString to printList in the desired format
    @Override
    public String toString() {
        String output = String.format("%-10s%-10s%-6s\n", "Last", "First", "Salary");
        output += "--------------------------";
        for (Person p: list)
            output += "\n" + p.toString();
        return output;
    }
}

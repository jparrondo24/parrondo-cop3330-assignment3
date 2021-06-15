package org.cop3330.ex42;

import java.util.ArrayList;

public class PersonList {
    ArrayList<Person> list = new ArrayList<Person>();

    public PersonList() {
        list = new ArrayList<>();
    }

    public void addPerson(Person p) {
        list.add(p);
    }

    @Override
    public String toString() {
        String output = String.format("%-10s%-10s%-6s\n", "Last", "First", "Salary");
        output += "--------------------------";
        for (Person p: list)
            output += "\n" + p.toString();
        return output;
    }
}

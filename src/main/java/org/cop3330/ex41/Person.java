/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex41;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    // Construct a Person object by parsing a line of input
    public Person(String nameString) {
        String[] data = nameString.split(", ");
        lastName = data[0];
        firstName = data[1];
    }

    // Override compareTo so that we can correctly
    // sort an ArrayList of persons.
    @Override
    public int compareTo(Person person) {
        int lastNameComparison = this.lastName.compareTo(person.lastName);
        if (lastNameComparison != 0)
            return lastNameComparison;

        return this.firstName.compareTo(person.firstName);
    }

    // Override toString to get the desired format for each Person.
    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}

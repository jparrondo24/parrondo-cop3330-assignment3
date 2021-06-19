/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex42;

public class Person {
    private String firstName;
    private String lastName;
    private String salary;

    // Construct the person by parsing a line of input
    public Person(String personString) {
        String[] data = personString.split(",");
        firstName = data[0];
        lastName = data[1];
        salary = data[2];
    }

    // Override toString() to get each Person in the desired format
    @Override
    public String toString() {
        return String.format("%-10s%-10s%s", firstName, lastName, salary);
    }
}

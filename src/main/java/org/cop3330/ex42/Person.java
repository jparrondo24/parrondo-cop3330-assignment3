package org.cop3330.ex42;

public class Person {
    private String firstName;
    private String lastName;
    private String salary;

    public Person(String personString) {
        String[] data = personString.split(",");
        firstName = data[0];
        lastName = data[1];
        salary = data[2];
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%-6s", lastName, firstName, salary);
    }
}

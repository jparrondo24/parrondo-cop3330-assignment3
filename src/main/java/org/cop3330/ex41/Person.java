package org.cop3330.ex41;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String nameString) {
        String[] data = nameString.split(", ");
        lastName = data[0];
        firstName = data[1];
    }

    @Override
    public int compareTo(Person person) {
        int lastNameComparison = this.lastName.compareTo(person.lastName);
        if (lastNameComparison != 0)
            return lastNameComparison;

        return this.firstName.compareTo(person.firstName);
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}

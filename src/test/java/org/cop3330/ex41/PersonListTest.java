package org.cop3330.ex41;

import org.junit.jupiter.api.Test;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PersonListTest {

    @Test
    void addPerson() {
        PersonList pl = new PersonList();
        pl.addPerson(new Person("Bar, Foo"));
        assertEquals("Total of 1 names\n-----------------\nBar, Foo", pl.toString());
    }

    @Test
    void sortPeople() {
        PersonList pl = new PersonList();
        pl.addPerson(new Person("Parrondo, Justin"));
        pl.addPerson(new Person("Parrondo, Daniel"));
        pl.addPerson(new Person("Appleseed, Zohn"));
        pl.sortPeople();
        assertEquals("Total of 3 names\n-----------------"
                + "\nAppleseed, Zohn\nParrondo, Daniel\nParrondo, Justin", pl.toString());
    }

    @Test
    void testToString() {
        PersonList pl = new PersonList();
        pl.addPerson(new Person("Parrondo, Justin"));
        pl.addPerson(new Person("Parrondo, Daniel"));
        pl.addPerson(new Person("Appleseed, Zohn"));
        assertEquals("Total of 3 names\n-----------------"
                + "\nParrondo, Justin\nParrondo, Daniel\nAppleseed, Zohn", pl.toString());
    }
}
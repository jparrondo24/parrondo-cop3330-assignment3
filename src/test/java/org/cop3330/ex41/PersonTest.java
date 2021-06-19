package org.cop3330.ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testToString() {
        String personString = "Bar, Foo";
        Person p = new Person(personString);
        assertEquals(p.toString(), personString);
    }

    @Test
    void testCompareToWorksAsIntended() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Parrondo, Justin"));
        people.add(new Person("Parrondo, Daniel"));
        people.add(new Person("Appleseed, Zohn"));
        Collections.sort(people);

        assertEquals("Appleseed, Zohn", people.get(0).toString());
        assertEquals("Parrondo, Daniel", people.get(1).toString());
        assertEquals("Parrondo, Justin", people.get(2).toString());
    }
}
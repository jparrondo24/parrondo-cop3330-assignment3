package org.cop3330.ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonListTest {

    @Test
    void addPerson() {
        PersonList pl = new PersonList();
        Person p1 = new Person("Justin,Parrondo,50000");
        Person p2 = new Person("Daniel,Parrondo,80000");
        pl.addPerson(p1);
        pl.addPerson(p2);
        assertEquals(p1.toString(), pl.list.get(0).toString());
        assertEquals(p2.toString(), pl.list.get(1).toString());
    }

    @Test
    void testToString() {
        PersonList pl = new PersonList();
        pl.addPerson(new Person("Justin,Parrondo,50000"));
        pl.addPerson(new Person("Daniel,Parrondo,80000"));
        assertEquals("Last      First     Salary\n" +
                "--------------------------\n" +
                "Justin    Parrondo  50000\n" +
                "Daniel    Parrondo  80000", pl.toString());
    }
}
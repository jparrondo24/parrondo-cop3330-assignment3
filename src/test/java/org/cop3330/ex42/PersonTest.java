package org.cop3330.ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testToString() {
        Person p = new Person("Justin,Parrondo,50000");
        assertEquals("Justin    Parrondo  50000", p.toString());
    }
}
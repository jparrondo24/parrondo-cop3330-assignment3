package org.cop3330.ex44;

import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ProductMapTest {

    @Test
    void containsProduct() throws IOException, ParseException {
        ClassLoader classLoader = App.class.getClassLoader();
        String pathToJson = classLoader.getResource("exercise44_input.json").getPath();
        ProductMap pm = new ProductMap(pathToJson);
        assertTrue(pm.containsProduct("Thing"));
        assertFalse(pm.containsProduct("iPad Pro"));
    }

    @Test
    void query() throws IOException, ParseException {
        ClassLoader classLoader = App.class.getClassLoader();
        String pathToJson = classLoader.getResource("exercise44_input.json").getPath();
        ProductMap pm = new ProductMap(pathToJson);

        assertEquals("Sorry, that product was not found in our inventory.", pm.query("iPad Pro"));
        assertEquals("Name: Thing\nPrice: 15.00\nQuantity: 5", pm.query("Thing"));
    }
}
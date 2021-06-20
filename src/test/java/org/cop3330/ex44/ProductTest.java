package org.cop3330.ex44;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void testToString() {
        long quantity = 50;
        JSONObject jsonProduct = new JSONObject();
        jsonProduct.put("name", "iPad Pro");
        jsonProduct.put("price", 1200.00);
        jsonProduct.put("quantity", quantity);
        Product p = new Product(jsonProduct);
        assertEquals("Name: iPad Pro\nPrice: 1200.00\nQuantity: 50", p.toString());
    }
}
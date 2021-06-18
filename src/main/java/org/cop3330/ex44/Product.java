package org.cop3330.ex44;

import org.json.simple.JSONObject;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(JSONObject jsonProduct) {
        name = (String) jsonProduct.get("name");
        price = (double) jsonProduct.get("price");
        quantity = ((Long) jsonProduct.get("quantity")).intValue();
    }
}

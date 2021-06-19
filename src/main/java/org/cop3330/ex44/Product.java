/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex44;

import org.json.simple.JSONObject;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // Construct the Product object by parsing the given JSONObject
    public Product(JSONObject jsonProduct) {
        name = (String) jsonProduct.get("name");
        price = (double) jsonProduct.get("price");
        quantity = ((Long) jsonProduct.get("quantity")).intValue();
    }

    // Override toString to get the desired output for each Product
    @Override
    public String toString() {
        return String.format("Name: %s\nPrice: %.2f\nQuantity: %d",
                name, price, quantity);
    }
}

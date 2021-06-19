/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ProductMap {
    HashMap<String, Product> map;

    // Construct the ProductMap by parsing json into the inner HashMap,
    // also initializing the necessary Product objects along the way
    public ProductMap(String pathToJson) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(new FileReader(pathToJson));
        map = new HashMap<>();

        JSONArray jsonProducts = (JSONArray) json.get("products");
        for (int i = 0; i < jsonProducts.size(); i++) {
            JSONObject nextJsonProduct = (JSONObject) jsonProducts.get(i);
            Product nextProduct = new Product(nextJsonProduct);
            map.put(nextProduct.name, nextProduct);
        }
    }

    // Check if the inner map contains the product
    public boolean containsProduct(String product) {
        return map.containsKey(product);
    }

    // Ask if the map contains a product, and if it does, return its toString()
    public String query(String productName) {
        if (!this.containsProduct(productName))
            return "Sorry, that product was not found in our inventory.";

        Product product = map.get(productName);
        return product.toString();
    }
}

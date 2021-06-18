package org.cop3330.ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ProductMap {
    HashMap<String, Product> map;

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

    public boolean containsProduct(String product) {
        return map.containsKey(product);
    }

    public String query(String productName) {
        if (!this.containsProduct(productName))
            return "Sorry, that product was not found in our inventory.";

        Product product = map.get(productName);
        return String.format("Name: %s\nPrice: %.2f\nQuantity: %d",
                product.name, product.price, product.quantity);
    }
}

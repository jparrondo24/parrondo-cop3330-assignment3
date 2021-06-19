/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex44;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, ParseException {
        // Initialize necessary objects for File I.
        ClassLoader classLoader = App.class.getClassLoader();
        String pathToJson = classLoader.getResource("exercise44_input.json").getPath();
        Scanner in = new Scanner(System.in);

        // Create a new product map by giving the constructor
        // the path to the input json file
        ProductMap pm = new ProductMap(pathToJson);

        // Do the input loop, querying the product map
        // over and over until a product is found
        String product;
        do {
            System.out.print("What is the product name? ");
            product = in.nextLine();
            System.out.println(pm.query(product));
        } while (!pm.containsProduct(product));
    }
}

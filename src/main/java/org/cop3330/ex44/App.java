package org.cop3330.ex44;


import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, ParseException {
        ClassLoader classLoader = org.cop3330.ex42.App.class.getClassLoader();
        String pathToJson = classLoader.getResource("exercise44_input.json").getPath();
        Scanner in = new Scanner(System.in);

        ProductMap pl = new ProductMap(pathToJson);

        String product;
        do {
            System.out.print("What is the product name? ");
            product = in.nextLine();
            System.out.println(pl.query(product));
        } while (!pl.containsProduct(product));
    }
}

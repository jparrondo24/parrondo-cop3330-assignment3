/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        // Initialize necessary objects for File I.
        ClassLoader classLoader = org.cop3330.ex46.App.class.getClassLoader();
        File input = new File(classLoader.getResource("exercise46_input.txt").getFile());
        Scanner in = new Scanner(input);

        // Construct the WordCounter object by letting it use
        // the Scanner object to read the input file
        WordCounter wc = new WordCounter(in);

        System.out.print(wc);
    }
}

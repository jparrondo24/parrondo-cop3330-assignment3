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

        // Initialize the WordCounter object
        WordCounter wc = new WordCounter();

        // Add all words in the file to the WordCounter
        while (in.hasNext())
            wc.addWord(in.next());

        // Ensure the words will be sorted by frequency
        wc.sortWordsByFrequency();

        System.out.print(wc);
    }
}

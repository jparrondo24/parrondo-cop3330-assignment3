/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        // Initialize necessary objects for File I/O
        ClassLoader classLoader = org.cop3330.ex45.App.class.getClassLoader();
        File input = new File(classLoader.getResource("exercise45_input.txt").getFile());
        Scanner in = new Scanner(input);
        FileWriter fw = new FileWriter("exercise46_output.txt");

        // Initialize a WordReplacer objects, configured for the correct
        // find/replace words
        WordReplacer wr = new WordReplacer("utilize", "use");

        // Add each line of file input to wr
        while (in.hasNextLine())
            wr.addLine(in.nextLine());

        wr.printToFile(fw);
        fw.close();
    }
}

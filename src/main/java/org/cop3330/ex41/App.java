/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        // Setup necessary objects for File I/O
        ClassLoader classLoader = App.class.getClassLoader();
        File input = new File(classLoader.getResource("exercise41_input.txt").getFile());
        Scanner in = new Scanner(input);
        FileWriter output = new FileWriter("exercise41_output.txt");

        // Initiate a personList object
        PersonList pl = new PersonList();

        // Make a new Person object from every line of input,
        // and then add it to the PersonList
        while (in.hasNextLine()) {
            pl.addPerson(new Person(in.nextLine()));
        }

        // Call the pl's method of sorting the Persons added
        pl.sortPeople();

        // Output the PersonList
        output.write(pl.toString());
        output.close();
    }
}

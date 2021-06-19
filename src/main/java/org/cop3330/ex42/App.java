/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex42;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        // Initialize necessary objects for File I.
        ClassLoader classLoader = App.class.getClassLoader();
        File input = new File(classLoader.getResource("exercise42_input.txt").getFile());
        Scanner in = new Scanner(input);

        // Initialize a PersonList object
        PersonList pl = new PersonList();

        // Add all data to pl by adding a new Person
        // constructed from each line of input in the file
        while (in.hasNextLine()) {
            pl.addPerson(new Person(in.nextLine()));
        }

        System.out.println(pl);
    }
}

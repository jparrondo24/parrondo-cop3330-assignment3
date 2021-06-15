package org.cop3330.ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = App.class.getClassLoader();
        File input = new File(classLoader.getResource("exercise42_input.txt").getFile());
        Scanner in = new Scanner(input);
        PersonList pl = new PersonList();

        while (in.hasNextLine()) {
            pl.addPerson(new Person(in.nextLine()));
        }

        System.out.println(pl);
    }
}

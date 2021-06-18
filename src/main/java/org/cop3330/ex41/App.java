package org.cop3330.ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = App.class.getClassLoader();
        File input = new File(classLoader.getResource("exercise41_input.txt").getFile());
        Scanner in = new Scanner(input);
        FileWriter output = new FileWriter("exercise41_output.txt");

        PersonList pl = new PersonList();

        while (in.hasNextLine()) {
            pl.addPerson(new Person(in.nextLine()));
        }

        pl.sortPeople();

        output.write(pl.toString());
        output.close();
    }
}

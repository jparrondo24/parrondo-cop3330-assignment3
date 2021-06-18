package org.cop3330.ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        ClassLoader classLoader = org.cop3330.ex41.App.class.getClassLoader();
        File input = new File(classLoader.getResource("exercise46_input.txt").getFile());
        Scanner in = new Scanner(input);

        WordCounter wc = new WordCounter(in);
        System.out.print(wc);
    }
}

package org.cop3330.ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = org.cop3330.ex41.App.class.getClassLoader();
        File input = new File(classLoader.getResource("exercise45_input.txt").getFile());
        Scanner in = new Scanner(input);
        FileWriter fw = new FileWriter("exercise46_output.txt");
        WordReplacer wr = new WordReplacer("utilize", "use");

        while (in.hasNextLine())
            wr.addLine(in.nextLine());

        wr.printToFile(fw);
        fw.close();
    }
}

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex43;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        // Read all input from stdin first
        System.out.print("Site name: ");
        String siteName = in.nextLine();

        System.out.print("Author: ");
        String author = in.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        boolean wantsJs = in.nextLine().toLowerCase().equals("y");

        System.out.print("Do you want a folder for CSS? ");
        boolean wantsCss = in.nextLine().toLowerCase().equals("y");

        // Initialize a new WebsiteGenerator by passing desired info
        WebsiteGenerator wg = new WebsiteGenerator(siteName, author, wantsJs, wantsCss);

        // Call wg's generateWebsite method
        wg.generateWebsite();

        // Print the logs of all of the generator's operations
        System.out.print(wg.getLogs());
    }
}

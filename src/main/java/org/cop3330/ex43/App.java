package org.cop3330.ex43;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("Site name: ");
        String siteName = in.nextLine();

        System.out.print("Author: ");
        String author = in.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        boolean wantsJs = in.nextLine().toLowerCase().equals("y");

        System.out.print("Do you want a folder for CSS? ");
        boolean wantsCss = in.nextLine().toLowerCase().equals("y");

        WebsiteGenerator wg = new WebsiteGenerator(siteName, author, wantsJs, wantsCss);
        System.out.print(wg.getLogs());
    }
}

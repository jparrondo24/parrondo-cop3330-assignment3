/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {
    private String rootDirectoryPath;
    private String siteName;
    private String author;
    private boolean wantsJs;
    private boolean wantsCss;

    private String logs;

    // Add a creation to the logs using the filepath
    void addToLog(String directoryOrFilePath) {
        logs += String.format("Created %s\n", directoryOrFilePath);
    }

    // Generate a directory given a path, logging it when finished
    void generateDirectory(String directoryPath) {
        File f = new File(directoryPath);
        f.mkdirs();
        addToLog(directoryPath + "/");
    }

    // Generate the index.html based in the rootDirectoryPath
    // with the necessary information. logging when finished
    void generateIndexHtml() throws IOException {
        String filePath = rootDirectoryPath + "/index.html";
        FileWriter writer = new FileWriter(filePath);
        writer.write(String.format("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>%s</title>\n" +
                "<meta name=\"author\" content=\"%s\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>", siteName, author));
        writer.close();
        addToLog(filePath);
    }

    // Construct the WebsiteGenerator object, doing some work to determine the rootDirectoryPath
    public WebsiteGenerator(String siteName, String author, boolean wantsJs, boolean wantsCss) {
        logs = "";
        rootDirectoryPath = "./website/" + siteName;
        this.siteName = siteName;
        this.author = author;
        this.wantsJs = wantsJs;
        this.wantsCss = wantsCss;
    }

    // Generate the website by calling the necessary helper methods
    public void generateWebsite() throws IOException {
        generateDirectory(rootDirectoryPath);
        generateIndexHtml();

        if (wantsJs)
            generateDirectory(rootDirectoryPath + "/js");
        if (wantsCss)
            generateDirectory(rootDirectoryPath + "/css");
    }

    // Return the generated logs
    public String getLogs() {
        return logs;
    }
}

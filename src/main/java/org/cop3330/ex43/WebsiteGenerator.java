package org.cop3330.ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {
    private String rootDirectoryPath;
    private String siteName;
    private String author;

    private String logs;

    void addToLog(String directoryOrFilePath) {
        logs += String.format("Created %s\n", directoryOrFilePath);
    }

    void generateDirectory(String directoryPath) {
        File f = new File(directoryPath);
        if (f.mkdirs())
            addToLog(directoryPath + "/");
    }

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

    public WebsiteGenerator(String siteName, String author, boolean wantsJs, boolean wantsCss) throws IOException {
        logs = "";
        rootDirectoryPath = "./website/" + siteName;
        this.siteName = siteName;
        this.author = author;

        generateDirectory(rootDirectoryPath);
        generateIndexHtml();

        if (wantsJs)
            generateDirectory(rootDirectoryPath + "/js");
        if (wantsCss)
            generateDirectory(rootDirectoryPath + "/css");
    }

    public String getLogs() {
        return logs;
    }
}

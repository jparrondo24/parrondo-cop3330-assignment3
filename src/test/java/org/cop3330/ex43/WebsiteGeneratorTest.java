/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    @Test
    void addToLog() {
        WebsiteGenerator wg = new WebsiteGenerator("helloworld", "justin", false, false);
        wg.addToLog("index.html");
        assertEquals("Created index.html\n", wg.getLogs());
    }

    @Test
    void generateDirectory() {
        WebsiteGenerator wg = new WebsiteGenerator("helloworld", "justin", false, false);
        wg.generateDirectory("./website/helloworld");
        assertEquals("Created ./website/helloworld/\n", wg.getLogs());
    }

    @Test
    void generateIndexHtml() throws IOException {
        WebsiteGenerator wg = new WebsiteGenerator("helloworld", "justin", false, false);
        wg.generateDirectory("./website/helloworld");
        wg.generateIndexHtml();
        assertEquals("Created ./website/helloworld/\nCreated ./website/helloworld/index.html\n",
                wg.getLogs());
    }

    @Test
    void generateWebsite() throws IOException {
        WebsiteGenerator wg = new WebsiteGenerator("awesomeco", "Max Power", true, true);
        wg.generateWebsite();
        assertEquals("Created ./website/awesomeco/\n" +
                "Created ./website/awesomeco/index.html\n" +
                "Created ./website/awesomeco/js/\n" +
                "Created ./website/awesomeco/css/\n", wg.getLogs());
    }

    @Test
    void getLogs() {
        WebsiteGenerator wg = new WebsiteGenerator("helloworld", "justin", false, false);
        wg.addToLog("index.html");
        assertEquals("Created index.html\n", wg.getLogs());
    }
}
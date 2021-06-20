/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex45;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WordReplacer {
    private ArrayList<String> lines;
    private String wordToFind;
    private String wordToReplace;

    // Add a given line to our list of lines, processing it first
    public void addLine(String line) {
        // Go through the given line letter by letter,
        // replacing wordToFind with wordToReplace whenever we find it
        int counterInFindWord = 0;
        for (int i = 0; i < line.length(); i++) {
            char currChar = line.charAt(i);
            char charInFindWord = wordToFind.charAt(counterInFindWord);
            if (currChar == charInFindWord) {
                if (counterInFindWord == wordToFind.length() - 1) {
                    line = line.substring(0, i - (wordToFind.length() - 1))
                           + wordToReplace
                           + line.substring(i + 1);
                    counterInFindWord = 0;
                } else {
                    counterInFindWord++;
                }
            } else {
                counterInFindWord = 0;
            }
        }
        // Put the processed line in the list
        lines.add(line);
    }

    // Construct the WordReplacer objects by initializing the inner list
    // for each line, and setting the necessary two variables
    public WordReplacer(String wordToFind, String wordToReplace) {
        lines = new ArrayList<>();
        this.wordToFind = wordToFind;
        this.wordToReplace = wordToReplace;
    }

    // Return a String of all of the processed text
    public String getWordReplacedText() {
        if (lines.size() <= 0)
            return "";

        String output = lines.get(0);
        for (int i = 1; i < lines.size(); i++)
            output += ("\n" + lines.get(i));

        return output;
    }
}

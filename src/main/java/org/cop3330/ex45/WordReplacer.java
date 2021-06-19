package org.cop3330.ex45;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WordReplacer {
    private ArrayList<String> lines;
    private String wordToFind;
    private String wordToReplace;

    public void addLine(String line) {
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
        lines.add(line);
    }

    public WordReplacer(String wordToFind, String wordToReplace) {
        lines = new ArrayList<>();
        this.wordToFind = wordToFind;
        this.wordToReplace = wordToReplace;
    }

    public void printToFile(FileWriter fw) throws IOException {
        if (lines.size() <= 0)
            return;

        fw.write(lines.get(0));
        for (int i = 1; i < lines.size(); i++)
            fw.write("\n" + lines.get(i));
    }
}

package org.cop3330.ex46;

import java.util.*;

public class WordCounter {
    LinkedHashMap<String, Integer> frequencyMap;
    private int sizeOfLargestWord;

    void sortWordsByFrequency() {
        ArrayList<Map.Entry<String, Integer>> wordsList = new ArrayList<>(frequencyMap.entrySet());
        wordsList.sort((l1, l2) -> l2.getValue().compareTo(l1.getValue()));

        frequencyMap = new LinkedHashMap();
        for (Map.Entry entry : wordsList) {
            frequencyMap.put((String) entry.getKey(), (int) entry.getValue());
        }
    }

    String generateStars(int n) {
        String stars = "";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }
        return stars;
    }

    public WordCounter(Scanner in) {
        frequencyMap = new LinkedHashMap<String, Integer>();
        sizeOfLargestWord = 0;
        while (in.hasNext()) {
            String next = in.next();
            sizeOfLargestWord = Math.max(sizeOfLargestWord, next.length());
            int currentFrequency = frequencyMap.getOrDefault(next, 0);
            frequencyMap.put(next, currentFrequency + 1);
        }
        sortWordsByFrequency();
    }

    @Override
    public String toString() {
        String output = "";
        for (Map.Entry entry : frequencyMap.entrySet()) {
            String stars = generateStars((int) entry.getValue());
            output += String.format("%-" + (sizeOfLargestWord + 2) + "s" + stars + "\n", entry.getKey() + ":");
        }
        return output;
    }
}

package org.cop3330.ex46;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void addWord() {
        WordCounter wc = new WordCounter();
        assertTrue(wc.frequencyMap.isEmpty());
        wc.addWord("name");
        wc.addWord("people");
        wc.addWord("name");
        wc.addWord("name");
        wc.addWord("peoples");
        assertEquals(3, wc.frequencyMap.size());
        assertEquals(3, wc.frequencyMap.get("name"));
        assertEquals(1, wc.frequencyMap.get("people"));
        assertEquals(1, wc.frequencyMap.get("peoples"));
    }

    @Test
    void sortWordsByFrequency() {
        WordCounter wc = new WordCounter();
        assertTrue(wc.frequencyMap.isEmpty());
        wc.addWord("people");
        wc.addWord("name");
        wc.addWord("name");
        wc.addWord("name");
        wc.addWord("peoples");
        int i = 0;
        for (Map.Entry entry : wc.frequencyMap.entrySet()) {
            switch (i) {
                case 0:
                    assertEquals("people", entry.getKey());
                    break;
                case 1:
                    assertEquals("name", entry.getKey());
                    break;
                case 2:
                    assertEquals("peoples", entry.getKey());
                    break;
            }
            i++;
        }
        for (Map.Entry entry : wc.frequencyMap.entrySet()) {
            switch (i) {
                case 0:
                    assertEquals("name", entry.getKey());
                    break;
                case 1:
                    assertEquals("people", entry.getKey());
                    break;
                case 2:
                    assertEquals("peoples", entry.getKey());
                    break;
            }
            i++;
        }
    }

    @Test
    void generateStars() {
        WordCounter wc = new WordCounter();
        assertEquals("******", wc.generateStars(6));
        assertEquals("*", wc.generateStars(1));
        assertEquals("**********", wc.generateStars(10));
    }

    @Test
    void testToString() {
        WordCounter wc = new WordCounter();

        String[] words = "badger badger badger badger mushroom mushroom snake badger badger badger".split(" ");
        for (String word : words)
            wc.addWord(word);

        assertEquals("badger:   *******\n" +
                "mushroom: **\n" +
                "snake:    *\n"
        , wc.toString());
    }
}
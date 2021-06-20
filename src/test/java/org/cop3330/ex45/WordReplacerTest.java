/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330.ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordReplacerTest {

    @Test
    void addLine() {
        WordReplacer wr = new WordReplacer("research", "investigate");
        assertEquals("", wr.getWordReplacedText());
        wr.addLine("The cop was sent to research the case.");
        assertEquals("The cop was sent to investigate the case.", wr.getWordReplacedText());
        wr.addLine("The crime scene had already been well researched.");
        assertEquals("The cop was sent to investigate the case.\nThe crime scene had already been well investigateed.",
                wr.getWordReplacedText());
    }

    @Test
    void getWordReplacedText() {
        WordReplacer wr = new WordReplacer("Metro Boomin", "Pi'erre Bourne");
        assertEquals("", wr.getWordReplacedText());
        wr.addLine("Metro Boomin is my favorite producer.");
        assertEquals("Pi'erre Bourne is my favorite producer.", wr.getWordReplacedText());
        wr.addLine("Metro Boomin is also a great rapper himself");
        assertEquals("Pi'erre Bourne is my favorite producer.\nPi'erre Bourne is also a great rapper himself",
                wr.getWordReplacedText());
    }
}
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    private Task10 task10 = new Task10();
    private String text;
    private char symbol;

    @BeforeEach
    void setUp() {
        text = "The quick brown fox jumps over the lazy dog. " +
                "Every evening, exciting events unfold, and the energy is endless.\n";
        symbol = 'e';
    }

    @Test
    void countOccurrences() {
        int result = task10.countOccurrences(text, symbol);
        int expected = 14;
        assertEquals(expected, result);
    }
}
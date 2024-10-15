package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    private Task5 task5 = new Task5();
    private String text;
    private int key;

    @BeforeEach
    void setUp() {
        text = "Hello World";
        key = 5;
    }

    @Test
    void encrypt() {
        String result = task5.encrypt(text, key);
        String expected = "Mjqqt Btwqi";
        assertEquals(expected, result);
    }

    @Test
    void decrypt() {
        String result = task5.decrypt(text, key);
        String expected = "Czggj Rjmgy";
        assertEquals(expected, result);
    }
}
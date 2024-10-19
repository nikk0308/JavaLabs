package org.example.Task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    private Task5 task5;
    private String newText;

    @BeforeEach
    void setUp() {
        task5 = new Task5("Me", "Java", "Unit tests in Java are useful");
        newText = "Unit tests in Java are useless";
    }

    @Test
    void editText() {
        String actual = task5.getPostInfo();
        String expected = "Author: Me, Topic: Java, Text: Unit tests in Java are useful";
        assertEquals(expected, actual);
        task5.editText(newText);
        actual = task5.getPostInfo();
        expected = "Author: Me, Topic: Java, Text: Unit tests in Java are useless";
        assertEquals(expected, actual);
    }
}
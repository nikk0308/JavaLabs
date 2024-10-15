package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task44Test {

    private Task44 task44 = new Task44();
    private String text;

    @BeforeEach
    void setUp() {
        text = "42 'c' \"Java Programming\" 3.14 variableName 'T' 99.99 'x' 1000 \"\" not_a_number\n";
    }

    @Test
    void analyzeArguments() {
        List<String> resultArguments = new ArrayList<>();
        int resultAmount = task44.analyzeArguments(text, resultArguments);
        List<String> expectedArguments = new ArrayList<>();
        expectedArguments.add("Integer");
        expectedArguments.add("Character");
        expectedArguments.add("String");
        expectedArguments.add("Real");
        expectedArguments.add("Identifier");
        expectedArguments.add("Character");
        expectedArguments.add("Real");
        expectedArguments.add("Character");
        expectedArguments.add("Integer");
        expectedArguments.add("String");
        expectedArguments.add("Identifier");
        int expectedAmount = 11;
        assertEquals(resultAmount, expectedAmount);
        assertEquals(resultArguments, expectedArguments);
    }
}
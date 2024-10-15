package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    private Task24 task24 = new Task24();
    private String text;

    @BeforeEach
    void setUp() {
        text = "if myVariable1 _anotherVar while else invalid-arg 123 $dollar";
    }

    @Test
    void analyzeArguments() {
        List<String> resultArguments = new ArrayList<>();
        int resultAmount = task24.analyzeArguments(text, resultArguments);
        List<String> expectedArguments = new ArrayList<>();
        expectedArguments.add("Keyword");
        expectedArguments.add("Identifier");
        expectedArguments.add("Identifier");
        expectedArguments.add("Keyword");
        expectedArguments.add("Keyword");
        expectedArguments.add("Illegal");
        expectedArguments.add("Illegal");
        expectedArguments.add("Identifier");
        int expectedAmount = 8;
        assertEquals(resultAmount, expectedAmount);
        assertEquals(resultArguments, expectedArguments);
    }
}
package org.example.Task10;

import org.example.Task5.Task5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    private Task10 task10;

    @BeforeEach
    void setUp() {
        task10 = new Task10(2.5, 4);
    }

    @Test
    void setHeight() {
        String expectedMessage = "Negative number!";
        String actualMessage = assertThrows(IllegalArgumentException.class, () -> {
            task10.setHeight(-5);
        }).getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void setWidth() {
        String expectedMessage = "Negative number!";
        String actualMessage = assertThrows(IllegalArgumentException.class, () -> {
            task10.setWidth(-5);
        }).getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void calculateArea() {
        double actual = task10.calculateArea();
        double expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void calculatePerimeter() {
        double actual = task10.calculatePerimeter();
        double expected = 13;
        assertEquals(expected, actual);
    }
}
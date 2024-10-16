package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    private Task10 task10 = new Task10();

    @BeforeEach
    void setUp() {
        task10.addImage("Sunset", new Image("Bright orange sky over the ocean"));
        task10.addImage("Sunset", new Image("Bright orange sky over the ocean"));
        task10.addImage("MountainView", new Image("Snowy mountains under a blue sky"));
        task10.addImage("ForestPath", new Image("BA path through green woods"));
        task10.addImage("Beach", new Image("Sandy shore with calm blue water"));
    }

    @Test
    void searchImage() {
        Image result = task10.searchImage("Sunset_1");
        Image expected = new Image("Bright orange sky over the ocean");
        assertEquals(expected, result);
    }
}
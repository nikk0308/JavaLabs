package org.example;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    private Task9 task9 = new Task9();
    private int[] _testArray;

    @BeforeEach
    void setUp() {
        _testArray = new int[] {-1, 2, 3, -4, 0, 6, 7, 8, 9, 10};
    }

    @Test
    void formArrayB() {
        int[] result = task9.formArrayB(_testArray);
        int[] expected = new int[] {-4, 0, 2, 6, 8, 10, 9, 7, 3, -1};
        assertTrue(Arrays.equals(expected, result));
    }
}
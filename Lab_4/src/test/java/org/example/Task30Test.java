package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    private Task30 task30 = new Task30();

    @BeforeEach
    void setUp() {
        task30.addFile("file1.txt", new TextFile("C:/files/file1", "Description of file 1"));
        task30.addFile("file2.txt", new TextFile("C:/files/file2", "Description of file 2"));
        task30.addFile("file3.txt", new TextFile("C:/files/file3", "Description of file 3"));
        task30.addFile("file4.txt", new TextFile("C:/files/file4", "Description of file 4"));
        task30.addFile("file5.txt", new TextFile("C:/files/file5", "Description of file 5"));
    }

    @Test
    void searchFile() {
        TextFile result = task30.searchFile("file3.txt");
        TextFile expected = new TextFile("C:/files/file3", "Description of file 3");
        assertEquals(expected, result);
    }

    @Test
    void deleteFile() {
        boolean result = task30.deleteFile("file3.txt");
        boolean expected = true;
        assertEquals(expected, result);
        assertNull(task30.searchFile("file3.txt"));
    }
}
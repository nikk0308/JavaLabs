package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    private Task5 task5 = new Task5();

    @BeforeEach
    void setUp() {
        task5.addBook(1001, new Book("Programming in Java", "John Doe", "Tech Books", 2018, 49.99f));
        task5.addBook(1002, new Book("Data Structures", "Alice Smith", "LearnBooks", 2017, 39.99f));
        task5.addBook(1003, new Book("Algorithms", "Bob Johnson", "Algorithmic Press", 2019, 59.99f));
        task5.addBook(1004, new Book("Design Patterns", "Emily Davis", "Tech World", 2020, 44.99f));
        task5.addBook(1005, new Book("Artificial Intelligence", "Grace Lee", "AI Books", 2021, 79.99f));
    }

    @Test
    void sortByTitle() {
        List<Book> result = task5.sortByTitle();
        List<Book> expected = List.of(
                new Book("Algorithms", "Bob Johnson", "Algorithmic Press", 2019, 59.99f),
                new Book("Artificial Intelligence", "Grace Lee", "AI Books", 2021, 79.99f),
                new Book("Data Structures", "Alice Smith", "LearnBooks", 2017, 39.99f),
                new Book("Design Patterns", "Emily Davis", "Tech World", 2020, 44.99f),
                new Book("Programming in Java", "John Doe", "Tech Books", 2018, 49.99f)
        );
        assertEquals(result, expected);
    }

    @Test
    void sortByAuthor() {
        List<Book> result = task5.sortByAuthor();
        List<Book> expected = List.of(
                new Book("Data Structures", "Alice Smith", "LearnBooks", 2017, 39.99f),
                new Book("Algorithms", "Bob Johnson", "Algorithmic Press", 2019, 59.99f),
                new Book("Design Patterns", "Emily Davis", "Tech World", 2020, 44.99f),
                new Book("Artificial Intelligence", "Grace Lee", "AI Books", 2021, 79.99f),
                new Book("Programming in Java", "John Doe", "Tech Books", 2018, 49.99f)
        );
        assertEquals(result, expected);
    }

    @Test
    void sortByPrice() {
        List<Book> result = task5.sortByPrice();
        List<Book> expected = List.of(
                new Book("Data Structures", "Alice Smith", "LearnBooks", 2017, 39.99f),
                new Book("Design Patterns", "Emily Davis", "Tech World", 2020, 44.99f),
                new Book("Programming in Java", "John Doe", "Tech Books", 2018, 49.99f),
                new Book("Algorithms", "Bob Johnson", "Algorithmic Press", 2019, 59.99f),
                new Book("Artificial Intelligence", "Grace Lee", "AI Books", 2021, 79.99f)
        );
        assertEquals(result, expected);
    }
}
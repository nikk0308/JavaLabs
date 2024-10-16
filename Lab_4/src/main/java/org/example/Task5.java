package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Task5 {
    private HashMap<Integer, Book> catalog = new HashMap<>();

    public void addBook(int isbn, Book book) {
        catalog.put(isbn, book);
    }

    public void removeBook(int isbn) {
        Book book = catalog.remove(isbn);
    }

    private List<Book> getBooks() {
        return new ArrayList<>(catalog.values());
    }

    public List<Book> sortByTitle() {
        List<Book> sortedBooks = getBooks();
        sortedBooks.sort(Comparator.comparing(Book::getTitle));
        return sortedBooks;
    }

    public List<Book> sortByAuthor() {
        List<Book> sortedBooks = getBooks();
        sortedBooks.sort(Comparator.comparing(Book::getAuthor));
        return sortedBooks;
    }

    public List<Book> sortByPrice() {
        List<Book> sortedBooks = getBooks();
        sortedBooks.sort(Comparator.comparing(Book::getPrice));
        return sortedBooks;
    }
}

class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private float price;

    public Book(String title, String author, String publisher, int year, float price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public int getYear() { return year; }
    public float getPrice() { return price; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (year != book.year) return false;
        if (Float.compare(book.price, price) != 0) return false;
        if (!title.equals(book.title)) return false;
        if (!author.equals(book.author)) return false;
        return publisher.equals(book.publisher);
    }
}
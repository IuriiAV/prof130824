package com.telran.myLesson23Exceptions.exceptions;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {

    Map<String, Book> storage = new HashMap<>();

    public BookStorage() {
        init();
    }

    private void init() {
        storage.put("one", new Book("one", 134));
        storage.put("two", new Book("two", 122));
        storage.put("three", new Book("three", 345));
    }

    public Book getByTitle(String title) {

        Book book = storage.get(title);
        if (book == null) {
            throw new BookNotFoundException("The book with title " + title + " is not found");
        }
        return book;
    }
}

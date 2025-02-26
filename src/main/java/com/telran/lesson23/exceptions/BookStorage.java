package com.telran.lesson23.exceptions;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {

    Map<String, Book> storage = new HashMap<>();

    public BookStorage() {
        init();
    }

    private void init() {
        storage.put("one", new Book("one", 134));
        storage.put("two", new Book("two", 32));
        storage.put("three", new Book("three", 200));
    }

    public Book getByTitle(String title) {
        if (title == null) {
            throw new IncorrectBookTitleException("Book title in not correct");
        }
        Book book = storage.get(title);
        if (book == null) {
            throw new BookNotFoundException("Book with name " + title + " not found");
        }
        return book;
    }
}

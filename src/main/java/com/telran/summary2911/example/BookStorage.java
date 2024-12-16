package com.telran.summary2911.example;

import java.util.HashSet;
import java.util.Set;

public class BookStorage {

    private Set<Book> storage = new HashSet<>();

    public void add(Book book) {
        storage.add(book);
    }

    public boolean findBook(Book book) {
        return storage.contains(book);
    }

    public void printAll() {
        System.out.println(storage);
    }
}

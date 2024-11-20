package com.telran.summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Reader - name, readerId, books(limit = 5) array (Abstract)
 * * Пользователь мог показывать какие книги у него есть
 */
public abstract class Reader implements Printer {

    private String name;

    private int readerId; // "A567", "C445"

    private ReaderType type;

    private List<Book> books;

    private int emptySlot = -1;

    private int bookLimit;

    public Reader(String name, int readerId, ReaderType type, int limit) {
        this.name = name;
        this.readerId = readerId;
        this.type = type;
        this.books = new ArrayList<>();
        this.bookLimit = limit;
    }

    public void takeBook(Book book) {
        if (books.size() <= bookLimit) {
            this.books.add(book);
        }
        else System.out.println("User " + this.name + " has no place for this book.");
    }

    @Override
    public void printBooks() {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            System.out.println(book);
        }
    }
}

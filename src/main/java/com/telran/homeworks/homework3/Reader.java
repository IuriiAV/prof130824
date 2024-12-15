package com.telran.homeworks.homework3;

import java.util.ArrayList;
import java.util.List;

/**
 * Reader - name, readerId, books(limit = 5) array (Abstract)
 * * Пользователь мог показывать какие книги у него есть
 */
public abstract class Reader implements Printer {

    private String name;

    private int readerId;

    private ReaderType type;

    private List<Book> books;

    private int limit;

    public Reader(String name, int readerId, ReaderType type, int limit) {
        this.name = name;
        this.readerId = readerId;
        this.type = type;
        this.books = new ArrayList<>();
        this.limit = limit;
    }

    public boolean addBook(Book book) {
        if (books.size() < limit) {
            books.add(book);
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("No books currently borrowed.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
package com.telran.summary;

import java.util.ArrayList;
import java.util.List;

public abstract class Reader implements Printer {

    private final String name;

    private int readerID;

    private final ReaderType type;

    private final List<Book> booksReader = new ArrayList<>();

    private final int limit;

    public Reader(String name, int readerID, ReaderType type, int limit) {
        this.name = name;
        this.readerID = readerID;
        this.type = type;
        this.limit = limit;
    }

    public boolean isFullList() {
        return booksReader.size() < limit;
    }

    public void addBook(Book book) {
        for (int i = 0; i < booksReader.size() + 1; i++) {
            if (booksReader.size() < limit) {
                booksReader.add(book);
                return;
            }
        }

    }


    @Override
    public void printBooks() {
        for (Book book : booksReader) {
            if (book == null) {
                continue;
            }
            System.out.println("Reader " + name + " have a book :" + book);
        }

    }
}

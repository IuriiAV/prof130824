package com.telran.summeryLibrary;

import java.util.ArrayList;
import java.util.List;

public abstract class Reader implements Printer {

    private String name;

    private int readerId;

    private ReaderType type;

    private List<Book> books;

    public Reader(String name, int readerId, ReaderType type) {
        this.name = name;
        this.readerId = readerId;
        this.type = type;
        this.books = new ArrayList<>();
    }

    public void takeBook(Book book){
        books.add(book);
    }


    @Override
    public void printBooks() {
        System.out.println("The list of books from " + this.name + " is: ");
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            System.out.println(book);
        }
    }
}

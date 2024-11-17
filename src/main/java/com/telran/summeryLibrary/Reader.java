package com.telran.summeryLibrary;

public abstract class Reader implements Printer {

    private String name;

    private int readerId;

    private ReaderType type;

    private Book[] books;

    public Reader(String name, int readerId, ReaderType type, int limit) {
        this.name = name;
        this.readerId = readerId;
        this.type = type;
        this.books = new Book[limit];
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

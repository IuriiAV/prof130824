package com.telran.lesson5.practicee;

/**
 * Reader - name, readerId, books(массив книг которые у него есть) (limit = 5) array (Abstract)
 * Пользователь мог показывать какие книги у него есть
 */


public abstract class Reader implements Printer{

    private String name;

    private int readerId; // "A567", "C445"

    private ReaderType type;


    private Book[] books;

    public Reader(String name, ReaderType type, int readerId, int limit) {
        this.name = name;
        this.type = type;
        this.readerId = readerId;
        this.books = new Book[limit];
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }

    public Reader(int limit) {
        books = new Book[limit];
    }

    public void printBooks() {
        for (Book book : books) {
            if (book == null) {
                continue;

            }
            System.out.println(book);

        }
    }
}

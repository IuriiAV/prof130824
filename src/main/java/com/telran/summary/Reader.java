package com.telran.summary;

/**
 * Reader - name, readerId, books(limit = 5) array (Abstract)
 * * Пользователь мог показывать какие книги у него есть
 */
public abstract class Reader implements Printer {

    private String name;

    private int readerId; // "A567", "C445"

    private ReaderType type;

    private Book[] books;

    private int currentId = 0;

    public Reader(String name, int readerId, ReaderType type, int limit) {
        this.name = name;
        this.readerId = readerId;
        this.type = type;
        this.books = new Book[limit];
    }

    public boolean addBook(Book book) {
        if (books.length > currentId) {
            books[currentId] = book;
            currentId++;
            return true;
        }
        return false;
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

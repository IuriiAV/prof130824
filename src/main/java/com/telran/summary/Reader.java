package com.telran.summary;

import java.util.Objects;

/**
 * Reader - name, readerId, books(limit = 5) array (Abstract)
 * * Пользователь мог показывать какие книги у него есть
 */
public abstract class Reader implements Printer {

    private String name;

    private int readerId; // "A567", "C445"

    private ReaderType type;

    private Book[] books;

    private int emptySlot = 0;

    public Reader(String name, int readerId, ReaderType type, int limit) {
        this.name = name;
        this.readerId = readerId;
        this.type = type;
        this.books = new Book[limit];
    }

    private int findEmptySlot() {
        int indexEmpty = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                indexEmpty = i;
                break;
            }
        }
        return indexEmpty;
    }

    public void takeBook(Book book) {
        int emptySlot =  findEmptySlot();
        if (emptySlot > -1) this.books[emptySlot] = book;
        else System.out.println("User " + this.name + " has no place for this book.");
    }

    public Book returnBook(String isbn) {
        Book requestedBook = null;
        int indexBook = -1;
        for (int i = 0; i < books.length; i++) {
            if (Objects.equals(books[i].getIsbn(), isbn)) {
                requestedBook = books[i];
                indexBook = i;
                break;
            } else {
                System.out.println("User " + this.name + " does not have such a book.");
            }
        }
        if (indexBook > -1) books[indexBook] = null;
        return requestedBook;
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

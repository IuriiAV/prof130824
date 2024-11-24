package com.telran.summary;

import java.util.ArrayList;
import java.util.List;

/**
 * Librarian - name, department, books(limit = 10) (Abstract)
 * * Библиотекарь может выдать книгу пользователю
 * * Можно посмотреть какие книги есть(полный список)
 */
public abstract class Librarian implements Printer {

    private static final int BOOK_LIMIT = 10;

    private String name;

    private List<Book> books = new ArrayList<>();

    private Department department;

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void giveBook(String isbn, Reader reader) {
        Book bookToGive = null;


        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToGive = book;
                break;
            }
        }

        if (bookToGive == null) {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return;
        }

        // Передать книгу пользователю
        if (reader.addBook(bookToGive)) {
            books.remove(bookToGive);
            System.out.println("Book '" + bookToGive.getTitle() + "' has been given to " + reader.getName());
        } else {
            System.out.println("Reader cannot take more books. Limit reached.");
        }
    }

    @Override
    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Department getDepartment() {
        return department;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (books.size() < BOOK_LIMIT) {
            books.add(book);
        } else {
            System.out.println("Cannot add more books. Limit reached.");
        }
    }
}
package com.telran.summeryLibrary;

import java.util.ArrayList;
import java.util.List;

/**
 * Librarian - name, department, Book[] books (limit)
 */

public abstract class Librarian implements Printer {

    private String name;

    private Department department;

    private final List<Book> books = new ArrayList<>();

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void giveBook(String isbn, Reader reader) {
        for (Book book : books) {
            if (book.getIsbn() != null && book.getIsbn().equalsIgnoreCase(isbn)) {
                reader.takeBook(book);
                return;
            }
        }
    }

    @Override
    public void printBooks() {
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
}

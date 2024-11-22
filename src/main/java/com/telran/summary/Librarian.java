package com.telran.summary;

import java.util.ArrayList;
import java.util.List;

/**
 * Librarian - name, department, books(limit = 10) (Abstract)
 * * Библиотекарь может выдать книгу пользователю
 * * Можно посмотреть какие книги есть(полный список)
 */
public abstract class Librarian implements Printer {

    private String name;

    private final List<Book> books = new ArrayList<>(); //10 Magic number!!!

    private Department department;

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void giveBook(String isbn, Reader reader) {
        for (Book book: books) {
            if (book != null && book.getIsbn().equals(isbn)) {
                reader.takeBook(book);
                return;
            }
        }
        System.out.println("Librarian " + this.name + " does not have such a book.");
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

    public Department getDepartment() {
        return department;
    }

    public List<Book> getBooks() {
        return books;
    }
}
package com.telran.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Librarian implements Printer {

    private final String name;

    private final List<Book> books = new ArrayList<>();

    private final Department department;

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void giveBook(String isbn, Reader reader) {

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) != null  && Objects.equals(books.get(i).getIsbn(), isbn)) {
                if (reader.isFullList()) {
                    Book bookToGive = books.get(i);
                    reader.addBook(bookToGive);
                    books.set(i, null);

                }else {
                    System.out.println("Reader has reached the maximum limit and have this is books: ");
                }
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public void printBooks() {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            System.out.println("Librarian " + name + " have a book :" + book);
        }

    }
}

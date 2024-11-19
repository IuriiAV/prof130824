package com.telran.summary;

import java.util.Objects;

public abstract class Librarian implements Printer {

    private static final int BOOK_LIMIT = 10;

    private final String name;

    private final Book[] books = new Book[BOOK_LIMIT];

    private final Department department;

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void giveBook(String isbn, Reader reader) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && Objects.equals(books[i].getIsbn(), isbn)){
                Book bookToGive = books[i];
                books[i] = null;
                reader.addBook(bookToGive);
            }
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public void printBooks() {
        for(Book book : books){
            if (book == null){
                continue;
            }
            System.out.println("Librarian " + name + " have a book :" + book);
        }

    }
}

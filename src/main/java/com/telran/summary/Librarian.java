package com.telran.summary;

import java.util.Arrays;

public abstract class Librarian implements Printer {

    private static final int BOOK_LIMIT = 10;

    private String name;

    private final Book[] allBooks = new Book[BOOK_LIMIT];

    private Department department;

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void giveBook(String isbn, Reader reader) {

    }

    public Book[] getAllBooks() {
        return allBooks;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public void printBooks() {
        for(Book book : allBooks){
            System.out.println(book);
        }
        //System.out.println("All books " + Arrays.toString(allBooks));
    }
}

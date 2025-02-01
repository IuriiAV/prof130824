package com.telran.lesson22.dryyagnikiss;

/**
 * DRY - Don't repeat yourself
 *
 * YAGNI - You aren't gonna need it
 *
 * KISS - Keep It Simple, Stupid
 */
public class Book {

    private String title;

    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Book title = " + title);
        printAuthor();
    }

    public void printAuthor() {
        System.out.println("Book author = " + author);
    }
}

package com.telran.myLesson22.dryyagnikiss;

/**
 * DRY - don't repeat yourself
 * YAGNI = you are not gonna need it
 */
public class Book {

    private String title;

    private int pages;

    private String author;

    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Book title is: " + title);
        printAuthor();
    }

    private void printAuthor() {
        System.out.println("Book author is: " + author);
    }
}

package com.telran.summary070225;

public class Book {

    private long id;

    private String title;

    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}

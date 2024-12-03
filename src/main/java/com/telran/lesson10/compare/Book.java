package com.telran.lesson10.compare;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Book {

    private String title;

    private int pages;

    private int age;

    public Book(String title, int pages, int age) {
        this.title = title;
        this.pages = pages;
        this.age = age;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getAge() {
        return age;
    }
}

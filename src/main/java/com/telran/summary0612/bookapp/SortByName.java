package com.telran.summary0612.bookapp;

import java.util.Comparator;

public class SortByName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

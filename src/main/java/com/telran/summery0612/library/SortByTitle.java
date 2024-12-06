package com.telran.summery0612.library;

import java.util.Comparator;

public class SortByTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

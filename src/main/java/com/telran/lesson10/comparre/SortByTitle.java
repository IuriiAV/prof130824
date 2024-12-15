package com.telran.lesson10.comparre;

import java.util.Comparator;

public class SortByTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        String o1Title = o1.getTitle();
        String o2Title = o2.getTitle();
        return o1Title.compareTo(o2Title);
    }
}

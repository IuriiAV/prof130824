package com.telran.summarryfour.bookk;

import java.util.Comparator;

public class SortByCategory implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getGenre().getCategory() - o2.getGenre().getCategory();
    }
}
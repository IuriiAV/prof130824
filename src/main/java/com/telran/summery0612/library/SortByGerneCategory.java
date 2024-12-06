package com.telran.summery0612.library;

import java.util.Comparator;

public class SortByGerneCategory implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getGenre().getCategory() - o2.getGenre().getCategory();
    }
}

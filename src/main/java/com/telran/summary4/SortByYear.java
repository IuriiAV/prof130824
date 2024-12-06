package com.telran.summary4;

import java.util.Comparator;

public class SortByYear implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o2.getYear() - o1.getYear();
    }
}

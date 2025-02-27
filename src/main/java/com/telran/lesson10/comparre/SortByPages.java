package com.telran.lesson10.comparre;

import java.util.Comparator;

public class SortByPages implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {

        // -1,0,1 (<0,0, >0)
        return o1.getPages() - o2.getPages();
    }
}

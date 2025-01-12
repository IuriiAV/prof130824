package com.telran.summary0612.bookapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookApp {

    public static void main(String[] args) {
        //SortByName sortByName = new SortByName();
        List<Book> books = new ArrayList<>();

       // Comparator<Book> sortByBookName = (o1, o2) -> o1.getName().compareTo(o2.getName());

        Collections.sort(books, Comparator.comparing(Book::getName));
    }
}

package com.telran.myLesson10.compare;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookApp {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Two", 100, 1950),
                new Book("Four", 95, 1875),
                new Book("One", 150, 1940)
        );

        System.out.println(books);

        //Year
        SortByYear sortByYear = new SortByYear();
        Collections.sort(books,sortByYear);
        System.out.println(books);

        Collections.sort(books, new SortByTitle());
        System.out.println(books);
    }
}

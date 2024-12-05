package com.telran.lesson10.comparre;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookApp {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Two", 100, 1950),
                new Book("Four", 95, 1975),
                new Book("One", 150, 1940));

        System.out.println("Before sort ");
        printBooks(books);

        //Year
        SortByYear sortByYear = new SortByYear();
        Collections.sort(books, sortByYear);

        System.out.println("After sort ");
        printBooks(books);

        Collections.sort(books, new SortByPages());
        printBooks(books);

        Collections.sort(books, new SortByTitle());
        printBooks(books);
    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}


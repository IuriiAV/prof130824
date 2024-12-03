package com.telran.lesson10.compare;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookApp {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Two", 100, 1980),
                new Book("Four", 95, 1975),
                new Book("One", 150, 1940));

        System.out.println(books);

        SortByYear sortByYear = new SortByYear();
        Collections.sort(books, sortByYear);
        printBooks(books);

        Collections.sort(books,new SortByPages());
        printBooks(books);


        Collections.sort(books,new SotrByTitle());
        printBooks(books);

    }

    private static void printBooks(List<Book> books){
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

    }
}

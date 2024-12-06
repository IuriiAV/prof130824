package com.telran.summery0612.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppBook {

    public static void main(String[] args) {
        Author author1 = new Author("Steven", "King");
        Author author2 = new Author("Steven", "Queen");
        Author author3 = new Author("Ivan", "Ivanov");

        List<Book> books = new ArrayList<>();
        books.add(new Book("Title One", Genre.NOVEL, author1, 1999));
        books.add(new Book("Title Two", Genre.FICTION, author2, 2000));
        books.add(new Book("Title Three", Genre.NON_FICTION, author1, 2001));
        books.add(new Book("Title Four", Genre.FICTION, author3, 1893));
        books.add(new Book("Title Five", Genre.NON_FICTION, author2, 2005));
        books.add(new Book("Title Six", Genre.NOVEL, author2, 2024));

        System.out.println("Input a number:\n 1 - Author,\n2 - Title\n3 - year\n0 - exit");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
switch (choice){
    case 1 -> books.sort(new SortByAuthor());
    case 2 -> books.sort(new SortByTitle());
    case 3 -> books.sort(new SortByYear());
}

        }
    }
}

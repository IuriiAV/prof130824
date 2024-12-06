package com.telran.summary4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Book> bookList = new ArrayList<>();
        Author author1 = new Author("Roman", "Dogba");
        Author author2 = new Author("Roman", "Mihailov");
        Author author3 = new Author("Irina", "Serik");
        bookList.add(new Book("one", Genre.NOVEL,author1,1989));
        bookList.add(new Book("two", Genre.NOVEL,author2,1929));
        bookList.add(new Book("three", Genre.FICTION,author3,1999));
        bookList.add(new Book("four", Genre.NON_FICTION,author2,2989));
        bookList.add(new Book("five", Genre.NOVEL,author3,2089));
        while (true) {
            System.out.println("Type a number: \n0 -> Exit" +
                    "\n1 -> Author\n2 -> Title\n3 -> Year \n4 -> Genre \n5 -> Category");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }
            switch (choice){
                case 1 -> bookList.sort(new SortByAuthor());
                case 2 -> bookList.sort(new SortByTitle());
                case 3 -> bookList.sort(new SortByGenre());
                case 4 -> bookList.sort(new SortByCategory());
                case 5 -> bookList.sort(new SortByYear());
            }

            bookList.forEach(System.out::println);
        }




    }
}

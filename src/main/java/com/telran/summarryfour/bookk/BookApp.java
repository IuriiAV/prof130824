package com.telran.summarryfour.bookk;

import com.telran.summary.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        Author author1 = new Author("Roman", "Dogoda");
        Author author2 = new Author("Roman", "Mihalkov");
        Author author3 = new Author("Irina", "Krug");

        List<Book> books = new ArrayList<>();

        books.add(new Book("Title One", Genre1.NOVEL, author1, 1999));
        books.add(new Book("Title Two", Genre1.FICTION, author2, 2020));
        books.add(new Book("Title Three", Genre1.NON_FICTION, author3, 2001));
        books.add(new Book("Title Four", Genre1.NOVEL, author3, 2011));
        books.add(new Book("Title Five", Genre1.NON_FICTION, author1, 1987));
        books.add(new Book("Title Six", Genre1.FICTION, author2, 1993));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type a number: \n0 -> Exit" +
                    "\n1 -> Author\n2 -> Title\n3 -> Year \n4 -> Genre \n5 -> Category");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1 -> books.sort(new SortByAuthor());
                case 2 -> books.sort(new SortByTitle());
                case 3 -> books.sort(new SortByYear());
                case 4 -> books.sort(new SortByGenre());
                case 5 -> books.sort(new SortByCategory());
            }

            books.forEach(System.out::println);
        }
    }
}

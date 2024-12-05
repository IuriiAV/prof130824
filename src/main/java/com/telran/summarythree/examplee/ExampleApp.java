package com.telran.summarythree.examplee;

import java.util.Arrays;

public class ExampleApp {

    public static void main(String[] args) {


        Bookstorage bookstorage = new Bookstorage();

        Book one = new Book("AuthorOne", "One", "12345");
        Book two = new Book("AuthorTwo", "Two", "67891");
        Book three = new Book("AuthorThree", "Three", "25896");
        Book four = new Book("AuthorFour", "Four", "15655");

        Arrays.asList(one,four,three,two)
                .forEach(book -> bookstorage.add(book));

        bookstorage.printAll();

        two.setTitle(null);
        two.setAuthor(null);

        bookstorage.printAll();

       boolean result =  bookstorage.findBook(new Book("67891"));
        System.out.println("Book with isbn 67891 exists? : " + result);




    }
}

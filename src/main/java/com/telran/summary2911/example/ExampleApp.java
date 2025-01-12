package com.telran.summary2911.example;

import java.util.Arrays;

public class ExampleApp {

    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();

        Book one = new Book("AuthorOne", "One", "12345");
        Book two = new Book("AuthorTwo", "Two", "23434");
        Book three = new Book("AuthorThree", "Three", "32343");
        Book four = new Book("AuthorFour", "Three", "342455");

        Arrays.asList(one, four, three, two)
                .forEach(book -> bookStorage.add(book));

        bookStorage.printAll();

        two.setTitle(null);
        two.setAuthor(null);

        bookStorage.printAll();

        boolean result = bookStorage.findBook(new Book("23434"));
        System.out.println("Book with isbn 23434 exists ? " + result );
    }
}

package com.telran.summary3.example;

import java.util.Arrays;

public class ExampleApp {

    public static void main(String[] args) {

        BookStorage bookStorage = new BookStorage();

        Book one = new Book("AutorOne", "One", "111");
        Book two = new Book("AutorTwo", "Two", "222");
        Book three = new Book("AutorThree", "Three", "333");
        Book four = new Book("AutorFour", "Four", "444");

        Arrays.asList(one, two, three, four)
                .forEach(book -> bookStorage.add(book));

        bookStorage.printAll();

        two.setTitle(null);
        two.setAutor(null);

        bookStorage.printAll();

        boolean res = bookStorage.findBook(new Book("111"));
        System.out.println("Book with isbn 111 exists ? " + res);

    }
}

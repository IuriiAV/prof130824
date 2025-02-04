package com.telran.lesson23.exceptions;

public class BookApp {

    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();
        try {
            Book book = bookStorage.getByTitle("Five");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Try another title");
        } catch (IncorrectBookTitleException e) {
            System.out.println(e.getMessage());
            System.out.println("Please use correct book title");
        }
    }
}

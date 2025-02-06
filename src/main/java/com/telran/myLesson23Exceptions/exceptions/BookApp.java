package com.telran.myLesson23Exceptions.exceptions;

public class BookApp {

    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();

        try {
            Book five = bookStorage.getByTitle("Five");
        } catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}

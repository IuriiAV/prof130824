package com.telran.lesson23.exceptions;

public class BookApp {
    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();
        try {
            Book book = bookStorage.getByTitle("null");
        } catch (BookNotFoundException |IncorrectBookTitleException e) {
            System.out.println(e.getMessage());
            //System.out.println("Try another title");
        }
//        } catch (IncorrectBookTitleException e) {
//            System.out.println(e.getMessage());
//            System.out.println("Please use correct book title");
//        }
    }
}

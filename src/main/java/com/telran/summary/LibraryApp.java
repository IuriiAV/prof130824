package com.telran.summary;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        Book bookOne = new NonFictionBook("one", "AutorOne", "123", Genre.NON_FICTION);
        Book bookTwo = new NonFictionBook("two", "Autortwo", "222", Genre.NON_FICTION);

        Librarian one = new AdultLibrarian("Anna", Department.ART);
        Book[] oneBook = one.getAllBooks();

        Librarian two = new AdultLibrarian("Nik",Department.HISTORICAL);
        Book[] twoBook = two.getAllBooks();

        Librarian[] librarians = {one,two};
        Reader readerOne = new AdultReader("Alex", 1,ReaderType.ADULT,5);

        readerOne.printBooks();

        System.out.println("Department list :" );
        for( Department department : Department.values()){
            System.out.println(department);
        }
        System.out.println("Please choose department : ");
        Scanner scanner = new Scanner(System.in);
        String departmentAsString = scanner.next().toUpperCase();

        Department department = Department.valueOf(departmentAsString);

        System.out.println("Books from this department : ");

        Librarian ourLibrarian = null;
        for (int i = 0; i < librarians.length; i++) {
            Librarian librarian = librarians[i];
            if(department == librarian.getDepartment()){
                librarian.printBooks();
                ourLibrarian = librarian;
            }
        }

        System.out.println("Please choose book :");
        String isbn = scanner.next();

        ourLibrarian.giveBook(isbn,readerOne);

        readerOne.printBooks();



    }
}

package com.telran.summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {

    public void run() {


        Book bookOne = new NonFictionBook("one", "AutorOne", "111", Genre.NON_FICTION);
        Book bookTwo = new NonFictionBook("two", "Autortwo", "222", Genre.NON_FICTION);
        Book bookThree = new NonFictionBook("Three", "Autortwo", "333", Genre.MYSTERY);
        Book bookFour = new NonFictionBook("Four", "AutorOne", "444", Genre.NON_FICTION);
        Book bookFive = new NonFictionBook("Five", "Autortwo", "555", Genre.NON_FICTION);
        Book bookSix = new NonFictionBook("Six", "Autortwo", "666", Genre.MYSTERY);
        Book bookSeven = new NonFictionBook("Seven", "Autortwo", "777", Genre.MYSTERY);

        Librarian one = new AdultLibrarian("Anna", Department.ART);
        List<Book> listArt = one.getBooks();
        listArt.add(bookThree);
        listArt.add(bookFour);
        listArt.add(bookFive);
        listArt.add(bookSix);


        Librarian two = new AdultLibrarian("Nik", Department.HISTORICAL);
        List<Book> listHistorical = two.getBooks();
        listHistorical.add(bookOne);
        listHistorical.add(bookTwo);
        listHistorical.add(bookSeven);

        List<Librarian> librariansList = new ArrayList<>();
        librariansList.add(one);
        librariansList.add(two);
        //Librarian[] librarians = {one, two};

        Reader readerOne = new AdultReader("Alex", 1, ReaderType.ADULT, 2);


        String oneMore = String.valueOf(Const.Y);

        while (oneMore.equals("Y") ) {
            System.out.println("Department list :");
            for (Department department : Department.values()) {
                System.out.println(department);
            }
            System.out.println("Please choose department : ");
            Scanner scanner = new Scanner(System.in);
            String departmentAsString = scanner.next().toUpperCase();

            Department department = Department.valueOf(departmentAsString);

            System.out.println("Books from this department : ");

            Librarian ourLibrarian = null;
            for (Librarian librarian : librariansList) {
                if (department == librarian.getDepartment()) {
                    librarian.printBooks();
                    ourLibrarian = librarian;
                }
            }

            System.out.println("Please choose book :");
            String isbn = scanner.next();


            assert ourLibrarian != null;
            ourLibrarian.giveBook(isbn, readerOne);

            readerOne.printBooks();

            ourLibrarian.printBooks();


            System.out.println("Do you want to continue? Y/N");
            oneMore = scanner.next().toUpperCase();


        }
    }
}

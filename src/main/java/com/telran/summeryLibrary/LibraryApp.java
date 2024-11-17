package com.telran.summeryLibrary;

import java.util.Scanner;

/**
 * Система : библиотека
 * Читатель, Библиотекарь, Книга
 * Жанр книг (можно сделать фильтр)
 * Пользователь должен хранить у себя книги, взятые в библиотеке
 * Библиотекорь хранит книги, которые есть в библиотеке
 * можно посмотреть какие книги есть(полный список)
 * Библиотекорь может выдать книгу пользователю
 * Пользователь может показывать какие книги у него есть
 * <p>
 * Классы системы:
 * Reader.class, Librarian.class, Book.class
 * <p>
 * 1) Book - title(String), author(String), genre(Genre), isbn(String) - (Abstract)
 * Enum Genre
 * 2) Reader - name(String), readerId(String), Book[] books
 * 3) Librarian - name, department, Book[] books (limit)
 * <p>
 * Поведение обьектов
 */

public class LibraryApp {
    public static void main(String[] args) {
        // Creating books

        Book bookOne = new NonFictionBook("BookOne", "AuthorOne", "123", Genre.FICTION);
        Book bookTwo = new NonFictionBook("BookTwo", "AuthorTwo", "456", Genre.FICTION);
        Book bookThree = new NovellBook("BookThree", "AuthorThree", "789", Genre.ROMANCE);


        Librarian librarianOne = new AdultLibrarian("Anna", Department.ART);
        Book[] oneBooks = librarianOne.getBooks();

        Librarian librarianTwo = new AdultLibrarian("Maria", Department.HISTORICAL);

        Librarian[] librarians = {librarianTwo, librarianOne};
        Reader readerOne = new AdultReader("Alex", 1, ReaderType.ADULT, 5);

        readerOne.printBooks();

        System.out.println("Departments list: ");
        for (Department department : Department.values()) {
            System.out.println(department);
        }

        System.out.println("Please, choose a department: ");

        //Choose department
        Scanner scanner = new Scanner(System.in);
        String departmentAsString = scanner.next().toUpperCase();

        //Department from user
        Department department = Department.valueOf(departmentAsString);

        Librarian ourLibrarian = null;
        System.out.println("Books from this department: ");
        for (Librarian librarian : librarians) {
            if (department.equals(librarian.getDepartment())) {
                //found suitable librarian
                librarian.printBooks();
                ourLibrarian = librarian;
            }
        }

        System.out.println("Please, choose a book: ");
        String isbn = scanner.next();

        ourLibrarian.giveBook(isbn, readerOne);

        readerOne.printBooks();

        scanner.close();


//        Librarian librarian = null;
//
//
//        Reader readerTwo;
//
//        librarian.printBooks();
//        //Choose a book
//
//        librarian.giveBook("", readerOne);
//
//        readerOne.printBooks();
    }

}

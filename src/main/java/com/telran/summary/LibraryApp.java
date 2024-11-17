package com.telran.summary;

import java.util.Scanner;

/**
 * Система библиотека:
 * Читатель, Библиотекарь, Книга(и)
 * Жанры книг (можно сделать фильтр)
 * Пользователь должен хранить у себя книги взятые в библиотеке
 * Библиотекарь хранит книги которые есть в библиотеке
 * <p>
 * Можно посмотреть какие книги есть(полный список)
 * Библиотекарь может выдать книгу пользователю
 * Пользователь мог показывать какие книги у него есть
 * <p>
 * Классы системы:
 * Reader, Librarian, Book
 * <p>
 * 1)Book - title(String), author(String), genre(Enum), isbn(String), (Abstract)
 * Enum Genre
 * 2)Reader - name, readerId, books(limit = 5) array (Abstract)
 * <p>
 * 3)Librarian - name, department, books(limit = 10) (Abstract)
 * <p>
 * Поведение объектов:
 */
public class LibraryApp {

    public static void main(String[] args) {
        //0 Создадим книги
        Book bookOne = new NonFictionBook("BookOne", "AuthorOne", "123", Genre.NON_FICTION);
        Book bookTwo = new NonFictionBook("BookTwo", "AuthorTwo", "256", Genre.NON_FICTION);
        Book bookThree = new NovellBook("BookThree", "AuthorThree", "789", Genre.ROMANCE);

        //1) Создаем набор библиотекарей
        Librarian one = new AdultLibrarian("Anna", Department.ART);
        Book[] oneBooks = one.getBooks();
        oneBooks[0] = bookThree;

        Librarian two = new AdultLibrarian("Maria", Department.HISTORICAL);
        Book[] twoBooks = two.getBooks();
        twoBooks[0] = bookOne;
        twoBooks[1] = bookTwo;

        Librarian[] librarians = {one, two};
        Reader readerOne = new AdultReader("Alex", 1, ReaderType.ADULT, 5);
        Reader readerTwo = new AdultReader("Max", 2, ReaderType.ADULT, 5);
        //1_1) Попросим пользователя показать какие книги у него есть
        readerOne.printBooks();
        readerTwo.printBooks();

        //2) Показываем пользователю список всех департаментов
        System.out.println("Please choose department : ");
        System.out.println("Departments list : ");
        for (Department department : Department.values()) {
            System.out.println(department);
        }

        //3) Предлагаем пользователю определиться с департаментом
        //Choose department
        Scanner scanner = new Scanner(System.in);
        String departmentAsString = scanner.next().toUpperCase();
        //Department выбранный пользователем
        //Преобразовали строку введенную пользователем в енам!!!
        Department department = Department.valueOf(departmentAsString);

        //4) Прелагаем пользователю посмотреть книги, которые находятся
        //в выбранном департаменте
        //Книги находятся у библиотекаря, а библиотекарь имеет принадлежность
        //к конкретному департаменту по полю department в классе Librarian
        Librarian ourLibrarian = null;
        System.out.println("Books from this department : ");
        for (int i = 0; i < librarians.length; i++) {
            Librarian librarian = librarians[i];
            if (department == librarian.getDepartment()) {
                //found suitable librarian
                librarian.printBooks();
                ourLibrarian = librarian;
            }
        }

        //5)Попросим пользователя выбрать книгу из спика книг выведенных
        // их нужного департамента
        System.out.println("Please choose a book : ");
        String isbn = scanner.next();

        //6)Скажем выбранному библиотекарю, который записан теперь
        // в переменную ourLibrarian, что бы он дал книгу с
        //выбранным isbn нашему пользователю
        ourLibrarian.giveBook(isbn, readerOne);

        //7) Попросим пользователя показать какие книги у него есть
        readerOne.printBooks();
        readerTwo.printBooks();

        scanner.close();
    }
}

package com.telran.lesson5.practicee;

import java.util.Scanner;

/**
 * Cистема библиотека:
 * Читатель,Библиотекарь, Книга(и)
 * Жанры книг(можно сделать фильтр)
 * Пользователь должен хранить у себя книги взятые в библиотеке
 * Библиотекарь хранит книги которые есть в библиотеке
 * Можно посмотреть какие книги есть(полный список)
 * Библиотекарь может выдать книгу пользователю
 * Пользователь мог показывать какие книги у него есть
 *
 * Классы системы :
 * Reader, Librarian, Book
 *
 * 1)Book - (поля) - title(String), author(String), genre(Enum), isbn(String), (Abstract)
 * Enum Genre (Fiction, Non-fiction, Mystery, Thriller, Fantasy, Romance, Science fictions)
 *
 * 2)Reader - name, readerId, books(массив книг которые у него есть) (limit = 5) array (Abstract)
 *
 *3)Librarian - name, department, books (limit = 10),(Abstract)
 *
 * Поведение объектов:
 *
 *
 *
 */



public class LibraryApp {

    public static void main(String[] args) {
        // 0 Создадим книги
        Book bookOne = new NonFictionBook("Onebook", "AuthorOne", "123", Genre.NON_FICTION);
        Book bookTwo = new NonFictionBook("Twobook", "AuthorTwo", "256", Genre.NON_FICTION);
        Book bookThree = new NonFictionBook("Threebook", "AuthorThree", "789", Genre.ROMANCE);


//1) Создаем набор библиотекарей
        Librarian one = new AdultLibrarian("Anna", Department.ART);
        Book[] oneBooks = one.getBooks();
        oneBooks[9] = bookOne;
        Librarian two = new AdultLibrarian("Maria", Department.HISTORICAL);
        Book[] twoBooks = two.getBooks();
        Book[] threeBooks = two.getBooks();
        twoBooks[1] = bookTwo;
        threeBooks[7] = bookThree;
        Librarian[] librarians = {one,two};

        Reader readerOne = new AdultReader("Alex", ReaderType.ADULT, 1,5);

        // 1.1) Попросим пользователя какие книги у него есть
               readerOne.printBooks();
//2) Показываем пользователю список всех департаментов
        System.out.println("Please choose  departments : ");
        System.out.println("Departments list : ");
        for (Department department : Department.values()) {
            System.out.println(department);
        }
        //3) Предлагаем пользователю определиться с департаментом
        // Choose department
        Scanner scanner = new Scanner(System.in);
        String departmentAsString = scanner.next().toUpperCase();
        // Department выбранный пользователем
        //Преоброзовали строку введеную пользователем в енам
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

        //5) Попросим пользователя вібрать книгу из списка книг віведенніх из нужного департамента
        System.out.println("Please choose a book : ");
        String isbn = scanner.next();

        //6) Скажем выбранному библиотекарю,которій записан теперь в переменную  ourLibrarian, что бы он дал книгу с выбранным isbn
        // нашему пользователю
        ourLibrarian.giveBook(isbn, readerOne);

        //7) Попросим пользователя какие книги у него есть
               readerOne.printBooks();

               scanner.close();

            }
        }




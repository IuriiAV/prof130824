package com.telran.lesson5.practicee;

/**
 * Librarian - name, department, books (limit = 10),(Abstract)
 * Библиотекарь может выдать книгу пользователю
 * Можно посмотреть какие книги есть(полный список)
 */

public class Librarian implements Printer {

    private static final int BOOK_LIMIT = 10;

    private String name;

    private final Book[] books = new Book[BOOK_LIMIT]; // 10 Magic number!!!



    private Department department;

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void giveBook(String isbn, Reader reader) {
for (int i = 0; i < books.length; i++) {
    Book book = books[i];
    if (book != null && book.getIsbn().equals(isbn)) {

        Book[] userBooks = reader.getBooks();
        for (int j = 0; j < userBooks.length; j++) {
            if (userBooks[j] == null) {

                userBooks[j] = book;

                books[i] = null;
                System.out.println("Книга \"" + book.getTitle() + "\" выдана читателю " + reader.getName());
                return;
            }
        }

        System.out.println("Читатель " + reader.getName() + " не может взять больше книг.");
        return;
    }
}
    }

    @Override
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Department getDepartment() {
        return department;
    }

    public Book[] getBooks() {
        return books;
    }
}

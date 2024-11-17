package com.telran.summary;

/**
 * Librarian - name, department, books(limit = 10) (Abstract)
 * * Библиотекарь может выдать книгу пользователю
 * * Можно посмотреть какие книги есть(полный список)
 */
public abstract class Librarian implements Printer {

    private static final int BOOK_LIMIT = 10;

    private String name;

    private final Book[] books = new Book[BOOK_LIMIT]; // 10 Magic number!!!

    private Department department;

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void giveBook(String isbn, Reader reader) {
        // Найти книгу по ISBN в массиве книг библиотекаря
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book != null && book.getIsbn().equals(isbn)) {
                // Проверить, есть ли место у читателя для новой книги
                Book[] readerBooks = reader.getBooks();
                for (int j = 0; j < readerBooks.length; j++) {
                    if (readerBooks[j] == null) {
                        // Добавить книгу читателю
                        readerBooks[j] = book;
                        // Удалить книгу из массива библиотекаря
                        books[i] = null;
                        System.out.println("Книга \"" + book.getTitle() + "\" выдана читателю " + reader.getName());
                        return; // Завершить метод
                    }
                }
                // Если у читателя нет места для книги
                System.out.println("Читатель " + reader.getName() + " не может взять больше книг.");
                return;
            }
        }
        // Если книга не найдена
        System.out.println("Книга с ISBN " + isbn + " не найдена.");
    }

    @Override
    public void printBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public Department getDepartment() {
        return department;
    }

    public Book[] getBooks() {
        return books;
    }
}
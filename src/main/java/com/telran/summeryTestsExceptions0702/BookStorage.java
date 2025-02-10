package com.telran.summeryTestsExceptions0702;


import java.util.*;

public class BookStorage {

    //id | title | pages

    Map<Long, Book> database = new TreeMap<>();

    Map<String, Book> storage = new HashMap<>();

    public BookStorage() {
        initDB();
    }

    public void reInit() {
        database.clear();
        initDB();
    }

    private void initDB() {
        List<Book> books = Arrays.asList(
                new Book("one", 134),
                new Book("two", 32),
                new Book("three", 200)
        );
        long id = 1;
        for (Book book : books) {
            book.setId(id++);
            database.put(book.getId(), book);
        }
    }

    private void init() {
        System.out.println("init new storage");
        storage.put("one", new Book("one", 134));
        storage.put("two", new Book("two", 32));
        storage.put("three", new Book("three", 200));
    }


    public List<Book> getAll() {
        return database.values().stream().toList();
    }

    //save in DB -> object(Book) -> entity(Book) + id -> return Entity
    public Book add(Book book) {
        SortedMap<Long,Book> database = (SortedMap) this.database;
        Long lastId = database.lastKey();
        long id = lastId + 1;
        book.setId(id);
        this.database.put(id, book);
        return book;
//        storage.put(book.getTitle(), book);
    }

    public Book getByTitle(String title) {
        if (title == null) {
            throw new IncorrectBookTitleException("Book title in not correct");
        }
        Book book = storage.get(title);
        if (book == null) {
            throw new BookNotFoundException("Book with name " + title + " not found");
        }
        return book;
    }
}

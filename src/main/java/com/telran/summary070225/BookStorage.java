package com.telran.summary070225;


import java.util.*;

public class BookStorage {


    //id  |  title  |  pages
    SortedMap<Long, Book> database = new TreeMap<>();

    Map<String, Book> storage = new HashMap<>();

    public BookStorage() {
        initDatabase();
    }

    public void reInit() {
        database.clear();
        initDatabase();
    }

    private void initDatabase() {
        List<Book> books = Arrays.asList(
                new Book("one", 134),
         new Book("two", 32),
         new Book("three", 200));

long id = 1;
for (Book book : books) {
    book.setId(id++);
    database.put(book.getId(),book);
}

    }

//    private void init() {
//
//        storage.put("one", new Book("one", 134));
//        storage.put("two", new Book("two", 32));
//        storage.put("three", new Book("three", 200));
//
//    }
//

    public List<Book> getAll() {
        return new ArrayList<>(database.values());
    }

    //save - > object(Book) -> entity(Book) + id - > return Entity

    public Book add(Book book) {
        Long lastId = database.lastKey();
        long id = lastId + 1;
        book.setId(id);
        database.put(id,book);
        return book;
    }


    public Book getByTitle(String title) {
        if (title == null) {
            throw new IncorrectBookTitleException("Book title is not correct");
        }
        Book book = storage.get(title);
        if (book == null) {
            throw new BookNotFoundException("Book with name " + title + " not found");
        }
        return book;
    }
}
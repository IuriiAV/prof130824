package com.telran.summeryTestsExceptions0702;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookStorageTest {

    private static BookStorage bookStorage;

    @BeforeAll
    public static void initAll() {
        bookStorage = new BookStorage();
    }

    @AfterAll
    public static void afterAll() {

    }

    @BeforeEach
    public void clear() {
        bookStorage.reInit();
    }

    @Test
    public void testGetAllBooksFromStorage() {
        List<Book> all = bookStorage.getAll();
        assertEquals(3, all.size());
    }

    @Test
    public void testAddBookToStorage() {
        Book four = new Book("Four", 350);
        Book entity = bookStorage.add(four);
        assertEquals(4, bookStorage.getAll().size());
        assertEquals(4,entity.getId());
    }

    @Test
    public void testGetByTitle() {

    }

    @Test
    public void testAddBook() {

    }

    @Test
    public void testRemoveBookFromStorage() {

    }

}
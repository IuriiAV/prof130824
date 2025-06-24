package com.telran.summary0702;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookStorageTest {

    private static BookStorage bookStorage;

    @BeforeAll
    private static void initAll() {
        bookStorage = new BookStorage();
        System.out.println("Before all test");
    }

    @AfterAll
    private static void afterAll() {
        System.out.println("After all test");
    }

    @BeforeEach
    private void init() {
        System.out.println("Before each test");
        bookStorage.reInit();
    }

    @AfterEach
    private void destroy() {
        System.out.println("After each test");
    }

    @Test
    public void testGetAllBooksFromStorage() {
        List<Book> all = bookStorage.getAll();
        assertEquals(3, all.size());
    }

    @Test
    public void testGetBookByTitle() {

    }

    @Test
    public void testAddBookToStorage() {
        Book four = new Book("Four", 350);
        Book entity = bookStorage.add(four);

        List<Book> all = bookStorage.getAll();
        assertEquals(4, all.size());
        assertEquals(4, entity.getId(), "Check correct id");
    }

    @Test
    public void testRemoveBookFromStorage() {

    }

}
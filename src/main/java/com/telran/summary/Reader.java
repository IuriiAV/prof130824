package com.telran.summary;

public abstract class Reader implements Printer {

    private String name;

    private int readerID;

    private ReaderType type;

    private Book[] booksReader;

    public Reader(String name, int readerID, ReaderType type,int limit) {
        this.name = name;
        this.readerID = readerID;
        this.type = type;
        this.booksReader = new Book[limit];
    }

    public void addBook(Book book) {
        for (int i = 0; i < this.booksReader.length; i++) {
            if (this.booksReader[i] == null) {
                this.booksReader[i] = book;
                return;
            }
        }
        System.out.println("Reader has reached the maximum limit.");
    }


    @Override
    public void printBooks() {
        for (Book book : booksReader) {
            if (book == null){
               // System.out.println("Reader " + name+" have not book");
                continue;
            }
            System.out.println("Reader " + name + " have a book :" + book);
        }
    }
}

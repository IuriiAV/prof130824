package com.telran.summary;

public abstract class Reader implements Printer {

    private String name;

    private int readerID;

    private ReaderType type;

    private Book[] books;

    public Reader(String name, int readerID, ReaderType type,int limit) {
        this.name = name;
        this.readerID = readerID;
        this.type = type;
        this.books = new Book[limit];
    }


    @Override
    public void printBooks() {
        for (Book book : books) {
            if (book == null){
                //System.out.println("Reader " + name+" have not book");
                continue;
            }
            System.out.println(book);
        }
    }
}

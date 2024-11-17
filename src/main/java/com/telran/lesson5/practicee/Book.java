package com.telran.lesson5.practicee;

/**
 * 1)Book - (поля) - title(String), author(String), genre(Enum), isbn(String), (Abstract)
 *  * Enum Genre (Fiction, Non-fiction, Mystery, Thriller, Fantasy, Romance, Science fictions)
 */



public abstract class Book {

    private String title;

    private String author;

    private String isbn;

    private Genre genre;

    public Book(String title, String author, String isbn, Genre genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", genre=" + genre +
                '}';
    }
}

package com.telran.summery0612.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Book {

    private String title;

    private Genre genre;

    private Author author;

    private int year;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", author=" + author +
                ", year=" + year +
                "}\n";
    }
}

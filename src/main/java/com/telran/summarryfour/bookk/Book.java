package com.telran.summarryfour.bookk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Book {

    private String title;

  private Genre1 genre;

    private Author author;

    private int year;
}

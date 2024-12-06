package com.telran.summary4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Book {

    private  String title;

    private Genre genre;

    private Author Author;

    private  int year;
}

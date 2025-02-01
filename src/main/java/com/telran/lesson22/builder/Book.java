package com.telran.lesson22.builder;

import lombok.Builder;

@Builder
public class Book {

    private String title;

    private String author;

    private int pages;

    private String isbn;
}

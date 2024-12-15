package com.telran.summarryfour.bookk;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
//        int authorNameResult = o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
//        int authorSurnameResult = o1.getAuthor().getSurname().compareTo(o2.getAuthor().getSurname());
//        if (authorNameResult == 0) {
//            return authorSurnameResult;
//        }
//        return authorNameResult;
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}

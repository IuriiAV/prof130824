package com.telran.lesson10.compare;

import java.util.Comparator;

/**
 * //o1 and o2
 * //o1.year and o2.year
 * //o1.year < o2.year  o1 < o2
 * //o1.year == o2.year o1 == o2
 * //o1.year > o2.year  o2 < o1
 * // o1 < o2 return any < 0 ,  -1
 * // o1 == o2 return 0  ,       0
 * // o1 > o2 return any > 0,    1
 */
public class SortByYear implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear() - o2.getYear();

//        if (o1.getYear() < o2.getYear()) {
//            return -1;
//        }
//        if (o1.getYear() > o2.getYear()) {
//            return 1;
//        }
//
//        return 0;
    }
}

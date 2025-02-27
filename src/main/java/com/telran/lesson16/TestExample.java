package com.telran.lesson16;

import java.util.List;

/*
"BigBen"
"BigBob"
"Big"
"Ben"
"Big Bob"

"Big" - count ?
 */
public class TestExample {

    public static void main(String[] args) {
        List<String> bigs = List.of("BigBen", "BigBob", "Big", "Ben", "Big Bob");

        long count = bigs.stream()
                .filter(s -> s.startsWith("Big"))
                .count();

        System.out.println("count 'Big' : " + count);
    }
}

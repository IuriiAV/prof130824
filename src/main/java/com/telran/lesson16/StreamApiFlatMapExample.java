package com.telran.lesson16;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiFlatMapExample {

    public static void main(String[] args) {
        List<Integer> one = Arrays.asList(1, 2, 3, 4);
        List<Integer> two = Arrays.asList(5, 6, 7, 8);

        List<List<Integer>> all = Arrays.asList(one, two);
        for (List<Integer> list : all) {
            for (Integer value : list) {
                System.out.print(" " + value * 2);
            }
        }

        System.out.println();

        all.stream()
                .flatMap(list -> list.stream())  // List<Integer>
                // 1 2 3 4 5 6 7 8
                .map(value -> value * 2)
                // 2 4 6 8 10 12 14 16
                .forEach(value -> System.out.print(" " + value));
        System.out.println();

        List<Integer> collect = all.stream()
                .flatMap(list -> list.stream())  // List<Integer>
                // 1 2 3 4 5 6 7 8
                .map(value -> value * 2)
                // 2 4 6 8 10 12 14 16
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}

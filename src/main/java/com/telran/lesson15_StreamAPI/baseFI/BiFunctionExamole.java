package com.telran.lesson15_StreamAPI.baseFI;

import java.util.function.BiFunction;

public class BiFunctionExamole {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        BiFunction<Integer, Integer, Long> mult = (a, b) -> (long) (a * b);
        BiFunction<Integer, Integer, Double> div = (a, b) -> (double) (a / b);

        System.out.println(sum.apply(5,7));
        System.out.println(mult.apply(5,6));
        System.out.println(div.apply(19,3));
    }
}

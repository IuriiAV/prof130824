package com.telran.lesson15.basefi;

import java.util.function.BiFunction;

/**
 * BiFunction :
 * method apply
 * Принимает два параметра и возвращает один параметр
 * Типы принимаемого и возвращаемого значения могут быть одинаковые или разные
 * BiFunction<Тип принимаемого, Тип принимаемого, Тип возвращаемого>
 */
public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        BiFunction<Integer, Integer, Long> mult = (a, b) -> Long.valueOf(a * b);
        BiFunction<Integer, Integer, Double> div = (a, b) -> (a / (double) b);
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;

        System.out.println(sum.apply(5,7));
        System.out.println(mult.apply(5,6));
        System.out.println(div.apply(19,3));
        System.out.println(sub.apply(10,2));
    }
}

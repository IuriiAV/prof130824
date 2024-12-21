package com.telran.lesson15_StreamAPI.baseFI;

import java.util.function.Supplier;

/**
 * **
 * Supplier :
 * method get
 * Не принимает параметры, но возвращает значение
 * */

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
    }
}

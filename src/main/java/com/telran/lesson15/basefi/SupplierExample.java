package com.telran.lesson15.basefi;

import java.util.function.Supplier;

/**
 * Supplier :
 * method get
 * Не Принимает никаких параметров, но при этом возвращает какое либо значение
 */
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () ->  Math.random();
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
    }
}

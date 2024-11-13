package com.telran.mylesson4.passbyvalue;

import java.util.Arrays;

public class ReferenceExample {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};

        System.out.println("Array from main before " + Arrays.toString(ints));
        //Pass-by-value - копия значения ссылки на массив
        methodOne(ints);

        System.out.println("Array from main after " + Arrays.toString(ints));
    }

    private static void methodOne(int[] ints) {
        ints[0] = 5;
        System.out.println("Array from method " + Arrays.toString(ints));
    }
}

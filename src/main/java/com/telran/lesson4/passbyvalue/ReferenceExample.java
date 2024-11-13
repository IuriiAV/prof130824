package com.telran.lesson4.passbyvalue;

import java.util.Arrays;

public class ReferenceExample {

    /*
       HEAP  : for Reference    : #FFEEHH new int[]{5,2,3}

       STACK : for method, primitive
       LIFO - Last input , first output
       |     |
       |methodTwo : int a = 15;    |
       |methodOne : int[] ints = #FFEEHH , ints[0]=5|
       |main : int number = 10; int[] ints = #FFEEHH|

     */

    public static void main(String[] args) {
        int number = 10; // 10
        int[] ints = {1, 2, 3}; // #FFEEHH
        System.out.println("Array from main before " + Arrays.toString(ints));
        //Pass-by-value - копию значения ссылки на массив
        methodOne(ints); //methodOne(#FFEEHH)

        System.out.println("Array from main after " + Arrays.toString(ints));
    }

    private static void methodOne(int[] ints) {
        //int[] ints = #FFEEHH;
        ints[0] = 5;
        System.out.println("Array from method " + Arrays.toString(ints));
        methodTwo();
    }

    private static void methodTwo() {
        int a = 15;
    }
}
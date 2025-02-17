package com.telran.h_13;

import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();

        System.out.println("Max number is " + numberAnalyzer.getMax(list));
        System.out.println("Min number is " + numberAnalyzer.getMin(list));
        System.out.println("AVG number is " + numberAnalyzer.getAverage(list));
    }
}

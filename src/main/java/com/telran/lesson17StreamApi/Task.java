package com.telran.lesson17StreamApi;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {17, 13, 15}, {7, 9, 25}};

        Arrays.stream(arr).flatMapToInt(arrOne -> Arrays.stream(arrOne)).forEach(s -> System.out.print(s + " "));
    }
}

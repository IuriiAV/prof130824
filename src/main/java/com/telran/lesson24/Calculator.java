package com.telran.lesson24;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int findMax(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }
        int max = arr[0];
        for (int value : arr) {
            max = Math.max(max, value);
        }
        return max;
    }
}
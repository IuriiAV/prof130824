package com.telran.h3.third;

import java.util.ArrayList;
import java.util.List;

public class FilterOddNumbers {

    public static List<Integer> getOddNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        numbers.add(2);

        numbers.add(3);

        numbers.add(4);

        numbers.add(5);

        numbers.add(6);

        List<Integer> oddNumbers = getOddNumber(numbers);

        System.out.println("Original list is: " + numbers);
        System.out.println("List of odd numbers is: " + oddNumbers);

    }
}

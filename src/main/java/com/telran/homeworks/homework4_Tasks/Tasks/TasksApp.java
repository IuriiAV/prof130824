package com.telran.homeworks.homework4_Tasks.Tasks;

import java.util.Arrays;
import java.util.List;

import static com.telran.homeworks.homework4_Tasks.Tasks.TasksMethod.*;

public class TasksApp {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "pineapple", "pear", "apple");

        System.out.println("Doubled values: " + multiplyTwo(nums));

        System.out.println("String lengths: " + getStringLengths(strings));

        System.out.println("Odd numbers: " + filterOddNumbers(nums));

        System.out.println("Original list: " + strings);
        List<String> uniqueStrings = removeDuplicates(strings);
        System.out.println("List without duplicates: " + uniqueStrings);


        System.out.println("Concatenate string: " + concatenateString(strings));

        System.out.println("Max value: " + findMax(nums));
        System.out.println("Min value: " + findMin(nums));

        System.out.println("Max string length: " + findMaxLength(strings));
    }

}


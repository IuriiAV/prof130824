package com.telran.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
 * 2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
 * 3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
 * 4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
 * 5.у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
 * 6.у вас есть список значений int и вы должны вернуть их максимум или минимум
 * 7.у вас есть список String и вы должны вернуть максимальную длину
 */
public class ArrayListTask {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 7, 33, 102, -15, 0, 49));
        List<String> strings = new ArrayList<>(Arrays.asList("Four", "One", "Four", "Two", "One", "Nineteen", "Tree", "Five", "Four", "One", "Five"));

        System.out.println("Initial list of integers: " + numbers);

        System.out.println("Integers multiplied by 2: " + multiply(numbers));

        System.out.println("Initial list of strings: " + strings);
        System.out.println("Lengths of each String in the list: " + countLength(strings));

        System.out.println("The odd numbers are: " + oddNumbers(numbers));

        removeDuplicates(strings);
        System.out.println("Only unique values: " + strings);

        System.out.println("Concatenated values in one string: " + concatenateValues(strings));

        //task 7: I found 2 ways of how this tasks can be solved. But I can not make a decision, which one is better:
        System.out.println("The list of strings: " + strings);
        //in this case the existing code is reused
        System.out.println("Max string in the List has length: " + findMax(countLength(strings)));
        //but in this case the performance is better? what is better to use in this situation?
        System.out.println("Max string in the List has length: " + maxLength(strings));
    }

    // 1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
    private static List<Integer> multiply(List<Integer> nums) {
        List<Integer> multipliedValues = new ArrayList<>();
        for (Integer num : nums) {
            multipliedValues.add(num * 2);
        }
        return multipliedValues;
    }

    //2.у вас есть список значений String, и вы должны вернуть список длины каждого из этих значений String .
    private static List<Integer> countLength(List<String> strings) {
        List<Integer> lengths = new ArrayList<>();
        for (String str : strings) {
            lengths.add(str.length());
        }
        return lengths;
    }

    // 3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
    private static List<Integer> oddNumbers(List<Integer> integers) {
        List<Integer> odds = new ArrayList<>();
        for (Integer value : integers) {
            if (value % 2 != 0) {
                odds.add(value);
            }
        }
        return odds;
    }

    // 4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
    private static void removeDuplicates(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                if (i != j && strings.get(i).equals(strings.get(j))) {
                    strings.remove(i);
                    j--;
                }
            }
        }
    }

    //5.у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
    private static String concatenateValues(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    // 6.у вас есть список значений int и вы должны вернуть их максимум или минимум
    private static int findMin(List<Integer> integers) {
        int min = integers.get(0);
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) < min) {
                min = integers.get(i);
            }
        }
        return min;
    }

    // 6.у вас есть список значений int и вы должны вернуть их максимум или минимум
    private static int findMax(List<Integer> integers) {
        int max = integers.get(0);

        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) > max) {
                max = integers.get(i);
            }
        }
        return max;
    }

    //7. у вас есть список String и вы должны вернуть максимальную длину
    private static int maxLength(List<String> strings) {
        int max = strings.get(0).length();
        for (String str : strings) {
            if (str.length() > max) {
                max = str.length();
            }
        }
        return max;
    }
}

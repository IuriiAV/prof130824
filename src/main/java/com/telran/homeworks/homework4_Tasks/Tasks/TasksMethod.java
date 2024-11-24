package com.telran.homeworks.homework4_Tasks.Tasks;

import java.util.ArrayList;
import java.util.List;

public class TasksMethod {

    /* 1 - у вас есть список значений int и вы должны вернуть список,
    каждое значение которого умножается на 2

     */

    public static List<Integer> multiplyTwo(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add(num * 2);
        }
        return result;
    }

    /*
    2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
     */

    public static List<Integer> getStringLengths(List<String> strings) {
        List<Integer> lengths = new ArrayList<>();
        for (String str : strings) {
            lengths.add(str.length());
        }
        return lengths;
    }

    /*3.у вас есть список значений int и вы должны вернуть список,
    содержащий только нечетные числа
     */

    public static List<Integer> filterOddNumbers(List<Integer> nums) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    /*
    4.у вас есть список значений String , и вы должны вернуть
    список этих значений без каких-либо дубликатов.
     */
    public static List<String> removeDuplicates(List<String> strings) {
        List<String> uniqueStrings = new ArrayList<>();
        for (String str : strings) {
            if (!uniqueStrings.contains(str)) {
                uniqueStrings.add(str);
            }
        }
        return uniqueStrings;
    }

        /*
        5.у вас есть список значений String , и вы должны вернуть одну строку ,
        которая представляет собой конкатенацию всех значений.
         */

    public static String concatenateString(List<String> strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

              /*
              6.у вас есть список значений int и вы должны вернуть их максимум или минимум
               */

    public static int findMax(List<Integer> nums) {
        int max = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(List<Integer> nums) {
        int min = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /*
    7.у вас есть список String и вы должны вернуть максимальную длину
     */


    public static int findMaxLength(List<String> strings) {
        int maxLength = 0;
        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }
}





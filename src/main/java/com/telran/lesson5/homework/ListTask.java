package com.telran.lesson5.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTask {

    private static final ArrayList<Integer> integerList = new ArrayList<>();
    private static final ArrayList<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> mockDatOne = List.of(134, 225, 3, 44, 5, 63, 8, 876, 9, 101, 121, -2);
        integerList.addAll(mockDatOne);

        List<String> mockDataTwo = List.of("Something ", "should ", "be ", "here. ", "Something ", "shouldn't ", "be ", "here. ", "Some exact values.");
        stringList.addAll(mockDataTwo);
        
        // Task One
        System.out.println("This returns list with doubled elements: " + doubleInt(integerList));

        // Task Two
        System.out.println("This returns list with sizes of elements: " + showStringSize(stringList));

        // Task Three
        System.out.println("This returns only odd elements: " + filterOdd(integerList));

        // Task Four
        System.out.println("This returns unique strings: " + filterUniqueStr(stringList));

        // Task Five
        System.out.println("This returns concat of all strings: " + concatAllStrings(stringList));

        // Task Six
        System.out.println("This returns min and max values: " + Arrays.toString(findMinMax(integerList)));

        // Task Seven
        System.out.println("This returns max length of strings: " + getMaxStringLength(stringList));
    }

    private static List<Integer> doubleInt(List<Integer> numList) {
        List<Integer> result = new ArrayList<>();
        for (int num : numList) {
            result.add(num * 2);
        }
        return result;
    }

    private static List<Integer> showStringSize(List<String> strList) {
        List<Integer> result = new ArrayList<>();
        for (String str : strList) {
            result.add(str.trim().length());
        }
        return result;
    }

    private static List<Integer> filterOdd(List<Integer> numList) {
        List<Integer> result = new ArrayList<>();
        for (int num : numList) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result;
    }

    private static List<String> filterUniqueStr(List<String> strList) {
        List<String> result = new ArrayList<>();
        for (String str : strList) {
            boolean isUnique = true;
            for (String uniqueStr : result) {
                if (str.trim().equals(uniqueStr)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result.add(str.trim());
            }
        }
        return result;
    }

    private static String concatAllStrings(List<String> strList) {
        StringBuilder builder = new StringBuilder();
        for (String str : strList) {
            builder.append(str);
        }
        return builder.toString();
    }

    private static int[] findMinMax(List<Integer> numList) {
        int[] minMax = new int[2];
        minMax[0] = numList.get(0) < numList.get(1) ? numList.get(0) : numList.get(1);
        minMax[1] = numList.get(0) > numList.get(1) ? numList.get(0) : numList.get(1);
        for (int num : numList) {
            if (num < minMax[0]) {
                minMax[0] = num;
            }
            if (num > minMax[1]) {
                minMax[1] = num;
            }
        }
        return minMax;
    }

    private static int getMaxStringLength(List<String> strList) {
        int result = 0;
        for (String str : strList) {
            if (str.length() > result) {
                result = str.length();
            }
        }
        return result;
    }
}


// 1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
// 2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
// 3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
// 4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
// 5.у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
// 6.у вас есть список значений int и вы должны вернуть их максимум и минимум
// 7.у вас есть список String и вы должны вернуть максимальную длину
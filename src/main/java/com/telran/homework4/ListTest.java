package com.telran.homework4;

import java.util.ArrayList;
// 1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
// 2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
// 3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
// 4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
// 5.у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
// 6.у вас есть список значений int и вы должны вернуть их максимум и минимум
// 7.у вас есть список String и вы должны вернуть максимальную длину
public class ListTest {
    public static void main(String[] args) {


        java.util.List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(56);
        list.add(89);
        list.add(4);
        list.add(45);

        java.util.List<Integer> doubleNumbers = getDoubleNumbers(list);
        System.out.println(list);
        System.out.println(doubleNumbers);

        java.util.List<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("hello");
        list1.add("How are you");
        list1.add("abc");

        java.util.List<Integer> stringSize = getStringsSize(list1);
        System.out.println(stringSize);
        java.util.List<Integer> oddNumbers = getOddNumbers(list);
        System.out.println(oddNumbers);

        java.util.List<String> uniqueStrings = getUniqueStrings(list1);
        System.out.println(uniqueStrings);

        String concatenate = getConcatenate(list1);
        System.out.println(concatenate);

        Integer maxNumbers = getMaxNumbers(list);
        System.out.println(maxNumbers);

        Integer minNumbres = getMinNumbers(list);
        System.out.println(minNumbres);

        Integer maxLength = getMaxLength(list1);
        System.out.println(maxLength);

    }

    public static java.util.List<Integer> getDoubleNumbers(java.util.List<Integer> numbers) {
        java.util.List<Integer> result = new ArrayList<>();
        for (Integer numb : numbers) {
            result.add(numb * 2);
        }
        return result;
    }

    public static java.util.List<Integer> getStringsSize(java.util.List<String> strings) {
        java.util.List<Integer> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str.length());
        }
        return result;
    }

    public static java.util.List<Integer> getOddNumbers(java.util.List<Integer> numbers) {
        java.util.List<Integer> result = new ArrayList<>();
        for (Integer numb : numbers) {
            if (numb % 2 != 0) {
                result.add(numb);
            }
        }
        return result;
    }

    public static java.util.List<String> getUniqueStrings(java.util.List<String> strings) {
        java.util.List<String> result = new ArrayList<>();
        for (String str : strings) {
            int count = 0;
            for (String str1 : result) {
                if (str.equals(str1)) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                result.add(str);
            }
        }
        return result;
    }

    public static String getConcatenate(java.util.List<String> strings) {
        String result = "";
        for (String string : strings) {
            result = result + string;
        }
        return result;
    }

    public static Integer getMaxNumbers(java.util.List<Integer> numbers) {
        int result = numbers.get(0);
        for (Integer numb : numbers) {
            if (numb > result) {
                result = numb;
            }
        }
        return result;
    }

    public static Integer getMinNumbers(java.util.List<Integer> numbers) {
        int result = numbers.get(0);
        for (Integer numb : numbers) {
            if (numb < result) {
                result = numb;
            }
        }
        return result;
    }

    public static Integer getMaxLength(java.util.List<String> strings) {
        int result = 0;
        for (String str : strings) {
            if (str.length() > result) {
                result = str.length();
            }
        }
        return result;
    }
}


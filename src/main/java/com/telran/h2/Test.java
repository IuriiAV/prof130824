package com.telran.h2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 1 уровень сложности: 1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
     * 2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
     * 3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
     * 4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
     * 5.у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
     * 6.у вас есть список значений int и вы должны вернуть их максимум или минимум
     * 7.у вас есть список String и вы должны вернуть максимальную длину
     */
    public static void main(String[] args) {
//1 уровень сложности: 1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(12);
        list.add(23);
        list.add(15);
        list.add(152);

        System.out.println(list);
        System.out.println(multiplicationMethod(list));

        //2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .

        List<String> listTwo = new ArrayList<>();

        listTwo.add("One");
        listTwo.add("WooD");
        listTwo.add("three");

        System.out.println(listTwo);

        System.out.println(getStringLengths(listTwo));

//3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа

        List<Integer> listThree = List.of(1, 2, 3, 15, 25, 46, 78);

        System.out.println(listThree);
        System.out.println(returnOddMethod(listThree));

//4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
        List<String> listFour = List.of("1", "2", "15", "1", "2", "15", "78");

        System.out.println(listFour);
        System.out.println(getDuplicateValues(listFour));

//5.у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
        List<String> listFive = new ArrayList<>();

        listFive.add("One");
        listFive.add("WooD");
        listFive.add("three");

        System.out.println(listFive);
        System.out.println(getConcatonationString(listFive));

//6.у вас есть список значений int и вы должны вернуть их максимум или минимум

        List<Integer> listSix = List.of(1, 2, 3, 15, 25, 46, 78);

        System.out.println(listSix);
        System.out.println("Min = " + findMin(listSix));
        System.out.println("Min = " + findMax(listSix));

//7.у вас есть список String и вы должны вернуть максимальную длину
        List<String> listSeven = new ArrayList<>();

        listSeven.add("One");
        listSeven.add("WooD");
        listSeven.add("three");

        System.out.println(listSeven);
        System.out.println("Maximal string length = " + getMaxLengths(listSeven));

    }


    public static List<Integer> multiplicationMethod(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();

        for (Integer integer : list) {
            newList.add(integer * 2);
        }
        return newList;
    }

    public static List<Integer> getStringLengths(List<String> listTwo) {

        List<Integer> newList = new ArrayList<>();

        int sumLength = 0;
        for (String string : listTwo) {
            sumLength = sumLength + string.length();
            newList.add(string.length());
        }
        return newList;
    }

    public static List<Integer> returnOddMethod(List<Integer> listThree) {
        List<Integer> newList = new ArrayList<>();

        for (Integer integer : listThree) {
            if (integer % 2 != 0) {
                newList.add(integer);
            }
        }
        return newList;
    }

    private static List<String> getDuplicateValues(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String string : list) {
            if (!newList.contains(string)) {
                newList.add(string);
            }
        }
        return newList;
    }

    private static List<String> getConcatonationString(List<String> list) {
        List<String> newList = new ArrayList<>();
        String tempString = "";

        for (int i = 0; i < list.size(); i++) {
            tempString = tempString + list.get(i);
        }
        newList.add(tempString);
        return newList;
    }

    private static int findMin(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    private static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int getMaxLengths(List<String> list) {
        int maxLength = 0;
        for (String string : list) {
            if (string.length() > maxLength) {
                maxLength = string.length();
            }
        }
        return maxLength;
    }

}

package com.telran.h3.second;

import java.util.ArrayList;
import java.util.List;

public class LongOfStrings {
    /*1 2.у вас есть список значений String ,
 и вы должны вернуть список длины каждого из этих значений String .
 */

    public static void main(String[] args) {

        List<String> originalList = new ArrayList<>();

        originalList.add("Bob");
        originalList.add("John");
        originalList.add("Samuel");
        originalList.add("Karin");

        System.out.println("Length of list is: " + listWithLength(originalList));
    }

    public static List<Integer> listWithLength(List<String> originalList) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < originalList.size(); i++) {
            result.add(originalList.get(i).length());
        }
        return result;
    }
}


package com.telran.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PatterTwo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("Hello");
        list.add("Two");
        list.add("Hallo");

        System.out.println("Original list : " + list);

        int length = 3;

        List<String> filteredList = filtrByLength(list,length);
        System.out.println("Filterer list " + filteredList);


    }

    private static List<String> filtrByLength(List<String> list, int length) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            if (value.length() == length) {
                newList.add(value);
            }

        }
        return newList;
    }
}

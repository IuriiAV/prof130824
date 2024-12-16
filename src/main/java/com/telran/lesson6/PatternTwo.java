package com.telran.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternTwo {

    /**
     * Дан список элементов, нужно удалить те, которы не подходят
     * по определенному критерию
     * (фильтрация списка)
     */
    public static void main(String[] args) {
        //Task 1 : Дан список строк, вернуть список из строк определенной длины
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Hello");
        list.add("Two");
        list.add("Hallo");
        //Параметр фильтрации - длина строки

        System.out.println("Original list " + list);

        int length = 3;
        List<String> filteredList = filterByLength(list, length);
        System.out.println("Filtered list " + filteredList);
    }

    private static List<String> filterByLength(List<String> list, int length) {
        List<String> newList = new ArrayList<>();
        for(String value : list) {
            if (value.length() == length) {
                newList.add(value);
            }
        }
        return newList;
    }
}

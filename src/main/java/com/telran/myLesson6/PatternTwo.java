package com.telran.myLesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternTwo {

    /**
     * Дан список элементов, нужно удалить те, которые не подходят
     * по критерию
     * (фильтрация списка)
     */

    public static void main(String[] args) {
        //Task 1: дан список строк
        //вернуть список строк, которые попадают под определенную длину
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Hello");
        list.add("Two");
        list.add("Hallo");
        //параметр фильтрации - длина строки

        System.out.println("Original list: " + list);

        int length = 3;

        System.out.println("Filtered list: " + filterByLength(list, length));
    }

    private static List<String> filterByLength(List<String> list, int length) {
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if (s.length() == length) {
                newList.add(s);
            }
        }
        return newList;
    }


}

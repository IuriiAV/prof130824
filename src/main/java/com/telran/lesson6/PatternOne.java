package com.telran.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Иерархия коллекций:
 * Iterable -> Collection -> List -> ArrayList, LinkedList
 * Iterable -> Collection ->(List, Queue, Set)
 * <p>
 * Дан список значений
 * нужно применить какую то операцию к каждому элементу списка
 * и вернуть измененный список
 */
public class PatternOne {

    public static void main(String[] args) {
        //Task 1: Дан список строк, перевести его в нижний регистр
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("TWO");
        list.add("THRee");
        System.out.println("Original list : " + list);

        List<String> convertedList = convertList(list);
        System.out.println("Converted list : " + convertedList);

        System.out.println("Original list : " + list);
        inplaceConvertList(list);
        System.out.println("Original list : " + list);
    }

    private static List<String> convertList(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            newList.add(value.toLowerCase());
        }
        return newList;
    }

    private static void inplaceConvertList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toLowerCase());
        }
    }
}

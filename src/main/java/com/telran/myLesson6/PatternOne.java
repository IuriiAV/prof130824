package com.telran.myLesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternOne {

    public static void main(String[] args) {

        //Task1: to lowerCase
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("Original list: " + list);

        List<String> convertedList = convertList(list);
        System.out.println(convertedList);
        System.out.println("Original list: " + list);

        inplaceConvertList(list);

        System.out.println("Changed list: " + list);
    }

    //через создание нового списка
    private static List<String> convertList(List<String> list) {
        List<String> newlist = new ArrayList<>();
        for (String value : list) {
            newlist.add(value.toLowerCase());
        }
        return newlist;
    }

    //через изменение уже имеющегося списка
    private static void inplaceConvertList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toLowerCase());
        }
    }
}

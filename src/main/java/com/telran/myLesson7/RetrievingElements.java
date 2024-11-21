package com.telran.myLesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RetrievingElements {

    public static void main(String[] args) {
        List<String> strings2 = Arrays.asList("A", "B", "C", "D", "E"); // immutable, доступен только для чтения
        List<String> strings1 = List.of("A", "B", "C", "D", "E"); // immutable, доступен только для чтения

        List<String> strings = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        //1 for with index
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            System.out.print(s + " ");
        }
        System.out.println();

        //2 for-each
        for (String value : strings) {
            System.out.print(value + " ");
        }
        System.out.println();

        //3 Iterator
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //4 iterator + for()
        for (Iterator<String> i = strings.iterator(); i.hasNext(); ) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

        //5 for-each with lambda(->)
        strings.forEach(value -> System.out.print(value + " "));

        //5 add with full body
        strings.forEach(value -> {
            String newValue = value.toLowerCase();
            System.out.print(value + " ");
        });
    }
}

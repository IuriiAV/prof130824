package com.telran.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RetrievingElements {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("A","B","C","D","1"));
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        List<String> list = List.of("A","B","C","D","E");

        System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {
            String value = strings.get(i);
            System.out.print(value + " ");
        }
        System.out.println();

        for (String value : strings) {
            System.out.print(value + " ");
        }

        System.out.println();

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        for (Iterator<String> i = strings.iterator(); i.hasNext();){
            System.out.print(i.next() + " ");
        }

        System.out.println();

        strings.forEach(value -> System.out.print(value + " "));



    }
}

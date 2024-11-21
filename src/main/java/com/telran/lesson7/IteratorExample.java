package com.telran.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.add("F");

        System.out.println(strings);

        Iterator<String> iterator = strings.iterator();

        printElement(iterator);



    }
    private static  void printElement(Iterator<String> iterator){
        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.print(value + " ");
        }
    }
}

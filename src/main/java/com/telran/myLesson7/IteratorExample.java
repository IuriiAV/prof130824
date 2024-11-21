package com.telran.myLesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        ListIterator<String> iterator = strings.listIterator();
        System.out.println("List elements in forward direction: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println("List elements in backward direction: ");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous() + " " + iterator.previousIndex() + "; ");
        }
        System.out.println();

        strings.listIterator(2); //стартует со второго индекса

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous() + " " + iterator.previousIndex() + "; ");
        }
        System.out.println();

    }
}

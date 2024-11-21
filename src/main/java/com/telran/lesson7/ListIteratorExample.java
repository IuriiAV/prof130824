package com.telran.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorExample {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        ListIterator<String> iterator = strings.listIterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " " + iterator.nextIndex() + " ");
        }

        System.out.println();

        System.out.println("List element in backward direction :");

        while (iterator.hasPrevious()){
            System.out.print(iterator.previousIndex() + " " + iterator.previous() + " ");
        }

        System.out.println("\n");

        ListIterator<String> iterator2 = strings.listIterator(2);
        while (iterator2.hasNext()){
            System.out.print(iterator2.next() + " " + iterator.nextIndex() + " ");
        }


    }
}

package com.telran.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListEteratorExample {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        ListIterator<String> iterator = strings.listIterator();
        System.out.println("List element in forward direction : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("List element in backward direction :");

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " " + iterator.previousIndex() + "; ");

        }
        System.out.println();

        ListIterator<String> iterator1 = strings.listIterator(2);
        while (iterator1.hasPrevious()){
            System.out.print(iterator1.previous() + " ");

        }
        System.out.println();
    }
}
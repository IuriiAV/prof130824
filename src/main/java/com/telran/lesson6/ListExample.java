package com.telran.lesson6;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);

        System.out.println(list);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(10);
        list.add(100);
        list.add(7);
        list.add(200);
        System.out.println(list);
        list.add(100);
        list.add(7);
        System.out.println(list);

        int element = list.get(2);
        System.out.println("Element by index 2 = " + element);

        list.add(0,15);
        System.out.println(list);

        list.set(0,20);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list);
        list.remove(9);






    }
}

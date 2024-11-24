package com.telran.summarytwo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTaskExample {

    public static void main(String[] args) {
        // add(value)
        //add(index,value)
        //get(index)
        //contains(value)

        List<String> cities = new ArrayList<>();
        cities.add ("Berlin");
        cities.add ("Bonn");
        cities.add ("Paris");
        cities.add ("Amsterdam");
        cities.add ("Rome");

        System.out.println(cities);
        reverseList(cities);
        System.out.println(cities);
    }

    private static void reverseList(List<String> cities) {

        int start = 0;
        int end = cities.size() - 1;
        while (start <= end) {
            swap(cities, start++, end--);
//            start++;
//            end--;
        }

    }

    private static void swap(List<String> cities, int start, int end) {
        String temp = cities.get(start);
//        String two = cities.get(end);
        cities.set(start, cities.get(end));
        cities.set(end,temp);
    }
}

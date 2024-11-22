package com.telran.mySummery2211;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Bonn");
        cities.add("Paris");
        cities.add("Amsterdam");
        cities.add("Rome");

        System.out.println("Before reverse: " + cities);
        reverse(cities);
        System.out.println("After reverse: " + cities);



    }

    private static void reverse(List<String> strings) {
        int start = 0;
        int end = strings.size() - 1;
        while (start <= end) {
            swap(strings, start++, end--);
        }

//        for (int i = 0; i < strings.size() / 2; i++) {
//            swap(strings, start, end);
//            start++;
//            end--;
//        }

    }

    private static void swap(List<String> strings, int start, int end) {
        String tmp = strings.get(start);
        strings.set(start, strings.get(end));
        strings.set(end, tmp);
    }
}

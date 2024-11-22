package com.telran.summary2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTaskExample {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Berlin");
        cities.add("Bonn");
        cities.add("Paris");
        cities.add("London");
        cities.add("Rome");

        System.out.println(cities);

        reversList(cities);
        System.out.println(cities);

    }

    private static void reversList(List<String> cities) {
            int start = 0;
            int end = cities.size() - 1;

            while (start <= end){
                swep(cities, start++, end--);
            }
    }

    private static void swep(List<String> cities, int start, int end) {
        String temp = cities.get(start);


        cities.set(start, cities.get(end));
        cities.set(end,temp );
    }
}

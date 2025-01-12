package com.telran.summary2211;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTaskExample {

    public static void main(String[] args) {
        //add(value)
        //add(index,value)
        //get(index)
        //contains(value)
        List<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Bonn");
        cities.add("Paris");
        cities.add("Amsterdam");
        cities.add("Rome");

        //[Berlin, Bonn, Paris, Amsterdam, Rome]
        //[Rome, Amsterdam, Paris, Bonn, Berlin]
        System.out.println(cities);
    }
}

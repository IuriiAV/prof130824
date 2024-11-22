package com.telran.mySummery2211;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Bonn");
        cities.add("Paris");
        cities.add("Amsterdam");
        cities.add("Rome");
        //перемешивание коллекции
        Collections.shuffle(cities);
        System.out.println(cities);
        //сортировка коллекции
        Collections.sort(cities); //
        System.out.println(cities);

    }
}

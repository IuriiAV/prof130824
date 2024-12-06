package com.telran.h3.forth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterDuplicate {

    public static void main(String[] args) {

        List<String> originalList = new ArrayList<String>();

        originalList.add("Kuk");

        originalList.add("Kuka");

        originalList.add("Kuk");

        originalList.add("Kuka");

        originalList.add("Kuk");


        Set<String> set = new HashSet<>(originalList);
        //Set<String> set = new TreeSet<>(originalList);

        originalList.clear();

        originalList.addAll(set);

        System.out.println("The list without duplicate is: " + originalList);

        /* List<String> listWithoutDuplicate = originalList.stream()distinct().collect(Collectors.toLIst());*/
    }
}

package com.telran.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternOne {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("TWo");
        list.add("three");
        System.out.println("Original list : " + list);

        List<String> convertList = convertList(list);
        System.out.println("Convert list : " + convertList);

        System.out.println("Original list : " + list);
        inplaceConvertList(list);
        System.out.println("Convert list : " + list);


    }

    private static List<String> convertList(List<String> list){
        List<String> newList = new ArrayList<>();
        for (String value : list){
            String newValue = value.toLowerCase();
            newList.add(newValue);
        }
        return newList;
    }

    private static void inplaceConvertList (List<String> list){
        for (int i = 0; i < list.size(); i++) {
//            String oldValue = list.get(i);
//            String newValue = oldValue.toLowerCase();
            list.set(i,list.get(i).toLowerCase());
        }
    }

}

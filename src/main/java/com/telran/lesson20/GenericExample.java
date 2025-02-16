package com.telran.lesson20;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("One");
        list.add("Two");
       // list.add(1);
        String o = (String) list.get(0);
        String text = (String) list.get(0) +  list.get(1);
        System.out.println(text);

        for (int i = 0; i < list.size(); i++) {
            Object value = list.get(i);
            System.out.println((String) value);
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        //stringList.add(1);
        String value = stringList.get(0);

    }
}

package com.telran.lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        List list1 = new ArrayList();
        list1.add("one");
        list1.add("two");
        list1.add(1);
        System.out.println(list1);

        Object[] objects = new Object[2];
        objects[0] = "one";
        objects[1] = 1;
        System.out.println(Arrays.toString(objects));

    }
}

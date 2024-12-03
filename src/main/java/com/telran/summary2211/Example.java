package com.telran.summary2211;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        int[] ints = {1234343,3,5235,34,5345,345,4};
        String s = Arrays.toString(ints);
        Arrays.sort(ints);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 42, 5, 6, 3, 56, 4);
        System.out.println(integerList);

        //Перемешиваение коллекции
        Collections.shuffle(integerList);
        System.out.println(integerList);

        //Сортировка коллекции
        Collections.sort(integerList);


    }
}

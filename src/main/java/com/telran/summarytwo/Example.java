package com.telran.summarytwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        int[] ints = {1236466,225,55635};
        String s = Arrays.toString(ints);
        Arrays.sort(ints);

        List<Integer> integersList = Arrays.asList(1, 2, 42, 3, 6, 56);
        System.out.println(integersList);
        //Перемешивание коллекции
        Collections.shuffle(integersList);
        System.out.println(integersList);
        //Сортировка коллекции
        Collections.sort(integersList);




    }
}


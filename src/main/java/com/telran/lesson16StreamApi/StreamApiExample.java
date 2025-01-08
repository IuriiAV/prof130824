package com.telran.lesson16StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample {

    public static void main(String[] args) {
        //Stream API - поток данных - functional style
        //поток - поток выполнения программы(многопоточность)
        //поток - поток ввода вывода(input output stream)

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for (Integer value : list){
            if(value%2 ==0){
                System.out.println(value + " ");
            }
        }
        System.out.println();

        //-> 9 8 7 6 5 4 3 2 1 ->
        list.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.println(integer + " "));
    }
}

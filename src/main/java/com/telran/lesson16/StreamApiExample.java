package com.telran.lesson16;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("10","20","15","10","20","15" );
        long count = list.stream().count();
        System.out.println("Count = " + count);






    }
}

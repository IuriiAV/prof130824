package com.telran.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PatterThree {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);

        System.out.println("Sum elements = " + getListSum(list));

    }

    private static int getListSum(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
//            int value = list.get(i);
//            sum = sum +value;
        }
        return sum;
    }
}

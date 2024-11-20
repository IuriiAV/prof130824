package com.telran.myLesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternThree {

    /**
     * Дан список
     * пробежаться по списку, вернуть одно значение
     */

    public static void main(String[] args) {
        //Task 1: дан список чисел, вернуть их сумму
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(15);
        list.add(20);
        list.add(61);
        list.add(23);
        list.add(64);

        System.out.println("Sum is " + getListSum(list));
    }

    private static int getListSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}

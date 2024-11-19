package com.telran.lesson6;


import java.util.ArrayList;
import java.util.List;

public class PatternThree {
    /**
     * Дан список, пробежаться по нему и вернуть одно значение
     */
    public static void main(String[] args) {
        //Task1 : Дан список чисел, вернуть сумму элементов
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(6);

        System.out.println("Sum elements = " + getListSum(list));
    }

    private static int getListSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
//            int value = list.get(i);
//            sum = sum + value;
            sum += list.get(i);
        }
        return sum;
    }
}

package com.telran.h3.first;

import java.util.ArrayList;
import java.util.List;

public class Multiplay2 {
    /*1 уровень сложности: 1.у вас есть список значений int и
 вы должны вернуть список, каждое значение которого умножается на 2
 */

    public static List<Integer> multiplayTwo(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            result.add(number * 2);
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        System.out.println("Original list : " + numbers);

        List<Integer> doubleNumber = multiplayTwo(numbers);

        System.out.println("Doubled list is: " + doubleNumber);

    }
}



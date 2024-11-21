package com.telran.homework4;

import java.util.Arrays;
import java.util.List;

/**
 * 1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
 * 2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
 * 3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
 * 4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
 * 5.у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
 * 6.у вас есть список значений int и вы должны вернуть их максимум или минимум
 * 7.у вас есть список String и вы должны вернуть максимальную длину
 */
public class ArrayListTask {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 7, 33, 102, 0, 49);
        System.out.println(numbers);

        multiply(numbers);
        System.out.println(numbers);
    }

    private static void multiply(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * 2);
        }
    }


}

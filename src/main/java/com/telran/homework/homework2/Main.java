package com.telran.homework.homework2;

import java.util.ArrayList;
import java.util.List;

//1 уровень сложности: 1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
//2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
//3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
//4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
//5.у вас есть список значений String , и вы должны вернуть одну строку , которая представляет собой конкатенацию всех значений.
//6.у вас есть список значений int и вы должны вернуть их максимум или минимум
//7.у вас есть список String и вы должны вернуть максимальную длину
//Задача со *
//Заменить в приложении библиотекарь все массивы на списки)))
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(45);
        numbers.add(67);
        numbers.add(2);
        numbers.add(53);

        System.out.println("оригинальный список : " + numbers);
        System.out.println("Список после перебора в методе \"multiplyTwo\" : " + multiplyTwo(numbers));
        System.out.println();

        List<String>fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Tomato");
        fruits.add("Kiwi");
        fruits.add("Kiwi");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Banana");

        System.out.println("Список со фруктами : " + fruits);
        System.out.println("Список с количеством букв во фруктах : " + getQuantity(fruits));
        System.out.println();

        System.out.println("Список только с нечётными значениями : " + getOdd(numbers));
        System.out.println();

        System.out.println("Список со фруктами : " + fruits);
        System.out.println("Список со фруктами без повторов : " + getOriginal(fruits));
        System.out.println();

        System.out.println("Строка слепленная из списка : " + getSum(getOriginal(fruits)));
        System.out.println();

        System.out.println("оригинальный список : " + numbers);
        System.out.println("Минимальное значение списка : " + getMin(numbers));
        System.out.println("Максимальное значение списка : " + getMax(numbers));
        System.out.println();

        System.out.println("Список со фруктами : " + fruits);
        System.out.println("Количество символов в максимальной строке списка = " + getMaxWort(fruits));

    }
    private static List<Integer> multiplyTwo(List<Integer> x){
        List<Integer>list = new ArrayList<>();
        for (int value : x){
            list.add(value * 2);
        }
        return list ;
    }
    private static List<Integer> getQuantity(List<String> x) {
        List<Integer>num = new ArrayList<>();
        for (String value : x){
            num.add(value.length());
        }
        return num;
    }
    private static List<Integer>getOdd(List<Integer> x){
        List<Integer>numOdd = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) % 2 != 0){
                numOdd.add(x.get(i));
            }
        }
        return numOdd;
    }
    private static List<String>getOriginal(List<String>x){
        List<String>y = new ArrayList<>();
        for (String value : x ){
           if (!y.contains(value)){
               y.add(value);
           }
        }
        return y;
    }
    private static String getSum(List<String> x){
        String longWort = "";
        for (String value : x){
            longWort = longWort + value;
        }
        return longWort;
    }
    private static int getMin(List<Integer> x){
        int min = Integer.MAX_VALUE;
        for (int num : x){
            if (num < min){
                min = num;
            }
        }
        return min;
    }
    private static int getMax(List<Integer> x){
        int max = Integer.MIN_VALUE;
        for (int num : x){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
    private static int getMaxWort(List<String> x){
        int maxLengthWort = 0;
        for (String value : x){
           if (value.length() > maxLengthWort){
               maxLengthWort = value.length();
            }
        }
        return maxLengthWort;
    }
}

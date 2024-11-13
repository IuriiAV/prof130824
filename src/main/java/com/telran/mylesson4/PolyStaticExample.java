package com.telran.mylesson4;

import java.util.Arrays;

public class PolyStaticExample {

    /*
    Инкапсуляция - сокрытие данных и предоставление доступа к ним через api
    Наследование - создание нового класса на основе уже существующего, с полностью

    Полиморфизм - множество форм при единой реализации,
    Работа с различными обьектами через их общие методы, без знания и понимания о внутренней структуре обьекта

    Частные случаи полиморфизма:
    Статический полиморфизм (полиморфизм времени компиляции): перегрузка методов (overload)
    Динамический полиморфизм (полиморфизм времени выполнения)
     */

    public static void main(String[] args) {
        Calc calc = new Calc();

        //На этапе компиляции будет точно определено, какой конкретный метод
        //будет вызванБ определяется на основе количества и типа параметров,
        //передаваемых в метод
        System.out.println("Sum = " + calc.sum(5,7));
        System.out.println("Sum = " + calc.sum(5,7,8));
        System.out.println("Sum = " + calc.sum(5,7.3,88.0));

        int[] ints = {1,2,3};
        String[] strings = {"One", "Two"};

        //toString перегруженный метод класса Arrays
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(strings));

    }

}

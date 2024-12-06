package com.telran.summery0612;

/**
 * При создании строки через String value = "Hello", сначала в пуле уникальных строк
 * проверяется есть ли строка с таким содержанием
 * если строка с таким содержанием в пуле уникальных строк есть,
 * то в переменную присваевается ссылка на уже существующую строку
 * Когда создаем через new - String value = new String( "Hello"),
 * в переменную присваевается ссылка на новый объект в памяти
 *
 * intern() помещает строку в пул уникальных строк
 * Проверяется есть ли поле уникальных строк с таким содержимым,
 * если есть, то данный метод возвращает ссылку на строку из пула,
 * если нет, то поместит ее в пул и вернет ссылку на эту строку
 */

public class TestApp {

    public static void main(String[] args) {
        String one = "Hello!";
        String two = "Hello!";

        String three = new String("Hello!");

        boolean resultOne = one == two;
        boolean resultTwo = one == three;

        System.out.println(resultOne);
        System.out.println(resultTwo);
    }
}

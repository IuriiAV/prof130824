package com.telran.summarryfour;

/**
 * При создании строки через String value = "Hello" , сначала в пуле уникальніх строк проверяется есть ли строка с таким содержпнием
 *  если строка с таким содержанием есть, то переменную value присваивается ссылка на уже существующую строку
 *  Когда создаем через String value = new String("Hello");
 *  В переменную value присваивается ссілка на новій обїект в памяти
 *
 * intern()  помещает строку в пул уникальных строк
 * Проверяется есть ли в пуле уникальных строк строка с таким содержимым, если есть , то данный метод возвращает ссылку на строку из пула
 * Если нет такой строки в пуле, то он ее поместит в пул и вернет ссылку на эту строку
 */


public class TestApp {
    public static void main(String[] args) {

        String one = "Hello!";
        String two = "Hello!";

        String three = new String(("Hello!"));

        boolean resultOne = one == two;
        boolean resultTwo = one == three;

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(one.hashCode() + " " + two.hashCode() + " " + three.hashCode());


        // pool string
        three = three.intern();
        System.out.println("one == three" + (one == three));

        String[] logs = new String[100];
        String text = null;
        for(String log : logs) {
            text += log;                       // так делать нельзя


        }
    }
}

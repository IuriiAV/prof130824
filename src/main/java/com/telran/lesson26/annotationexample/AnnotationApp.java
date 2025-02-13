package com.telran.lesson26.annotationexample;

import java.util.Date;

public class AnnotationApp {

    public static void main(String[] args) {
        // @Override - показывающаяя переопределение
               // @Deprecated - не рекомендуется использовать,указывает что данный функционал устарел,
        // пример// Integer a = Integer.valueOf(5);

       // @SuppressWarnings() - отключение предупреждений

        // @FunctionalInterface - указывает на функциональный интерфейс

    }
    @SuppressWarnings("deprecation")
    public void printHello() {
        Date date = new Date(2025, 10, 21);
        System.out.println("Hello");
    }
}

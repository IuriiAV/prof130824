package com.telran.lesson26.annotationexample;

import java.util.Date;

public class AnnotationApp {

    public static void main(String[] args) {
        //@Override - показывающая переопределение
        // @Deprecated - указывает что данных функционал устарел
        Integer a =Integer.valueOf(5);
        // @SuppressWarnings() - отключение предупреждений
        // @FunctionalInterface - указывает на функциональный интерфейс
    }

    @SuppressWarnings("deprecation")
    public void printHello() {
        Date date = new Date(2025, 10, 01);
        System.out.println("Hello");
    }
}

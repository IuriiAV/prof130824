package com.telran.lesson15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @FunctionalInterface - данная аннотация говорит о том, что данный интерфейс является
 * функциональным, и основной его особенностью является то, что он имеет только один
 * абстрактный метод, который можно переопределить
 * Examples : Comparable, Comparator, Runnable etc
 * <p>
 * Если интерфейс попадает под правило функционального, то не обязательно, но желательно,
 * что бы он был помечен аннотацией @FunctionalInterface
 * <p>
 * Если у нас есть интерфейс, который мы можем реализовать в виде анонимного класса
 * Например Comparator, и если мы будем уверенны в том, что в этом интерфейсе, будет
 * всего лишь один абстрактный метод, те он будет соответствовать правилам функционального
 * интерфейса:
 * <p>
 * Comparator<Student> byAgeComparator = new Comparator<Student>() {
 * @Override public int compare(Student o1, Student o2) {
 * return o1.getAge() - o2.getAge();
 * }
 * };
 * <p>
 * Если интерфейс можно записать в виде lambda выражения, то формат будет таким
 * (параметры метода интерфейса) -> {код, который мы бы написали в теле метода}
 * <p>
 * 1) Вместо отдельного класса для реализации интерфейса, сделали реализацию через анонимный класс
 * 2) Когда убедились, что у нас есть в интерфейсе тот самый, единственный метод для переопределения,
 * мы убрали из записи имя метода, название интерфейса с new и return, базовые слова, которые и так очевидны
 * И получили запись вида:
 * (o1, o2) -> o1.getName().compareTo(o2.getName());
 *
 * Синтаксис лямбда выражения: левая часть с параметрами -> правая часть с кодом из метода
 * void print () : () -> System.out.println("Hello");
 * int checkNumber () : () -> 5 > 3 ; (return 5 > 3);
 * void print(String text) : (text) -> System.out.println(text);
 * int getAge(Student student) : (student) -> student.getAge();
 * void print(String text, String name) : (text, name) ->  System.out.println(text + " " + name);
 * void print(String text, String name) : (text, name) -> {
 *                                                       System.out.println(text + " " + name);
 *                                                       StringBuilder sb = new StringBuilder();
 *                                                       sb.append(text).append(name);
 *                                                       System.out.println(sb);
 *                                                       };
 *
 * int getAge(Student student) : (student) -> {
 *                                             if("Alex".equals(student.getName())) {
 *                                                 return student.getAge();
 *                                             }
 *                                             return 0;
 *                                             };
 *@FunctionalInterface - ругается при попытке создать второй абстрактный метод
 * В любом ФИ может быть только один абстрактный метод, но может быть сколько угодно
 * дефолтных, статических или методов из класса Object
 */
public class FunctionalExample {

    public static void main(String[] args) {
        List<Student2> students = Arrays.asList(
                new Student2("Alex", 15),
                new Student2("Oleg", 20),
                new Student2("Max", 18));

        Comparator<Student2> byAgeComparator = new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        //Если интерфейс можно записать в виде lambda выражения, то формат будет таким
        //(параметры метода интерфейса) -> {код, который мы бы написали в теле метода}
        Comparator<Student2> byNameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

        Collections.sort(students, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };
        printer.print();

        Printer printerOne = () ->  System.out.println("Hello");
        printerOne.print();
    }
}
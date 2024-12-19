package com.telran.lesson15_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @FunctionalInterface - данная аннотация говорит о том, что данный интерфейс является функциональным,
 * и основной его особенностью является то, что он имеет только один абстрактный метод,
 * который можно переопределить
 * examples% Comparable, Comparator, Runnable etc
 * <p>
 * Если интерфейс попадает под правило функционального, то необязательно, но желательно, что б он был помечен
 * аннотацией @FunctionalInterface
 * <p>
 * Если у нас есть интерфейс, который мы можем реализовать в виде анонимного класса, например Comparator,
 * и если мы будем уверенны в том, что в этом интерфейсе будет всего лишь один абстрактный метод,
 * т.е. он будет соответствовать правилам функционального интерфейса:
 * <p>
 * Comparator<Student> byAgeComparator = new Comparator<Student>() {
 * @Override public int compare(Student o1, Student o2) {
 * return o1.getAge()-o2.getAge();
 * }
 * };
 *
 * void print () : () -> System.out.print("Hi")
 * int checkNumber() : () -> 5 > 3; (return 5 > 3)
 * void print(String text) : (text) -> System.out.print(text)
 * int getAge(Student student) : (student) -> student.getAge;
 * void print(String text, String name) : (text, student) -> System.out.print(text + " " + name);
 * void print(String text, String name) : (text, student) -> {
 *                                                              System.out.print(text + " " + name);
 *                                                              System.out.print(text + " " + name);
 *                                                              }
 *
 */
public class FunctionalExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", 15),
                new Student("Oleg", 20),
                new Student("Max", 18)
        );

        Comparator<Student> byAgeComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };

//        Comparator<Student> byNameComparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };

        // Если интерфейс можно записать в виду lambda выражения, то формат будет таким:
        //(параметры метода интерфейса) -> {код, который мы бы написали в теле метода}

        Comparator<Student> byNameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

        Printer printStudent = () -> System.out.println("Hi");
        printStudent.print();
    }
}

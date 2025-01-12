package com.telran.lesson15.basefi;

import com.telran.lesson15.Student;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/**
 * Consumer :
 * method accept
 * Принимает один параметр и ничего не возвращает
 */
public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> printer = (text) -> System.out.println(text);
        printer.accept("Hello");

        Consumer<String> splitter = (text) -> {
            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i));
            }
        };

        splitter.accept("Java");

        Consumer<Integer> loopPrinter = (count) -> {
            for (int i = 0;i < count; i++) {
                System.out.println("Hi!");
            }
        };

        loopPrinter.accept(5);

        Consumer<Student> studentInfoPrinter = (student) -> System.out.println("Name :" + student.getName()+ " Age:"+ student.getAge());
        studentInfoPrinter.accept(new Student("Alex", 50));

        IntConsumer intConsumer = a -> System.out.println(a);
        DoubleConsumer doubleConsumer = a -> System.out.println(a);
        LongConsumer longConsumer = a -> System.out.println(a);

        intConsumer.accept(10);
    }
}

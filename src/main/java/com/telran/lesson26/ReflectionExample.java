package com.telran.lesson26;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
        Book book = new Book();

        Class<? extends Book> clazz = book.getClass();
        //оперируем только классом
        System.out.println("Class is " + clazz.getName());

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }

        try {
            //Получили метод из класса Book
            Method declaredMethod = clazz.getDeclaredMethod("printBookInfo");
            //Устанавливаем разрешение на доступ к єтому методу
            declaredMethod.setAccessible(true);
            //Візвали исполнение єтого метода у объекта в переменной book
            declaredMethod.invoke(book);
        } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
        } catch (IllegalAccessException e) {
           e.printStackTrace();
        }
    }
}

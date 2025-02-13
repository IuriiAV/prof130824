package com.telran.mylesson26ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {

        Book book = new Book();

        Class<? extends Book> aClass = book.getClass();

        System.out.println("Class is " + aClass.getName());

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        try {
            Method declaredMethod = aClass.getDeclaredMethod("printBookInfo");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(book);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}

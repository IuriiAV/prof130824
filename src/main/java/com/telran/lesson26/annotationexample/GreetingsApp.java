package com.telran.lesson26.annotationexample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GreetingsApp {

    public static void main(String[] args) throws Exception {
        Greetings greetings = new Greetings();
        Class<? extends Greetings> clazz = greetings.getClass();
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println(Arrays.asList(annotations));


        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            Annotation[] annotations1 = field.getAnnotations();
            System.out.println("Field " + field.getName() + " " + Arrays.toString(annotations1));
        }

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            Annotation[] annotations1 = method.getAnnotations();
            System.out.println("Method " + method.getName() + " " + Arrays.toString(annotations1));
            if (method.isAnnotationPresent(HelloAnnotation.class)) {
                method.setAccessible(true);
                method.invoke(greetings,"Alex");
            }
        }
    }
}

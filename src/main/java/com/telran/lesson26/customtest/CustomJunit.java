package com.telran.lesson26.customtest;

import java.lang.reflect.Method;

public class CustomJunit {

    public static void main(String[] args) throws Exception {
        CustomTestCalculator testCalculator = new CustomTestCalculator();

        Class<? extends CustomTestCalculator> calc = testCalculator.getClass();
        for (Method method : calc.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomTest.class)) {
                try {
                    method.invoke(testCalculator);
                } catch (Exception e) {
                    System.err.println("Method " + method.getName() + " is failed");
                }
            }
            if (method.isAnnotationPresent(CustomParamTest.class)) {
                CustomParamTest annotation = method.getAnnotation(CustomParamTest.class);
                int[] params = annotation.ints();
                for (int param : params) {
                    method.invoke(testCalculator, param);
                }
                String[] strings = annotation.strings();
                for (String str : strings) {
                    method.invoke(testCalculator, str);
                }
            }
        }
    }
}
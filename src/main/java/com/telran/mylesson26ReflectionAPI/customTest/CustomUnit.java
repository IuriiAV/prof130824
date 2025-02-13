package com.telran.mylesson26ReflectionAPI.customTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomUnit {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        CustomTestCalc testCalc = new CustomTestCalc();

        Class<? extends CustomTestCalc> calc = testCalc.getClass();
        for (Method method : calc.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomTest.class)) {
                try {
                    method.invoke(testCalc);
                } catch (IllegalArgumentException e) {
                    System.err.println("Method " + method.getName() + " failed");
                }
            }
        }

    }
}

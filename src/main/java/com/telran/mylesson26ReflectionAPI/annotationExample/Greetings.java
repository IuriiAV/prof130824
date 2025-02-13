package com.telran.mylesson26ReflectionAPI.annotationExample;

public class Greetings {

    @HelloAnnotation
    private String text;

    @HelloAnnotation
    public void sayHello(String name) {
        System.out.println("Hello");
    }

}

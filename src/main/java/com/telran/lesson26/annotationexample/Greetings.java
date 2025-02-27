package com.telran.lesson26.annotationexample;

//@HelloAnnotation
public class Greetings {

    @HelloAnnotation
    private String text;

    private String name;

    @HelloAnnotation
    public void sayHello( String name) {
        System.out.println("Hello " + name);
    }

    public void sayHi(String name) {
        System.out.println("Hi " + name);
    }
}

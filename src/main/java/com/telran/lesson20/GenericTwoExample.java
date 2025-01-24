package com.telran.lesson20;

public class GenericTwoExample {
    public static void main(String[] args) {
   printInfo(2);
   printInfo("Two");
   printInfo(true);
    }

    public static <T> void printInfo(T element){
        int i = element.hashCode();
        String name = element.getClass().getName();
        System.out.println("hash " + i + " for obj " + name);
    }
}

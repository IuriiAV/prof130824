package com.telran.lesson15_StreamAPI;

public class CalaApp {

    public static void main(String[] args) {
        Calc calc = (a,b) -> a+b;
        int sum = calc.sum(2,3);
        System.out.println(sum);
    }
}

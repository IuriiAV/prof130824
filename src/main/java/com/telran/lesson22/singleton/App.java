package com.telran.lesson22.singleton;

public class App {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
    }
}

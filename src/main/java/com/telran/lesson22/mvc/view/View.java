package com.telran.lesson22.mvc.view;

public interface View {

    void listAll();

    default void printGreetings() {
        System.out.println("Hello coffee user");
    }
}

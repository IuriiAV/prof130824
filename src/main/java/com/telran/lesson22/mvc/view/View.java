package com.telran.lesson22.mvc.view;

public interface View {

    void listAll();

    default void printGreatings(){
        System.out.println("Hello");
    }
}

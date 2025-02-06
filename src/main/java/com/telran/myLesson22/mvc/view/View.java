package com.telran.myLesson22.mvc.view;

public interface View {

    void listAll();

    default void printGreeting(){
        System.out.println("Hello user");
    }
}

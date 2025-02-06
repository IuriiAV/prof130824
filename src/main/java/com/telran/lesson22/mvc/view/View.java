package com.telran.lesson22.mvc.view;

import com.telran.lesson22.mvc.model.AbstractProduct;

import java.util.List;

public interface View {

    void listAll();

    default void printGreetings() {
        System.out.println("Hello coffee user");
    }
}

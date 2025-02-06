package com.telran.myLesson22.mvc;

import com.telran.myLesson22.mvc.controller.CoffeeController;

public class App {

    public static void main(String[] args) {
        CoffeeController controller = new CoffeeController();
        controller.runApp();
    }
}

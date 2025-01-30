package com.telran.lesson22.mvc;

import com.telran.lesson22.mvc.controller.CoffeeController;
import com.telran.lesson22.mvc.view.CoffeeView;

public class App {

    public static void main(String[] args) {

        CoffeeView coffeeView = new CoffeeView();
        CoffeeController coffeeController = new CoffeeController();

    }
}

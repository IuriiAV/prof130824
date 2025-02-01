package com.telran.lesson22.mvc;

import com.telran.lesson22.mvc.base.CakeStorage;
import com.telran.lesson22.mvc.base.CoffeeStorage;
import com.telran.lesson22.mvc.controller.CoffeeController;
import com.telran.lesson22.mvc.view.CakeView;
import com.telran.lesson22.mvc.view.CoffeeView;

public class App {

    public static void main(String[] args) {
        CoffeeStorage coffeeStorage = new CoffeeStorage();
        CoffeeView coffeeView = new CoffeeView(coffeeStorage);
        CoffeeController coffeeController = new CoffeeController();
        coffeeController.addView(coffeeView);
        CakeView cakeView = new CakeView(new CakeStorage());
        coffeeController.addView(cakeView);

        coffeeController.runApp();
    }
}

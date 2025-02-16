package com.telran.lesson22.mvc.controller;

import com.telran.lesson22.mvc.view.View;

import java.util.ArrayList;
import java.util.List;

public class CoffeeController {

    private List<View> views = new ArrayList<>();

    public void addView(View view) {
        this.views.add(view);
    }

    public void runApp() {
        // View.printGreetings();
        for (View view : views) {
            view.listAll();
        }
    }
}

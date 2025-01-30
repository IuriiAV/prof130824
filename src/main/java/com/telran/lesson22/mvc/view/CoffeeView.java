package com.telran.lesson22.mvc.view;

import com.telran.lesson22.mvc.base.CoffeeStorage;
import com.telran.lesson22.mvc.base.Storage;
import com.telran.lesson22.mvc.model.AbstractProduct;

import java.util.List;

public class CoffeeView implements View {

    private Storage coffeeStorage;

    public CoffeeView(Storage coffeeStorage) {
        this.coffeeStorage = coffeeStorage;
    }

    @Override
    public void listAll() {
        List<AbstractProduct> all = coffeeStorage.getAll();
        System.out.println(all);
    }
}

package com.telran.lesson22.mvc.base;

import com.telran.lesson22.mvc.model.AbstractProduct;
import com.telran.lesson22.mvc.model.Cake;
import com.telran.lesson22.mvc.model.Coffee;

import java.util.Arrays;
import java.util.List;

public class CoffeeStorage implements Storage {

    @Override
    public List<AbstractProduct> getAll() {
        return Arrays.asList(
                new Coffee("Black"),
                new Coffee("Latte")
        );
    }
}
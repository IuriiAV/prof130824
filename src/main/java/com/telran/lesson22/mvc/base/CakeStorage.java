package com.telran.lesson22.mvc.base;

import com.telran.lesson22.mvc.model.AbstractProduct;
import com.telran.lesson22.mvc.model.Cake;

import java.util.Arrays;
import java.util.List;

public class CakeStorage implements Storage{

    @Override
    public List<AbstractProduct> getAll() {
        return Arrays.asList(
                new Cake("Barni"),
                new Cake("Donut")
        );
    }
}

package com.telran.lesson22.mvc.view;

import com.telran.lesson22.mvc.base.Storage;
import com.telran.lesson22.mvc.model.AbstractProduct;

import java.util.List;

public class CakeView implements View{

    private Storage storage;

    public CakeView(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void listAll() {
        List<AbstractProduct> all = storage.getAll();
        System.out.println(all);
    }
}

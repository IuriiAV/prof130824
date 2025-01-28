package com.telran.lesson20.storageapp;

import java.util.HashMap;
import java.util.Map;

public class StorageAbs {

    private Map<String, AbstractProduct> storage = new HashMap<>();

    public void add(AbstractProduct product) {
        storage.put(product.getTitle(), product);
    }

    public AbstractProduct getByTitle(String title) {
        return storage.get(title);
    }

    public void printStorage() {
        storage.values().forEach(System.out::println);
    }
}
package com.telran.lesson20.storageapp;

import java.util.HashMap;
import java.util.Map;

public class Storage<P extends AbstractProduct> {

    private Map<String, P> storage = new HashMap<>();

    public void add(P product) {
        storage.put(product.getTitle(), product);
    }

    public P getByTitle(String title) {
        return storage.get(title);
    }

    public void printStorage() {
        storage.values().forEach(System.out::println);
    }
}
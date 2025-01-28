package com.telran.myLesson20.storageapp;

import java.util.HashMap;
import java.util.Map;

public class Storage<P extends AbstractProduct> {

    private Map<String, P> storage = new HashMap<>();

    public void add(P p) {
        storage.put(p.getTitle(), p);
    }

    public P getByTitle(String title) {
        return storage.get(title);
    }

    public void printStorage() {
        storage.values().forEach(p -> System.out.println(p));
    }
}

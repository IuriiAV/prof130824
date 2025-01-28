package com.telran.myLesson20.storageapp;

import java.util.Arrays;
import java.util.List;

public class StorageApp {

    public static void main(String[] args) {
//        DonutStorage donutStorage = new DonutStorage();
//        donutStorage.add(new Donut("Vanilla"));
//        donutStorage.add(new Donut("Banana"));
//        donutStorage.add(new Donut("Classic"));
//
//        donutStorage.printStorage();

        Storage<Donut> donutStorage = new Storage<>();
        donutStorage.add(new Donut("Vanilla"));
        donutStorage.add(new Donut("Banana"));
        donutStorage.add(new Donut("Classic"));

        donutStorage.printStorage();

        Storage<Burger> burgerStorage = new Storage<>();
        burgerStorage.add(new Burger("Classic"));
        burgerStorage.add(new Burger("Cheddar"));
        burgerStorage.add(new Burger("New York"));

        List<Storage> storages = Arrays.asList(
                donutStorage,
                burgerStorage
        );
        storages.forEach(storage -> storage.printStorage());
    }
}

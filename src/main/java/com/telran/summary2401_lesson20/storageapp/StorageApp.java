package com.telran.summary2401_lesson20.storageapp;

import java.util.Arrays;
import java.util.List;

public class StorageApp {

    public static void main(String[] args) {

       // DonutStorage donutStorage = new DonutStorage();
        Storage<Donut> donutStorage = new Storage<>();
                donutStorage.add(new Donut("Vanilla"));
        donutStorage.add(new Donut ("Banana"));
        donutStorage.add(new Donut ("Classic"));

        donutStorage.printStorage();

        Storage<Burger> burgerStorage = new Storage<>();
        burgerStorage.add(new Burger("Mexican"));
        burgerStorage.printStorage();
        List<Storage> storageList = Arrays.asList(
                donutStorage,
                burgerStorage
        );
        storageList.forEach(Storage::printStorage);
    }
}

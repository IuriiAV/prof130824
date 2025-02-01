package com.telran.lesson20.storageapp;

import java.util.Arrays;
import java.util.List;

public class StorageApp {

    public static void main(String[] args) {
        //DonutStorage donutStorage = new DonutStorage();

        Storage<Donut> donutStorage = new Storage<>();
        donutStorage.add(new Donut("Vanilla"));
        donutStorage.add(new Donut("Banana"));
        donutStorage.add(new Donut("Classic"));

        Donut banana = donutStorage.getByTitle("Banana");

        Storage<Burger> burgerStorage = new Storage<>();
        burgerStorage.add(new Burger("Mexican"));
        Burger mexican = burgerStorage.getByTitle("Mexican");

        List<Storage> storageList = Arrays.asList(
                donutStorage,
                burgerStorage);
        storageList.forEach(storage -> storage.printStorage());

        StorageAbs storageAbs = new StorageAbs();
        storageAbs.add(new Donut("Classic"));
        storageAbs.add(new Burger("Mexican"));

        AbstractProduct classic = storageAbs.getByTitle("Mexican");
        Donut classic1 = (Donut) classic;
        classic1.printColor();

    }
}

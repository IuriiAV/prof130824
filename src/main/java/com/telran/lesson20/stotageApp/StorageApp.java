package com.telran.lesson20.stotageApp;

import java.util.Arrays;
import java.util.List;

public class StorageApp {

    public static void main(String[] args) {
        Storage<Donut> donutStorage = new Storage<>();

        //DonutStorage donutStorage = new DonutStorage();
        donutStorage.add(new Donut("Vanilla"));
        donutStorage.add(new Donut("Banana"));
        donutStorage.add(new Donut("Classic"));


        donutStorage.printStorage();

        Storage<Burger> burgerStorage = new Storage<>();
        burgerStorage.add(new Burger("Mexican"));
        burgerStorage.printStorage();

        List<Storage> storageList = Arrays.asList(
                donutStorage,
                burgerStorage
        );
        storageList.forEach(System.out::println);


    }
}

package com.telran.lesson20.stotageApp;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
public class DonutStorage {

    private Map<String, Donut> storage = new HashMap<>();

    public void add(Donut donut){
        storage.put(donut.getTitle(), donut);
    }

    public Donut getByTitle(String title){
        return storage.get(title);
    }

    public void printStorage(){
        storage.values().forEach(donut -> System.out.println(donut));
    }
}

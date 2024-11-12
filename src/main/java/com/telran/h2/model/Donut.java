package com.telran.h2.model;

public abstract class Donut {

    private String name;

    public Donut(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                name ;
    }
}


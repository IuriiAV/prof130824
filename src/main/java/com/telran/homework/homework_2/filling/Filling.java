package com.telran.homework.homework_2.filling;

public abstract class Filling {

    private String name;

    public Filling(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

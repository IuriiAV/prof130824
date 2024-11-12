package com.telran.homework.homework02.model.dough;

public class Dough {

    private String type;

    public Dough(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dough type is " + type;
    }
}

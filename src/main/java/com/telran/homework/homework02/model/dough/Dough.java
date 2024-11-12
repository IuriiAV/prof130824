package com.telran.homework.homework02.model.dough;

public abstract class Dough {

    private final String type;

    public Dough(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}

package com.telran.summarryfour.bookk;

public enum Genre1 {

    FICTION(16),
    NON_FICTION(10),
    NOVEL(21);

    private final int category;

    Genre1(int category) {
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return super.toString() + " " + category;
    }
}



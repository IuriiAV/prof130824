package com.telran.summery0612.library;

public enum Genre {

    FICTION(16),
    NON_FICTION(10),
    NOVEL(21);

    private final int category;

    Genre(int category) {
        this.category = category;
    }

    public int getCategory() {
        return category;
    }


}

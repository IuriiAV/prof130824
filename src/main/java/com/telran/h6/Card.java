package com.telran.h6;

public enum Card {

//    SILVER, GOLD, PLATINUM;

    PLATINUM(1),

    GOLD(2),

    SILVER(3);

    private final int rang;

    Card(int rang) {
        this.rang = rang;
    }

    public int getRang() {
        return rang;
    }
}

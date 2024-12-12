package com.telran.h6;

public enum Card {

    PLATINUM(1),

    GOLD(2),

    SILVER(3);




    private final Integer rang;

    Card(int rang) {
        this.rang = rang;
    }

    public int getRang() {
        return rang;
    }
}

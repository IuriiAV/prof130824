package com.telran.summary;

public enum Genre {
    FICTION(""),
    NON_FICTION(""),
    MYSTERY(""),
    THRILLER(""),
    FANTASY(""),
    ROMANCE(""),
    SCIENCE_FICTIONS("");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


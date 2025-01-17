package com.telran.summery1701.translator;

public enum Language {
    ENGLISH("english.txt"),
    GERMAN("german.txt"),
    SPANISH("spanish.txt");

    private String fileName;

    Language(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}

package com.telran.homework.homework13.translator;

public class BackToMenuException extends RuntimeException {
    public BackToMenuException() {
        super("User requested return to menu");
    }
}
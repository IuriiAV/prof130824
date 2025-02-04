package com.telran.lesson23.exceptions;

public class IncorrectBookTitleException extends RuntimeException {

    public IncorrectBookTitleException(String message) {
        super(message);
    }
}

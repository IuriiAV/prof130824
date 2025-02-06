package com.telran.myLesson23Exceptions.exceptions;

public class IncorrectBookTitleException extends RuntimeException{

    public IncorrectBookTitleException(String message) {
        super(message);
    }
}

package com.telran.myLesson23Exceptions;

public class ErrorExample {

    public static void main(String[] args) {

    }

    //stackOverflowError
    public static void method(){
        method();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

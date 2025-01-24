package com.telran.lesson20.exampleTwo;

public class GenericController <S , T> {

    private S service;

    public GenericController(S service) {
        this.service = service;
    }

    public void print(T person){

    }


}

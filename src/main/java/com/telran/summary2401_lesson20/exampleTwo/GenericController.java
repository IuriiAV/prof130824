package com.telran.summary2401_lesson20.exampleTwo;

public class GenericController <S extends AbstractService, T> {


    private S service;

    public GenericController (S service) {
        this.service = service;
    }

    public void  print (T person) {
        service.printInfo(person);
    }



}

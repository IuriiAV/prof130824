package com.telran.myLesson20.exampleTwo;

public class GenericController<S extends AbstractService, T> {

    private S service;

    public GenericController(S service) {
        this.service = service;
    }

    public void printInfo(T t) {
        service.printInfo(t);
    }
}

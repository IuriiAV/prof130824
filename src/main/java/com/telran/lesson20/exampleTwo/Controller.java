package com.telran.lesson20.exampleTwo;

public class Controller {

    private CatService service;

    public Controller(CatService service) {
        this.service = service;
    }

    public void print(Cat cat) {
        service.printInfo(cat);
    }
}

package com.telran.lesson20.exampleTwo;

public class PersonController {

    private PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    public void print(Person person){
        service.printInfo(person);
    }
}

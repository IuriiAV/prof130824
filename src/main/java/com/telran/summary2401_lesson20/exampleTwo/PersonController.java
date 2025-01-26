package com.telran.summary2401_lesson20.exampleTwo;

public class PersonController  {

    private PersonService service;

    public PersonController(PersonService personService) { this.service = service;

    }

    public void  print (Person person) { service.printInfo(person);
    }
}

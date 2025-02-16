package com.telran.lesson20.exampleTwo;

public class App {

    public static void main(String[] args) {
//        CatService catService = new CatService();
//        Controller controller = new Controller(catService);
//
//        controller.print(new Cat());
//
//        PersonController personController = new PersonController(new PersonService());
//        personController.print(new Person());
//
        GenericController<PersonService,Person> personController = new GenericController<>(new PersonService());
        GenericController<CatService, Cat> catController = new GenericController<>(new CatService());

    }
}

package com.telran.myLesson20.exampleTwo;

public class App {

    public static void main(String[] args) {
        CatService catService = new CatService();
        Controller controller = new Controller(catService);

        controller.print(new Cat());

        GenericController<PersonService,Person> personController = new GenericController<>(new PersonService());
        GenericController<CatService,Person> catController = new GenericController<>(new CatService());

    }
}

package com.telran.lesson4;

public class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    //Динамический полиморфизм
    //Переопределение - это написание своей собственной реализации метода в классе наследнике,
    //который !уже существует! в классе родителе
    @Override
    public void sayGreetings() {
        System.out.println("Hello from Child!");
    }

    public void sayBye() {
        System.out.println("Bye!");
    }
}

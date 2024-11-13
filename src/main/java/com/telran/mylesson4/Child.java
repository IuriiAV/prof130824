package com.telran.mylesson4;

public class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    // Динамический полиморфизм
    // переопределение - написание своей собственной реализации метода в классе наследнике
    // которй уже существует в классе родителе

    @Override
    public void sayGreetings() {
        System.out.println("Hi from Child");
    }
}

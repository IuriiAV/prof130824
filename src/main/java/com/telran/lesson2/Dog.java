package com.telran.lesson2;

//final в сигнатуре класса запрещает его наследовать!
public class Dog {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Voice!");
    }

    //final - запрещает переопределение метода в наследниках!!!
    public final void run() {
        System.out.println("Dog run!");
    }
}

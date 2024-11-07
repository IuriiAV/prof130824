package com.telran.lesson3.interfaceexample;

//Это полностью абстрактный класс, все его метода public и abstract
//Классы наследуем, интерфейсы имлементируем
//Интерфейсы не имеют состояния!!! (переменных класса)
//Все переменные в интерфейсе - это константы и они общие для всех
public interface CanEat {

    String NAME = "Name";

    void eat();

    default void print() {
        System.out.println("Info");
    }
}

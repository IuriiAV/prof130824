package com.telran.lesson3;

//На основе абстрактного класса нельзя создать объект
//В абстрактном классе есть конструкторы,
//Конструкторы нужны для инициализации полей абстрактного класса
//final не применим
//Абстрактный класс - это шаблон для создания других классов
/*
                    Animal
                  /            \
        EarthAnimal            WaterAnimal
        /                             \
      Lion,Rabbit, Horse               Whale

 */
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void eat() {
        System.out.println("" + name + " eat");
    }

    //Абстрактный метод должен быть реализован во всех наследниках
    //Абстрактный метод - метод без тела в абстрактном классе
    public abstract void drink();
    public void makeNoise() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

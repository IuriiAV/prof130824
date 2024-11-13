package com.telran.lesson4;

public class PolyDynamicExample {

    public static void main(String[] args) {
        Parent alex = new Parent("Alex");
        Parent egor = new Child("Egor");
        Parent baby = new Baby("Baby");

        Parent[] people = {alex, egor, baby};

        //Parent -> Child -> Baby

        //Полиморфизм - "множество форм при единой реализации", Работа с различными объектами
        //через их общие методы, без знания и понимания о внутренней структуре объекта

        for (Parent parent : people) {
            //sayGreetings - вызывается у типа данных Parent
            //Во время выполнения программы, будет определено, какую реализацию метода
            //sayGreetings нужно вызвать, из класса родителя или из класса наследника
            //это будет определено на основе типа объекта из этой переменной
            //Это динамический полиморфизм!
            parent.sayGreetings();
            parent.sayHello();

            // Поиск подходящих методов идет снизу от наследника , вверх к родителю
            // Baby (method from this class) -> method from Child -> Parent : sayGreetings from Child
            // Child (method from this class) -> method from Parent : sayGreetings from Child
            // Parent (method from this class) : sayGreetings

            //sayHello
            //Baby (method from this class) -> Child -> Parent : sayHello from Parent
        }
    }
}

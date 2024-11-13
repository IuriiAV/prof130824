package com.telran.mylesson4;

public class PolyDynamicExample {
    public static void main(String[] args) {
        Parent parent = new Parent("Alex");
        Child child = new Child("Max");

        Parent[] people = {parent, child};

        for (Parent person : people) {
            // sayGreetings() вызывается у типа данных Parent
            //во время выполнения программы (Runtime) будет определено,
            // какую реализацию метода нужно вызвать: из класса родителя или из класса наследника
            //это будет определено на основе типа обьекта из этой переменной
            //это динамический полиморфизм
            person.sayGreetings();
        }
    }
}


package com.telran.lesson2;

//extends - оператор наследования
//Dog - суперкласс, класс родитель, родительский класс, базовый класс
//SmallDog - подкласс, дочерний класс, наследник
//Наследуем родственные классы
//В Java запрещено множественное наследование
//При наследовании мы получаем доступ ко всем не приватным переменным
//и методам класса родителя
//Родительские классы ничего не знают о характеристиках и методах
//классов наследников, но наследники знают о родителях почти все!

public class SmallDog extends Dog {
    //Класс будет состоять из методов и свойств родительского класса
    // + своих собственных методов
    public void jump() {
        System.out.println("Small dog jump");
    }

    @Override // аннотация - форма метаинформации для компилятора и JVM
    //что данный метод существует в родительском классе и мы
    //пытаемся сделать свою собственную реализацию в классе наследнике
    public void voice() {
        System.out.println("Small dog with name " + name +" voice!");
    }
}

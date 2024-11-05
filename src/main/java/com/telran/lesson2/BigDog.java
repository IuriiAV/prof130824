package com.telran.lesson2;

public class BigDog extends Dog {
    //Класс будет состоять из методов и свойств родительского класса
    // + своих собственных методов + свои собственные свойства

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bigVoice() {
        System.out.println("Big dog voice!");
    }
}

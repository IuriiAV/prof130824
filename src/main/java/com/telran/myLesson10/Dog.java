package com.telran.myLesson10;

public class Dog {

    private String name;

    private int age;

    private Color color;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //1. проверяем, что не сравниваем обьект с самим собой
        if (this == obj) {
            return true;
        }

        //2. если передали null в obj, то возвращаем false
        if (obj == null) {
            return false;
        }

        //3. Определяем, что типы одинаковые
        if (!(obj instanceof Dog dog)) {
            return false;
        }

        //4. сравниваем по полям
        //Dog dog = (Dog) obj;

        if (this.name == null) {
            return false;
        }

        return this.name.equals(dog.name) && this.age == dog.age && this.color == dog.color;
    }

}

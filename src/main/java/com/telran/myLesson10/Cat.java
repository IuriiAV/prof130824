package com.telran.myLesson10;

import java.util.Objects;

public class Cat {

    private String name;

    private int age;

    private Color color;

    //Контракт между equals and hashcode!!!
    //1. Если у объектов разный hashcode, то это точно разные обьекты
    //2. У одинаковых обьектов, всегда одинаковые hashcode
    //3. У разных объектов может быть одинаковый hashcode --> коллизия (collision)

    //Сначала сравнивается hashcode, если он разный у двух объектов,
    // это это 100% разные объекты

    //если hashcode одинаковый у двух обьектов, тогда это может быть
    //либо 2 одинаковых объекта, либо коллизия
    //в этом случае нужно дополнительно использовать метод equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age && Objects.equals(name, cat.name) && color == cat.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}

package com.telran.lesson10;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private Color color;


    // Контракт между equals and hashcode
    // Если у обїектов разній hashcode это точно разные объекты!!!!!!!!!
    // У одинаковых объектов , всегда одинаковые hashcode
    // У разных объектов может быть одинаковый hashcode (коллизия) (здесь однозначно нужно проверять объект через equals)

        // Порядок сравнения:
    // Сначала сравнивается hashcode , если он разный у двух объектов,
    // то это 100% разные объекты и дальше сравнивать не нужно

    // Если hashcode одинаковый у двух объектов (одинаковые объекты или коллизия)
    // в этом случае нужно дополнительно использовать метод Equals



    @Override
    public boolean equals(Object o) {
        // 1
        if (this == o) return true;
        //2  || //3
        if (o == null || getClass() != o.getClass()) return false;
        //4
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && color == cat.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}

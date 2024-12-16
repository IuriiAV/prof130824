package com.telran.lesson10;

public class EqualsExample {

    public static void main(String[] args) {
        int one = 10;
        int two = 10;
        boolean isEquals = one == two;

        Integer three = Integer.valueOf(10);
        boolean isEqualsRef = one == three;

        Dog dogOne = new Dog(); // #FFEEHH
        Dog dogTwo = new Dog(); // #FFEEA0
        dogOne.setName("Tuzik");
        dogTwo.setName("Tuzik");

        //Для ссылочных типов данных, сравнение через == сравнивает
        //ссылки на объекты, и объекты будут равны, только если
        //в обоих переменных ссылка на один и тот же объект
        boolean b = dogOne == dogTwo;
        if (dogOne == dogTwo) {
            System.out.println("They are equals");
        }

        //Для правильного сравнения объектов используется equals
        if(dogOne.equals(dogTwo)) {
            System.out.println("They are equals (use equals)");
        }
    }
}

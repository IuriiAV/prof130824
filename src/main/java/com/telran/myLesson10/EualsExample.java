package com.telran.myLesson10;

public class EualsExample {

    public static void main(String[] args) {
        int one = 10;
        int two = 10;
        boolean isEqual = one == two;

        Integer three = Integer.valueOf(10);
        boolean isEqualRef = one == three;

        Dog dogOne = new Dog();
        Dog dogTwo = new Dog();

        dogOne.setName("Tuz");
        dogTwo.setName("Tuz");

        //для ссылочных типов данных, сравнение через == сравнивает
        //ссылки на обьекты, и обьекты будут равны только если
        //в обоих переменных ссылка на один и тот же обьект
        boolean b = dogOne == dogTwo;

        if(dogOne == dogTwo){
            System.out.println("they are equal"); // условие не выполнится
        }

        //для правильного сравнения обьектов используется метод equals
        if(dogOne.equals(dogTwo)){
            System.out.println("they are equal"); //
        }

    }
}

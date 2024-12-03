package com.telran.lesson10;

public class EqalsExample {

    public static void main(String[] args) {

        int one = 10;
        int two = 10;

        boolean isEquals = one == two;
        //System.out.println(isEquals);

        Integer three = Integer.valueOf(10);
        boolean isEqualsRef = one == three;

        Dog dogOne = new Dog();
        Dog dogTwo = new Dog();

        dogOne.setName("tuz");
        dogTwo.setName("tuz");
        boolean b = dogOne == dogTwo;
        //System.out.println(b);

        if (dogOne.equals(dogTwo)){
            System.out.println("They are equals ");
        }







    }
}

package com.telran.homework.homework1;

public class PhoneApp {
    public static void main(String[] args) {



    Phone phoneOne = new Phone("123-456-789", "Nokia", 150);
    Phone phoneTwo = new Phone("987-654-321", "Samsung", 160);
    Phone phoneThree = new Phone("147-852-963", "Iphone", 170);

        System.out.println(phoneOne.getNumber() + " " + phoneOne.getModel() + " " + phoneOne.getWeight());
        System.out.println(phoneTwo.getNumber() + " " + phoneTwo.getModel() + " " + phoneTwo.getWeight());
        System.out.println(phoneThree.getNumber() + " " + phoneThree.getModel() + " " + phoneThree.getWeight());

        phoneOne.receiveCall("Mark");
        phoneTwo.receiveCall("Diana");
        phoneThree.receiveCall("John");

        phoneOne.getnumber();
        phoneTwo.getnumber();
        phoneThree.getnumber();

}


}

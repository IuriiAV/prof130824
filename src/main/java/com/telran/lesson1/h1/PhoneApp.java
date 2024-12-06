package com.telran.lesson1.h1;

public class PhoneApp {

    public static void main(String[] args) {


        Phone phone1 = new Phone(1-1-1, 1111, 100);

        Phone phone2 = new Phone(2-2-2, 2222, 300);

        Phone phone3 = new Phone(3-3-3, 3333, 300);

        phone1.getInfo();
        phone2.getInfo();
        phone3.getInfo();

        phone1.receiveCall("Kon' v pal'to");
        phone1.getNumber();
        phone2.receiveCall("Kiborg");
        phone2.getNumber();
        phone3.receiveCall("Wasja");
        phone3.getNumber();

    }
}

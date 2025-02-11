package com.telran.h11;

/**
 *         //TODO HW
 * //Написать регулярку для проверки номер телефона и тесты на нее(парам)
 * //1234567 , 123-4567, 123 5678
 *
 * //Регулярка для проверки пароля: At least 1 UpperCase, 1 spec(@#$), length min 8
 */
public class App {

    public static void main(String[] args) {

        String textNumberOne = "1234567";
        CheckPhoneNumbers check = new CheckPhoneNumbers();
        boolean b = check.checkPhoneNumbers(textNumberOne);
        System.out.println("Phone number is " + b);

        String textNumberTwo = "123-4567";
        boolean b2 = check.checkPhoneNumbers(textNumberTwo);
        System.out.println("Phone number is " + b2);

    }
}

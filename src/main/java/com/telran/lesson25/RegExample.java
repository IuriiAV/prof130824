package com.telran.lesson25;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegExample {

    public static void main(String[] args) {
        String regex = "\\d\\d";
        String original = "33";
        System.out.println("Original matches regex " + Pattern.matches(regex,original));

        regex = "[a-z][a-z][a-z]\\.?\\s+\\d\\d";
        original = "ase.  45";
        System.out.println("Original matches regex " + Pattern.matches(regex,original));

        String text = "I1learned2about3Java4And5Sql";
        String[] s = text.split( "\\d");
        System.out.println(Arrays.toString(s));

        String delimiter = "\\d";
        Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        String [] split = pattern.split(text);
        System.out.println(Arrays.toString(split));

        //HW
        // Написать регулярку для проверки номера телефона и тесты на нее(параметриризированные)
        //1234567, 123-4567, 123 5678

        //Регулярка для проверки пароля: At least 1 UpperCase, 1 spec(@#$), length min 8
    }
}

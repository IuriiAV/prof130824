package com.telran.mylesson25Date;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

    public static void main(String[] args) {
        String text = "Hello aa@gg.com test test@fee.ru Hi Hola";
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Email start from " + start + " to " + (end - 1));
            System.out.println(text.substring(start, end));
        }

        String reg = "\\d";
        String original = "q1a11q";

        System.out.println("Original matches regex " +
                Pattern.matches(reg, original));

        String textTest = "lalal4fff5ggg2";
        String[] newText = textTest.split("\\d");
        System.out.println(Arrays.toString(newText));

        //TODO HW
        //Написать регулярку для проверки номер телефона и тесты на нее(парам)
        //1234567 , 123-4567, 123 5678

        //Регулярка для проверки пароля: At least 1 UpperCase, 1 spec(@#$), length min 8
    }
}

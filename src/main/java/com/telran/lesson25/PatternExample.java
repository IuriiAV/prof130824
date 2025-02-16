package com.telran.lesson25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        String regex = ".*www.*";
        String actual = "www.telran.de";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actual);
        System.out.println("actual string contains regex " + matcher.matches());

        System.out.println(Pattern.matches(regex,actual));
    }
}

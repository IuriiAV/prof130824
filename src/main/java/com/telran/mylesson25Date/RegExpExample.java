package com.telran.mylesson25Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExample {

    public static void main(String[] args) {
        String regex = ".*www.*";
        String actual = "www.test.com";

        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(actual);

        System.out.println("actual string contains regex: " + matcher.matches());
        System.out.println(Pattern.matches(regex, actual));

    }
}

package com.telran.lesson24Testing;

public class StringFormater {

    public String reverseStringInLowerCase(String text) {
        if (text == null) {
            return "";
        }
        String ignoreCase = text.toLowerCase();
        return new StringBuilder(ignoreCase).reverse().toString();
    }
}

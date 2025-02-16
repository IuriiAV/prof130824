package com.telran.lesson24;

public class StringFormatter {

    public String reverseStringInLowerCase(String text) {
        if (text == null) {
            return "";
        }
        String ignoreCase = text.toLowerCase();
        return new StringBuilder(ignoreCase).reverse().toString();
    }
}

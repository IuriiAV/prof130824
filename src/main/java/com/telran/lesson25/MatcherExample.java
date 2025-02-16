package com.telran.lesson25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

    public static void main(String[] args) {

        String text = "Hello 45@cob.com dfgdfgdfg rrter@fee.de Ghtrdfdh";
        String regex = "(\\S+[0-9]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9_-]+)";
        //[a-zA-Z0-9._-]+@
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Email starts from " + start + " to " + (end - 1));
            System.out.println(text.substring(start, end));
        }
    }
}

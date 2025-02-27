package com.telran.lesson25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

    public static void main(String[] args) {

        String text = "Hello efrt@cob.com  dfghjrjkfmk rrter@fee.de Ghtrfhfkx";
        String regex = "([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9._-]+)";
        //[a-zA-Z0-9._-]+@
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Email start from " + start + " to " + (end - 1));
            System.out.println(text.substring(start, end));
        }

    }
}

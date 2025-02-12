package com.telran.h11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumbers {

    public boolean checkPhoneNumbersOne(String text){
        String regex = "\\d\\d\\d\\d\\d\\d\\d";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public boolean checkPhoneNumbersTwo(String text){
        String regex = "\\d\\d\\d-\\d\\d\\d\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public boolean checkPhoneNumbersThree(String text){
        String regex = "\\d{3}\\s+\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}

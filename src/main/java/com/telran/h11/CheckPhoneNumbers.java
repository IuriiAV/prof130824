package com.telran.h11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumbers {

    public boolean checkPhoneNumbers(String text){
        String regex = "\\d\\d\\d\\d\\d\\d\\d";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}

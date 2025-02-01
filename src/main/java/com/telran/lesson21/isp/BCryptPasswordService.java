package com.telran.lesson21.isp;

public class BCryptPasswordService implements PasswordEncodeService {

    @Override
    public String encodePassword(String original) {
        return "BCrypt from original";
    }
}

package com.telran.lesson21.isp;

public class CustomPasswordService implements PasswordDecodeService, PasswordEncodeService {

    @Override
    public String encodePassword(String original) {
        return new StringBuilder(original).reverse().toString();
    }

    @Override
    public String decodePassword(String encoded) {
        return new StringBuilder(encoded).reverse().toString();
    }
}
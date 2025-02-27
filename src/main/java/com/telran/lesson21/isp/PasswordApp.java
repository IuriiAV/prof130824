package com.telran.lesson21.isp;

public class PasswordApp {

    public static void main(String[] args) {
        CustomPasswordService customPasswordService = new CustomPasswordService();
        checkPasswordServiceDecode(customPasswordService);
        checkPasswordServiceEncode(customPasswordService);

        BCryptPasswordService bCryptPasswordService = new BCryptPasswordService();
        checkPasswordServiceEncode(bCryptPasswordService);
    }

    private static void checkPasswordServiceEncode(PasswordEncodeService passwordService) {
        System.out.println(passwordService.encodePassword("Hello"));
    }

    private static void checkPasswordServiceDecode(PasswordDecodeService passwordService) {
        System.out.println(passwordService.decodePassword("olleH"));
    }
}

package com.telran.myLesson21.isp;

public class PasswordApp {

    public static void main(String[] args) {
        CustomPasswordService passwordService = new CustomPasswordService();
        checkPasswordEncode(passwordService);
        checkPasswordDecodeService(passwordService);

        BCryptService bCryptService = new BCryptService();
        checkPasswordEncode(bCryptService);


    }

    private static void checkPasswordEncode(PasswordEncodeService passwordEncodeService) {
        System.out.println(passwordEncodeService.encodePassword("Hello"));
    }

    private static void checkPasswordDecodeService(PasswordDecodeService passwordDecodeService) {
        System.out.println(passwordDecodeService.decodePassword("olleH"));
    }
}

package com.telran.summary5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MenuApp {

    public static void main(String[] args) throws IOException {

        LanguageStorage languageStorage = new LanguageStorage();
        ProductStorage productStorage = new ProductStorage();
        InfoStorage infoStorage = new InfoStorage();

        AdminController adminController = new AdminController(languageStorage, productStorage, infoStorage);
        UserController userController = new UserController(languageStorage, productStorage, infoStorage);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isNeedToStop = false;
        while (!isNeedToStop) {
            System.out.println("Choose : 1 - Admin, 2 - User, 0 - Exit");
            String userData = reader.readLine();
            int data = Integer.parseInt(userData);
            switch (data) {
                case 1 -> adminController.start();
                case 2 -> userController.start();
                case 0 -> {
                    System.out.println("Bye!");
                    isNeedToStop = true;
                }


            }


        }


    }
}

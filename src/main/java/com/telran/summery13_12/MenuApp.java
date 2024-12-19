package com.telran.summery13_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1 - English
 * 2 - German
 * 3 - French
 * <p>
 * 1. Soup
 * 2. Pasta
 * 3. Burger
 * 4. Wine
 * <p>
 * получить меню для своего языка и его описание
 * <p>
 * soup description: eng, ger, fr
 * pasta description: eng, ger, fr
 * burger description: eng, ger, fr
 * wine description: eng, ger, fr
 */
public class MenuApp {

    public static void main(String[] args) throws IOException {

        LanguageStorage languageStorage = new LanguageStorage();
        ProductStorage productStorage = new ProductStorage();
        InfoStorage infoStorage = new InfoStorage();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        AdminController adminController = new AdminController(languageStorage, productStorage, infoStorage, reader);
        UserController userController = new UserController(languageStorage, productStorage, infoStorage, reader);

        boolean isNeedToStop = false;
        while (!isNeedToStop) {
            System.out.println("Choose 1 - Admin, 2 - User, 0 - to exit");
            String s = reader.readLine();
            int role = Integer.parseInt(s);
            switch (role) {
                case 1 -> adminController.start();
                case 2 -> userController.start();
                case 0 -> {
                    System.out.println("Bye!");
                    isNeedToStop = true;
                }
            }
        }
        reader.close();
    }
}

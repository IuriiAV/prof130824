package com.telran.summaryfive;

import com.telran.summaryfive.model.Product;
import lombok.SneakyThrows;

import java.io.BufferedReader;


public class UserController {

    private final LanguageStorage languageStorage;

    private final ProductStorage productStorage;

    private final InfoStorage infoStorage;

    private final BufferedReader reader;

    public UserController(LanguageStorage languageStorage, ProductStorage productStorage,
                          InfoStorage infoStorage, BufferedReader reader) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
        this.reader = reader;
    }

    @SneakyThrows
    public void start() {

        System.out.println("Please choose your language : ");
        languageStorage.printLanguages();
        int userLanguage = Integer.parseInt(reader.readLine());

        String language = languageStorage.getLanguage(userLanguage);

        System.out.println("Ok.Your language : " + language);

        System.out.println("Choose your product : ");
        productStorage.printProducts();
        int userProduct = Integer.parseInt(reader.readLine());

        Product product = productStorage.getProduct(userProduct);

        System.out.println("Ok.Your product is " + product.getTitle());

        String description = infoStorage.getDescription(product, language);
        System.out.println("Description : " + description);
    }
}
package com.telran.summery13_12;

import com.telran.summery13_12.model.Product;
import lombok.SneakyThrows;

import java.io.BufferedReader;

public class UserController {

    private LanguageStorage languageStorage;

    private ProductStorage productStorage;

    private InfoStorage infoStorage;

    private BufferedReader reader;


    public UserController(LanguageStorage languageStorage, ProductStorage productStorage,
                          InfoStorage infoStorage, BufferedReader reader) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
        this.reader = reader;
    }

    @SneakyThrows
    public void start() {
        System.out.println("Please, choose your language: ");
        languageStorage.printLanguages();
        int userLanguage = Integer.parseInt(reader.readLine());

        String language = languageStorage.getLanguage(userLanguage); //key lang
        System.out.println("Ok. Your language is : " + language);

        System.out.println("Choose a product: ");
        productStorage.printProducts();
        int userProduct = Integer.parseInt(reader.readLine());

        Product product = productStorage.getProduct(userProduct); //key product
        System.out.println("OK. Your product is " + product.getTitle());

        String description = infoStorage.getdesc(product, language);
        System.out.println("Description : " + description);
    }
}

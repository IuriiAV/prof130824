package com.telran.summery13_12;

import com.telran.summery13_12.model.Product;
import lombok.SneakyThrows;

import java.io.BufferedReader;

public class AdminController {

    private LanguageStorage languageStorage;

    private ProductStorage productStorage;

    private InfoStorage infoStorage;

    private BufferedReader reader;


    public AdminController(LanguageStorage languageStorage, ProductStorage productStorage,
                           InfoStorage infoStorage, BufferedReader reader) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
        this.reader = reader;
    }

    @SneakyThrows
    public void start() {
        System.out.println("Choose language: ");
        languageStorage.printLanguages();

        String data = reader.readLine();

        String lang = languageStorage.getLanguage(Integer.valueOf(data));

        System.out.println("Input product title ");
        String title = reader.readLine();

        Product product = productStorage.getOrCreate(title);

        System.out.println("Product " + product.getTitle() + "_" + product.getId());

        System.out.println("Input description : ");
        String desc = reader.readLine();

        infoStorage.addDesc(product, lang, desc);
        // reader.close();
    }
}

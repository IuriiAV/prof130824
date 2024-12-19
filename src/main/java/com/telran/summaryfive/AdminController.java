package com.telran.summaryfive;

import com.telran.summaryfive.model.Product;
import lombok.SneakyThrows;

import java.io.BufferedReader;


public class AdminController {

    private final LanguageStorage languageStorage;

    private final ProductStorage productStorage;

    private final InfoStorage infoStorage;

    private final BufferedReader reader;

    public AdminController(LanguageStorage languageStorage, ProductStorage productStorage,
                           InfoStorage infoStorage, BufferedReader reader) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
        this.reader = reader;
    }

    @SneakyThrows
    public void start() {
        System.out.println("Choose language : ");
        languageStorage.printLanguages();
        String data = reader.readLine();

        String language = languageStorage.getLanguage(Integer.parseInt(data));

        System.out.println("Input product title :");
        String title = reader.readLine();
        Product product = productStorage.getOrCreate(title);
        System.out.println("" + product.getTitle() + "_" + product.getId());

        System.out.println("Input your description : ");
        String descr = reader.readLine();

        infoStorage.addDescription(product, language, descr);
    }
}
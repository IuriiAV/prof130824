package com.telran.summary5;

import com.telran.summary5.model.Product;

import java.util.HashMap;
import java.util.Map;

public class InfoStorage {

    private Map<Product, Map<String, String>> infoMap = new HashMap<>();

    public InfoStorage() {
        init();
    }

    public void init() {
        Map<String, String> soupMap = new HashMap<>();
        soupMap.put("English","Soup English info");
        soupMap.put("German","Soup German info");
        soupMap.put("French","Soup French info");

        Map<String, String> pastaMap = new HashMap<>();
        pastaMap.put("English","pasta English info");
        pastaMap.put("German","pasta German info");
        pastaMap.put("French","pasta French info");

        Map<String, String> burgerMap = new HashMap<>();
        burgerMap.put("English","burger English info");
        burgerMap.put("German","burger German info");
        burgerMap.put("French","burger French info");

        Map<String, String> wineMap = new HashMap<>();
        wineMap.put("English","wine English info");
        wineMap.put("German","wine German info");
        wineMap.put("French","wine French info");

        infoMap.put(new Product(1,"Soup"),soupMap);
        infoMap.put(new Product(2,"Pasta"),pastaMap);
        infoMap.put(new Product(3,"Burger"),burgerMap);
        infoMap.put(new Product(4,"Wine"),wineMap);
    }

    public String getDiscription(Product product, String lang){
        Map<String, String> descriptionMap = infoMap.get(product);
        return descriptionMap.get(lang);
    }

    public void addDescription(Product product, String lang, String desc ){

        Map<String, String> template = new HashMap<>();
        Map<String, String> descMap = infoMap.getOrDefault(product, template);


    }
}

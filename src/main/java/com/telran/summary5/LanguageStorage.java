package com.telran.summary5;

import java.util.HashMap;
import java.util.Map;

public class LanguageStorage {

    private Map<Integer,String> languageMap = new HashMap<>();

    public LanguageStorage() {
        init();
    }

    private void init() {
        languageMap.put(1, "English");
        languageMap.put(2, "German");
        languageMap.put(3, "French");

    }

    public void printLanguages(){
        for (Map.Entry<Integer,String> pair : languageMap.entrySet()) {
            System.out.println(" " + pair.getKey() + " - " + pair.getValue());
        }

    }

    public String getLanguage(int key){
        return languageMap.getOrDefault(key, languageMap.get(1));
    }
}

package com.telran.summary1701.translator;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private CustomFileWriter customFileWriter = new CustomFileWriter();


    public void update(String original, String translate, Language language) {
        Map<String, String> map = new HashMap<>();
        map.put(original, translate);
        customFileWriter.writeDictionary(language, map);
    }
}

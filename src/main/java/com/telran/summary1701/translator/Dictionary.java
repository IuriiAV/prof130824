package com.telran.summary1701.translator;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final CustomFileWriter customFileWriter ;

    private final CustomFileReader customFileReader;

    public Dictionary(CustomFileWriter customFileWriter, CustomFileReader customFileReader) {
        this.customFileWriter = customFileWriter;
        this.customFileReader = customFileReader;
    }

    public void update(String original, String translate, Language language) {
        Map<String, String> map = new HashMap<>();
        map.put(original, translate);
        customFileWriter.writeDictionary(language, map);
    }

    public String getTranslate(Language language,String original) {
        Map<String, String> map = customFileReader.readDictionary(language);
        return map.getOrDefault(original,original);

    }
}

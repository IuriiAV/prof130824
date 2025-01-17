package com.telran.summary7.translator;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final CustomFileWriter customFileWriter ;

    private final CustomFileReader customFileReader ;

    public Dictionary(CustomFileWriter customFileWriter, CustomFileReader customFileReader) {
        this.customFileWriter = customFileWriter;
        this.customFileReader = customFileReader;
    }

    public void update(String origin, String translate, Language language) {
        Map<String, String> map = new HashMap<>();
        map.put(origin, translate);
        customFileWriter.writeDictionary(language, map);
        System.out.println("Words (" + origin + ":" + translate + ") added to dictionary");
    }

    public String getTranslate(String origin, Language language) {
        Map<String, String> map = customFileReader.readDictionary(language);
        return map.getOrDefault(origin,origin);
    }
}

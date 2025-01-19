package com.telran.summery1701.translator;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private CustomFileWriter writer;
    private CustomFileReader reader;

    public Dictionary(CustomFileWriter writer, CustomFileReader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public void updateTranslation(String original, String translated, Language language) {
        Map<String, String> map = new HashMap<>();
        map.put(original, translated);
        writer.writeDictionary(language, map);
    }

    public String getTranslated(Language language, String origin) {
        Map<String, String> stringStringMap = reader.readDictionary(language);
        return stringStringMap.getOrDefault(origin, origin);
    }


}

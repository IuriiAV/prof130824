package com.telran.homework.homework13.translator;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private TranslatorFileWriter writer;
    private TranslatorFileReader reader;

    public Dictionary(TranslatorFileWriter writer, TranslatorFileReader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public void update(String original, String translate, Language language) {
        Map<String, String> words = new HashMap<>();
        words.put(original, translate);
        writer.writeDictionary(language, words);
    }

    public String getTranslate(Language language, String original) {
        Map<String, String> map = reader.readDictionary(language);
        return map.getOrDefault(original, original);
    }
}

package com.telran.summary7.translator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {

    private static Dictionary dictionary;


    @BeforeEach
    public void init() {
        CustomFileWriter customFileWriter = new CustomFileWriter();
        CustomFileReader customFileReader = new CustomFileReader();
        dictionary = new Dictionary(customFileWriter, customFileReader);
    }

    @Test
    public void testAddWordToDictionary() {
        String original = "Привет";
        String translate = "Hello";
        String notTranslate = dictionary.getTranslate(original, Language.ENGLISH);
        assertEquals(original,notTranslate);
        dictionary.update(original,translate,Language.ENGLISH);
        String translated = dictionary.getTranslate(original, Language.ENGLISH);
        assertEquals(translate,translated);
    }
}
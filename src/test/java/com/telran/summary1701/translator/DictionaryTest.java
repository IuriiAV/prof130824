package com.telran.summary1701.translator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {

    private static Dictionary dictionary;

    @BeforeEach
    private void init() {
        CustomFileWriter customFileWriter = new CustomFileWriter();
        CustomFileReader customFileReader = new CustomFileReader();
       dictionary = new Dictionary(customFileWriter, customFileReader);
    }
    @Test
    public void testAddWordToDictionary() {
        String original = "Привет";
        String translate = "Hello";

        String notTranslated = dictionary.getTranslate(Language.ENGLISH, original);
        assertEquals(original, notTranslated);

        dictionary.update(original,translate,Language.ENGLISH);
        String translated = dictionary.getTranslate(Language.ENGLISH, original);
        assertEquals(translate, translated);
    }

}
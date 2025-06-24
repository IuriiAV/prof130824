package com.telran.summary1701.translator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {

    private static Dictionary dictionary;

    private static String path;

    private static Properties properties;

    @BeforeEach
    private void init() {
        properties = getProperties();
        path = properties.getProperty("path");
        for (Language value : Language.values()) {
            Path path1 = Path.of(path, value.getFileName());
            File file = path1.toFile();
            if (file.exists()) {
                file.delete();
            }
            try {
                boolean newFile = file.createNewFile();
            } catch (IOException e) {

            }
        }
        CustomFileWriter customFileWriter = new CustomFileWriter(path);
        CustomFileReader customFileReader = new CustomFileReader(path);
        dictionary = new Dictionary(customFileWriter, customFileReader);
    }

    private static Properties getProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("/Users/iurii/Downloads/pro130824/src/test/resources/application.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    @Test
    public void testAddWordToDictionary() {
        String original = properties.getProperty("original");
        String translate = properties.getProperty("translate");

        String notTranslated = dictionary.getTranslate(Language.ENGLISH, original);
        assertEquals(original, notTranslated);

        dictionary.update(original, translate, Language.ENGLISH);
        String translated = dictionary.getTranslate(Language.ENGLISH, original);
        assertEquals(translate, translated);
    }

}
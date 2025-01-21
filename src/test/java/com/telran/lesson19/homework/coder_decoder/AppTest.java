package com.telran.lesson19.homework.coder_decoder;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class AppTest {

    public static Path originalFile;

    public static Path encodedFile;

    public static Path decodedFile;

    @BeforeAll
    public static void init() throws IOException {
        originalFile = Path.of("/Users/dogoda/java/prof130824/src/main/java/com/telran/lesson19/homework/coder_decoder/originalText.md");
        encodedFile = Files.createTempFile("encoded", ".txt");
        decodedFile = Files.createTempFile("decoded", ".txt");
    }

    @Test
    public void encoder() {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        encoder.encodeFile(originalFile.toString(), encodedFile.toString());
        decoder.decodeFile(encodedFile.toString(), decodedFile.toString());

        try (
                BufferedReader readerOriginal = new BufferedReader(new InputStreamReader(new FileInputStream(originalFile.toString())));
                BufferedReader readerDecoded = new BufferedReader(new InputStreamReader(new FileInputStream(decodedFile.toString())))
        ) {
            StringBuilder builderOriginal = new StringBuilder();
            while (readerOriginal.ready()) {
                builderOriginal.append(readerOriginal.readLine()).append("\n");
            }

            StringBuilder builderDecoded = new StringBuilder();
            while (readerDecoded.ready()) {
                builderDecoded.append(readerDecoded.readLine()).append("\n");
            }

            Assertions.assertEquals(0, builderOriginal.compareTo(builderDecoded));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

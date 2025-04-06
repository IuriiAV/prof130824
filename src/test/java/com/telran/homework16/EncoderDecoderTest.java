package com.telran.homework16;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class EncoderDecoderTest {

    private static final String ORIGINAL = "src/test/java/com/telran/homework16/original.txt";
    private static final String ENCODED = "src/test/java/com/telran/homework16/encoded.txt";
    private static final String DECODED = "src/test/java/com/telran/homework16/decoded.txt";

    EncoderDecoder encoderDecoder = new EncoderDecoder();

    @AfterEach
    void deleteFiles() {
        try {
            Files.deleteIfExists(Path.of(ENCODED));
            Files.deleteIfExists(Path.of(DECODED));
        } catch (IOException e) {
            e.getMessage();
        }
    }

    @Test
    void testEncodedDecodedCycle() {
        try {
            encoderDecoder.encode(ORIGINAL, ENCODED);
            encoderDecoder.decode(ENCODED, DECODED);

            String originalText = Files.readString(Path.of(ORIGINAL));
            String decodedText = Files.readString(Path.of(DECODED));

            assertEquals(originalText, decodedText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}